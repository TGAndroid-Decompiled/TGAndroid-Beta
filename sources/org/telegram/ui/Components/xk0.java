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
public final class xk0 extends FrameLayout {
    public wk0 E;
    public wk0 F;
    public uk0 G;
    public final ArrayList H;
    public final ArrayList I;
    public zb0 J;
    public final org.telegram.ui.ActionBar.c6 K;
    public int f32794a;
    public final int f32795b;
    public final MessageObject f32796c;
    public final TLRPC.Reaction d;
    public final pk0 f32797e;
    public final qk0 f32798f;
    public final sk0 h;
    public final ArrayList f32799n;
    public final LongSparseArray f32800r;
    public String f32801s;
    public boolean v;
    public boolean f32802w;
    public boolean f32803x;
    public vk0 f32804y;

    public xk0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f32799n = new ArrayList();
        this.f32800r = new LongSparseArray();
        this.f32803x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f32795b = i10;
        this.f32796c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.K = c6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f32794a = i11;
        pk0 pk0Var = new pk0(this, context, c6Var);
        this.f32797e = pk0Var;
        s4.d0 d0Var = new s4.d0();
        pk0Var.setLayoutManager(d0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            pk0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20650i6, false)));
        }
        qk0 qk0Var = new qk0(this, i10, context, c6Var, z10);
        this.f32798f = qk0Var;
        pk0Var.setAdapter(qk0Var);
        pk0Var.setOnItemClickListener(new j(this, 10));
        pk0Var.setOnItemLongClickListener(new ew(this, 15));
        pk0Var.j(new rk0(this, d0Var));
        pk0Var.setVerticalScrollBarEnabled(true);
        pk0Var.setAlpha(0.0f);
        addView(pk0Var, w7.w5.d(-1.0f, -1));
        sk0 sk0Var = new sk0(this, context, c6Var);
        this.h = sk0Var;
        sk0Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f20650i6, -1);
        sk0Var.setIsSingleCell(true);
        sk0Var.setItemsCount(this.f32794a);
        addView(sk0Var, w7.w5.d(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(zg.n0.d(reaction));
            i();
        }
        if (arrayList.isEmpty()) {
            i12 = 16;
        } else {
            i12 = 23;
        }
        sk0Var.setViewType(i12);
    }

    public static void a(xk0 xk0Var, TLObject tLObject) {
        ArrayList arrayList = xk0Var.H;
        LongSparseArray longSparseArray = xk0Var.f32800r;
        ArrayList arrayList2 = xk0Var.f32799n;
        int i10 = xk0Var.f32795b;
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
                zg.n0 d = zg.n0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f54842g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (xk0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                xk0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.h7(13)));
            xk0Var.f32798f.l();
            if (!xk0Var.f32802w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(js.f27627f);
                duration.addUpdateListener(new m80(xk0Var, 6));
                duration.addListener(new zd0(xk0Var, 7));
                duration.start();
                xk0Var.j();
                xk0Var.f32802w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            xk0Var.f32801s = str;
            if (str == null) {
                xk0Var.f32803x = false;
            }
            xk0Var.v = false;
            return;
        }
        xk0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f32795b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f32796c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f19895id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f32801s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new y1(this, 11), 64);
    }

    public final void d(org.telegram.ui.ve veVar) {
        this.G = veVar;
    }

    public final void e(org.telegram.ui.d7 d7Var) {
        this.f32804y = d7Var;
    }

    public final void f(org.telegram.ui.gg ggVar) {
        this.F = ggVar;
    }

    public final void g(org.telegram.ui.fg fgVar) {
        this.E = fgVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f32799n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mk0 mk0Var = (mk0) it.next();
                TLObject tLObject = mk0Var.f28597a;
                if (mk0Var.f28599c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == mk0Var.f28598b) {
                                messagePeerReaction.date = mk0Var.f28599c;
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
            mk0 mk0Var2 = (mk0) it2.next();
            long j3 = mk0Var2.f28598b;
            TLObject tLObject2 = mk0Var2.f28597a;
            LongSparseArray longSparseArray = this.f32800r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f19949id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f19802id;
                }
                tL_messagePeerReaction.date = mk0Var2.f28599c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.h7(12)));
        this.f32798f.l();
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
            i10 = this.f32795b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(s5.f(i10, ((zg.n0) arrayList3.get(i11)).f54842g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f19822id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f19822id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        zb0 zb0Var = new zb0(this.f32795b, 1, getContext(), arrayList2, this.K);
        this.J = zb0Var;
        zb0Var.K = false;
    }

    public final void j() {
        if (this.f32804y != null) {
            int size = this.f32799n.size();
            if (size == 0) {
                size = this.f32794a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            zb0 zb0Var = this.J;
            if (zb0Var != null) {
                dp = org.telegram.messenger.v0.C(8.0f, zb0Var.getMeasuredHeight(), dp);
            }
            pk0 pk0Var = this.f32797e;
            if (pk0Var.getMeasuredHeight() != 0) {
                dp = Math.min(pk0Var.getMeasuredHeight(), dp);
            }
            this.f32804y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f32802w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f32794a = i10;
        this.h.setItemsCount(i10);
    }
}
