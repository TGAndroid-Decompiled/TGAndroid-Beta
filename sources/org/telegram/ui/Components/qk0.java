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
public final class qk0 extends FrameLayout {
    public pk0 E;
    public pk0 F;
    public nk0 G;
    public final ArrayList H;
    public final ArrayList I;
    public pb0 J;
    public final org.telegram.ui.ActionBar.g6 K;
    public int f29926a;
    public final int f29927b;
    public final MessageObject f29928c;
    public final TLRPC.Reaction d;
    public final ik0 e;
    public final jk0 f29929f;
    public final lk0 h;
    public final ArrayList f29930n;
    public final LongSparseArray f29931r;
    public String f29932s;
    public boolean v;
    public boolean f29933w;
    public boolean f29934x;
    public ok0 f29935y;

    public qk0(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f29930n = new ArrayList();
        this.f29931r = new LongSparseArray();
        this.f29934x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f29927b = i10;
        this.f29928c = messageObject;
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
        this.f29926a = i11;
        ik0 ik0Var = new ik0(this, context, g6Var);
        this.e = ik0Var;
        s4.b0 b0Var = new s4.b0();
        ik0Var.setLayoutManager(b0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            ik0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21272i6, false)));
        }
        jk0 jk0Var = new jk0(this, i10, context, g6Var, z10);
        this.f29929f = jk0Var;
        ik0Var.setAdapter(jk0Var);
        ik0Var.setOnItemClickListener(new j(this, 10));
        ik0Var.setOnItemLongClickListener(new tv(this, 15));
        ik0Var.j(new kk0(this, b0Var));
        ik0Var.setVerticalScrollBarEnabled(true);
        ik0Var.setAlpha(0.0f);
        addView(ik0Var, w7.z5.c(-1.0f, -1));
        lk0 lk0Var = new lk0(this, context, g6Var);
        this.h = lk0Var;
        lk0Var.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f21272i6, -1);
        lk0Var.setIsSingleCell(true);
        lk0Var.setItemsCount(this.f29926a);
        addView(lk0Var, w7.z5.c(-1.0f, -1));
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
        lk0Var.setViewType(i12);
    }

    public static void a(qk0 qk0Var, TLObject tLObject) {
        ArrayList arrayList = qk0Var.H;
        LongSparseArray longSparseArray = qk0Var.f29931r;
        ArrayList arrayList2 = qk0Var.f29930n;
        int i10 = qk0Var.f29927b;
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
            if (qk0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                qk0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.v8(18)));
            qk0Var.f29929f.l();
            if (!qk0Var.f29933w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(bs.f25133f);
                duration.addUpdateListener(new d80(qk0Var, 6));
                duration.addListener(new i60(qk0Var, 13));
                duration.start();
                qk0Var.j();
                qk0Var.f29933w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            qk0Var.f29932s = str;
            if (str == null) {
                qk0Var.f29934x = false;
            }
            qk0Var.v = false;
            return;
        }
        qk0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f29927b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f29928c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f20436id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f29932s;
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
        this.f29935y = e7Var;
    }

    public final void f(org.telegram.ui.uf ufVar) {
        this.F = ufVar;
    }

    public final void g(org.telegram.ui.tf tfVar) {
        this.E = tfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f29930n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fk0 fk0Var = (fk0) it.next();
                TLObject tLObject = fk0Var.f26369a;
                if (fk0Var.f26371c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == fk0Var.f26370b) {
                                messagePeerReaction.date = fk0Var.f26371c;
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
            fk0 fk0Var2 = (fk0) it2.next();
            long j10 = fk0Var2.f26370b;
            TLObject tLObject2 = fk0Var2.f26369a;
            LongSparseArray longSparseArray = this.f29931r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f20490id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f20343id;
                }
                tL_messagePeerReaction.date = fk0Var2.f26371c;
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
        this.f29929f.l();
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
            i10 = this.f29927b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(r5.f(i10, ((ah.i1) arrayList3.get(i11)).f785g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f20363id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f20363id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        pb0 pb0Var = new pb0(this.f29927b, 1, getContext(), arrayList2, this.K);
        this.J = pb0Var;
        pb0Var.K = false;
    }

    public final void j() {
        if (this.f29935y != null) {
            int size = this.f29930n.size();
            if (size == 0) {
                size = this.f29926a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            pb0 pb0Var = this.J;
            if (pb0Var != null) {
                dp = org.telegram.messenger.v0.C(8.0f, pb0Var.getMeasuredHeight(), dp);
            }
            ik0 ik0Var = this.e;
            if (ik0Var.getMeasuredHeight() != 0) {
                dp = Math.min(ik0Var.getMeasuredHeight(), dp);
            }
            this.f29935y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f29933w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f29926a = i10;
        this.h.setItemsCount(i10);
    }
}
