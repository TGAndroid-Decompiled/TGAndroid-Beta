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
public final class nk0 extends FrameLayout {
    public mk0 E;
    public mk0 F;
    public kk0 G;
    public final ArrayList H;
    public final ArrayList I;
    public ob0 J;
    public final org.telegram.ui.ActionBar.d6 K;
    public int f28832a;
    public final int f28833b;
    public final MessageObject f28834c;
    public final TLRPC.Reaction d;
    public final fk0 e;
    public final gk0 f28835f;
    public final ik0 h;
    public final ArrayList f28836n;
    public final LongSparseArray f28837r;
    public String f28838s;
    public boolean v;
    public boolean f28839w;
    public boolean f28840x;
    public lk0 f28841y;

    public nk0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f28836n = new ArrayList();
        this.f28837r = new LongSparseArray();
        this.f28840x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f28833b = i10;
        this.f28834c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.K = d6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f28832a = i11;
        fk0 fk0Var = new fk0(this, context, d6Var);
        this.e = fk0Var;
        s4.b0 b0Var = new s4.b0();
        fk0Var.setLayoutManager(b0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            fk0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21083i6, false)));
        }
        gk0 gk0Var = new gk0(this, i10, context, d6Var, z10);
        this.f28835f = gk0Var;
        fk0Var.setAdapter(gk0Var);
        fk0Var.setOnItemClickListener(new j(this, 10));
        fk0Var.setOnItemLongClickListener(new tv(this, 15));
        fk0Var.j(new hk0(this, b0Var));
        fk0Var.setVerticalScrollBarEnabled(true);
        fk0Var.setAlpha(0.0f);
        addView(fk0Var, w7.z5.c(-1.0f, -1));
        ik0 ik0Var = new ik0(this, context, d6Var);
        this.h = ik0Var;
        ik0Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f21083i6, -1);
        ik0Var.setIsSingleCell(true);
        ik0Var.setItemsCount(this.f28832a);
        addView(ik0Var, w7.z5.c(-1.0f, -1));
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
        ik0Var.setViewType(i12);
    }

    public static void a(nk0 nk0Var, TLObject tLObject) {
        ArrayList arrayList = nk0Var.H;
        LongSparseArray longSparseArray = nk0Var.f28837r;
        ArrayList arrayList2 = nk0Var.f28836n;
        int i10 = nk0Var.f28833b;
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
                if (d.f784g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (nk0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                nk0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.v8(18)));
            nk0Var.f28835f.l();
            if (!nk0Var.f28839w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(bs.f25025f);
                duration.addUpdateListener(new b80(nk0Var, 6));
                duration.addListener(new c80(nk0Var, 12));
                duration.start();
                nk0Var.j();
                nk0Var.f28839w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            nk0Var.f28838s = str;
            if (str == null) {
                nk0Var.f28840x = false;
            }
            nk0Var.v = false;
            return;
        }
        nk0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f28833b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f28834c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f20373id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f28838s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new y1(this, 11), 64);
    }

    public final void d(org.telegram.ui.pe peVar) {
        this.G = peVar;
    }

    public final void e(org.telegram.ui.e7 e7Var) {
        this.f28841y = e7Var;
    }

    public final void f(org.telegram.ui.uf ufVar) {
        this.F = ufVar;
    }

    public final void g(org.telegram.ui.tf tfVar) {
        this.E = tfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f28836n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ck0 ck0Var = (ck0) it.next();
                TLObject tLObject = ck0Var.f25215a;
                if (ck0Var.f25217c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == ck0Var.f25216b) {
                                messagePeerReaction.date = ck0Var.f25217c;
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
            ck0 ck0Var2 = (ck0) it2.next();
            long j10 = ck0Var2.f25216b;
            TLObject tLObject2 = ck0Var2.f25215a;
            LongSparseArray longSparseArray = this.f28837r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f20427id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f20280id;
                }
                tL_messagePeerReaction.date = ck0Var2.f25217c;
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
        this.f28835f.l();
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
            i10 = this.f28833b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(r5.f(i10, ((ah.i1) arrayList3.get(i11)).f784g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f20300id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f20300id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        ob0 ob0Var = new ob0(this.f28833b, 1, getContext(), arrayList2, this.K);
        this.J = ob0Var;
        ob0Var.K = false;
    }

    public final void j() {
        if (this.f28841y != null) {
            int size = this.f28836n.size();
            if (size == 0) {
                size = this.f28832a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            ob0 ob0Var = this.J;
            if (ob0Var != null) {
                dp = org.telegram.messenger.g0.C(8.0f, ob0Var.getMeasuredHeight(), dp);
            }
            fk0 fk0Var = this.e;
            if (fk0Var.getMeasuredHeight() != 0) {
                dp = Math.min(fk0Var.getMeasuredHeight(), dp);
            }
            this.f28841y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f28839w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f28832a = i10;
        this.h.setItemsCount(i10);
    }
}
