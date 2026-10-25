package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pk0 extends FrameLayout {
    public ok0 E;
    public ok0 F;
    public mk0 G;
    public final ArrayList H;
    public final ArrayList I;
    public mb0 J;
    public final org.telegram.ui.ActionBar.u6 K;
    public int f31582a;
    public final int f31583b;
    public final MessageObject f31584c;
    public final TLRPC.Reaction d;
    public final hk0 e;
    public final ik0 f31585f;
    public final kk0 h;
    public final ArrayList f31586n;
    public final LongSparseArray f31587r;
    public String f31588s;
    public boolean v;
    public boolean f31589w;
    public boolean f31590x;
    public nk0 f31591y;

    public pk0(Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f31586n = new ArrayList();
        this.f31587r = new LongSparseArray();
        this.f31590x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f31583b = i10;
        this.f31584c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.K = u6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f31582a = i11;
        hk0 hk0Var = new hk0(this, context, u6Var);
        this.e = hk0Var;
        s4.c0 c0Var = new s4.c0();
        hk0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            hk0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23446i6, false)));
        }
        ik0 ik0Var = new ik0(this, i10, context, u6Var, z10);
        this.f31585f = ik0Var;
        hk0Var.setAdapter(ik0Var);
        hk0Var.setOnItemClickListener(new j(this, 10));
        hk0Var.setOnItemLongClickListener(new tv(this, 17));
        hk0Var.j(new jk0(this, c0Var));
        hk0Var.setVerticalScrollBarEnabled(true);
        hk0Var.setAlpha(0.0f);
        addView(hk0Var, gb1.g(-1.0f, -1));
        kk0 kk0Var = new kk0(this, context, u6Var);
        this.h = kk0Var;
        kk0Var.e(org.telegram.ui.ActionBar.y6.G8, org.telegram.ui.ActionBar.y6.f23446i6, -1);
        kk0Var.setIsSingleCell(true);
        kk0Var.setItemsCount(this.f31582a);
        addView(kk0Var, gb1.g(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(bh.x0.d(reaction));
            i();
        }
        if (arrayList.isEmpty()) {
            i12 = 16;
        } else {
            i12 = 23;
        }
        kk0Var.setViewType(i12);
    }

    public static void a(pk0 pk0Var, TLObject tLObject) {
        ArrayList arrayList = pk0Var.H;
        LongSparseArray longSparseArray = pk0Var.f31587r;
        ArrayList arrayList2 = pk0Var.f31586n;
        int i10 = pk0Var.f31583b;
        if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
            TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
            MessagesController.getInstance(i10).putUsers(tL_messages_messageReactionsList.users, false);
            MessagesController.getInstance(i10).putChats(tL_messages_messageReactionsList.chats, false);
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < tL_messages_messageReactionsList.reactions.size(); i11++) {
                arrayList2.add(tL_messages_messageReactionsList.reactions.get(i11));
                long peerId = MessageObject.getPeerId(tL_messages_messageReactionsList.reactions.get(i11).peer_id);
                ArrayList arrayList3 = (ArrayList) longSparseArray.get(peerId);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    if (((TLRPC.MessagePeerReaction) arrayList3.get(i12)).reaction == null) {
                        arrayList3.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                bh.x0 d = bh.x0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f4209g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (pk0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                pk0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ag.e(19)));
            pk0Var.f31585f.l();
            if (!pk0Var.f31589w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(ds.f27584f);
                duration.addUpdateListener(new e80(pk0Var, 6));
                duration.addListener(new i10(pk0Var, 14));
                duration.start();
                pk0Var.j();
                pk0Var.f31589w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            pk0Var.f31588s = str;
            if (str == null) {
                pk0Var.f31590x = false;
            }
            pk0Var.v = false;
            return;
        }
        pk0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f31583b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f31584c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f22120id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f31588s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new b2(this, 11), 64);
    }

    public final void d(org.telegram.ui.pe peVar) {
        this.G = peVar;
    }

    public final void e(org.telegram.ui.e7 e7Var) {
        this.f31591y = e7Var;
    }

    public final void f(org.telegram.ui.uf ufVar) {
        this.F = ufVar;
    }

    public final void g(org.telegram.ui.tf tfVar) {
        this.E = tfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f31586n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ek0 ek0Var = (ek0) it.next();
                TLObject tLObject = ek0Var.f27890a;
                if (ek0Var.f27892c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == ek0Var.f27891b) {
                                messagePeerReaction.date = ek0Var.f27892c;
                                messagePeerReaction.dateIsSeen = true;
                                break;
                            }
                            i10++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ek0 ek0Var2 = (ek0) it2.next();
            long j10 = ek0Var2.f27891b;
            TLObject tLObject2 = ek0Var2.f27890a;
            LongSparseArray longSparseArray = this.f31587r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f22174id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f22027id;
                }
                tL_messagePeerReaction.date = ek0Var2.f27892c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new ag.e(18)));
        this.f31585f.l();
        j();
    }

    public final void i() {
        int i10;
        ArrayList arrayList = this.I;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (true) {
            ArrayList arrayList3 = this.H;
            int size = arrayList3.size();
            i10 = this.f31583b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(t5.f(i10, ((bh.x0) arrayList3.get(i11)).f4209g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f22047id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f22047id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        mb0 mb0Var = new mb0(this.f31583b, 1, getContext(), arrayList2, this.K);
        this.J = mb0Var;
        mb0Var.K = false;
    }

    public final void j() {
        if (this.f31591y != null) {
            int size = this.f31586n.size();
            if (size == 0) {
                size = this.f31582a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            mb0 mb0Var = this.J;
            if (mb0Var != null) {
                dp = org.telegram.messenger.t.D(8.0f, mb0Var.getMeasuredHeight(), dp);
            }
            hk0 hk0Var = this.e;
            if (hk0Var.getMeasuredHeight() != 0) {
                dp = Math.min(hk0Var.getMeasuredHeight(), dp);
            }
            this.f31591y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f31589w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f31582a = i10;
        this.h.setItemsCount(i10);
    }
}
