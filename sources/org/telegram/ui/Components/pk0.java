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
    public nb0 J;
    public final org.telegram.ui.ActionBar.g6 K;
    public int f29578a;
    public final int f29579b;
    public final MessageObject f29580c;
    public final TLRPC.Reaction d;
    public final hk0 e;
    public final ik0 f29581f;
    public final kk0 h;
    public final ArrayList f29582n;
    public final LongSparseArray f29583r;
    public String f29584s;
    public boolean v;
    public boolean f29585w;
    public boolean f29586x;
    public nk0 f29587y;

    public pk0(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f29582n = new ArrayList();
        this.f29583r = new LongSparseArray();
        this.f29586x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f29579b = i10;
        this.f29580c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.K = g6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f29578a = i11;
        hk0 hk0Var = new hk0(this, context, g6Var);
        this.e = hk0Var;
        s4.b0 b0Var = new s4.b0();
        hk0Var.setLayoutManager(b0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            hk0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21273i6, false)));
        }
        ik0 ik0Var = new ik0(this, i10, context, g6Var, z10);
        this.f29581f = ik0Var;
        hk0Var.setAdapter(ik0Var);
        hk0Var.setOnItemClickListener(new j(this, 10));
        hk0Var.setOnItemLongClickListener(new rv(this, 15));
        hk0Var.j(new jk0(this, b0Var));
        hk0Var.setVerticalScrollBarEnabled(true);
        hk0Var.setAlpha(0.0f);
        addView(hk0Var, w7.z5.c(-1.0f, -1));
        kk0 kk0Var = new kk0(this, context, g6Var);
        this.h = kk0Var;
        kk0Var.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f21273i6, -1);
        kk0Var.setIsSingleCell(true);
        kk0Var.setItemsCount(this.f29578a);
        addView(kk0Var, w7.z5.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(ah.i1.d(reaction));
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
        LongSparseArray longSparseArray = pk0Var.f29583r;
        ArrayList arrayList2 = pk0Var.f29582n;
        int i10 = pk0Var.f29579b;
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
                ah.i1 d = ah.i1.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f785g != 0) {
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
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.v8(18)));
            pk0Var.f29581f.l();
            if (!pk0Var.f29585w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(zr.f33337f);
                duration.addUpdateListener(new b80(pk0Var, 6));
                duration.addListener(new g60(pk0Var, 13));
                duration.start();
                pk0Var.j();
                pk0Var.f29585w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            pk0Var.f29584s = str;
            if (str == null) {
                pk0Var.f29586x = false;
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
        int i10 = this.f29579b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f29580c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f20437id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f29584s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 11), 64);
    }

    public final void d(org.telegram.ui.pe peVar) {
        this.G = peVar;
    }

    public final void e(org.telegram.ui.e7 e7Var) {
        this.f29587y = e7Var;
    }

    public final void f(org.telegram.ui.uf ufVar) {
        this.F = ufVar;
    }

    public final void g(org.telegram.ui.tf tfVar) {
        this.E = tfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f29582n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ek0 ek0Var = (ek0) it.next();
                TLObject tLObject = ek0Var.f26070a;
                if (ek0Var.f26072c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == ek0Var.f26071b) {
                                messagePeerReaction.date = ek0Var.f26072c;
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
            long j10 = ek0Var2.f26071b;
            TLObject tLObject2 = ek0Var2.f26070a;
            LongSparseArray longSparseArray = this.f29583r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f20491id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f20344id;
                }
                tL_messagePeerReaction.date = ek0Var2.f26072c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.v8(17)));
        this.f29581f.l();
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
            i10 = this.f29579b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(p5.f(i10, ((ah.i1) arrayList3.get(i11)).f785g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f20364id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f20364id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        nb0 nb0Var = new nb0(this.f29579b, 1, getContext(), arrayList2, this.K);
        this.J = nb0Var;
        nb0Var.K = false;
    }

    public final void j() {
        if (this.f29587y != null) {
            int size = this.f29582n.size();
            if (size == 0) {
                size = this.f29578a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            nb0 nb0Var = this.J;
            if (nb0Var != null) {
                dp = org.telegram.messenger.v0.C(8.0f, nb0Var.getMeasuredHeight(), dp);
            }
            hk0 hk0Var = this.e;
            if (hk0Var.getMeasuredHeight() != 0) {
                dp = Math.min(hk0Var.getMeasuredHeight(), dp);
            }
            this.f29587y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f29585w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f29578a = i10;
        this.h.setItemsCount(i10);
    }
}
