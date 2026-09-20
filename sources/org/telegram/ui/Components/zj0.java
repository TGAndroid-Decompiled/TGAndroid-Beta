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
public final class zj0 extends FrameLayout {
    public yj0 E;
    public yj0 F;
    public wj0 G;
    public final ArrayList H;
    public final ArrayList I;
    public bb0 J;
    public final org.telegram.ui.ActionBar.f6 K;
    public int f30840a;
    public final int f30841b;
    public final MessageObject f30842c;
    public final TLRPC.Reaction d;
    public final rj0 e;
    public final sj0 f30843f;
    public final uj0 h;
    public final ArrayList f30844n;
    public final LongSparseArray f30845r;
    public String f30846s;
    public boolean v;
    public boolean f30847w;
    public boolean f30848x;
    public xj0 f30849y;

    public zj0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f30844n = new ArrayList();
        this.f30845r = new LongSparseArray();
        this.f30848x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f30841b = i10;
        this.f30842c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.K = f6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f30840a = i11;
        rj0 rj0Var = new rj0(this, context, f6Var);
        this.e = rj0Var;
        s4.c0 c0Var = new s4.c0();
        rj0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            rj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19184i6, false)));
        }
        sj0 sj0Var = new sj0(this, i10, context, f6Var, z10);
        this.f30843f = sj0Var;
        rj0Var.setAdapter(sj0Var);
        rj0Var.setOnItemClickListener(new j(this, 10));
        rj0Var.setOnItemLongClickListener(new mv(this, 15));
        rj0Var.j(new tj0(this, c0Var));
        rj0Var.setVerticalScrollBarEnabled(true);
        rj0Var.setAlpha(0.0f);
        addView(rj0Var, w7.y5.c(-1.0f, -1));
        uj0 uj0Var = new uj0(this, context, f6Var);
        this.h = uj0Var;
        uj0Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f19184i6, -1);
        uj0Var.setIsSingleCell(true);
        uj0Var.setItemsCount(this.f30840a);
        addView(uj0Var, w7.y5.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(zg.o0.d(reaction));
            i();
        }
        if (arrayList.isEmpty()) {
            i12 = 16;
        } else {
            i12 = 23;
        }
        uj0Var.setViewType(i12);
    }

    public static void a(zj0 zj0Var, TLObject tLObject) {
        ArrayList arrayList = zj0Var.H;
        LongSparseArray longSparseArray = zj0Var.f30845r;
        ArrayList arrayList2 = zj0Var.f30844n;
        int i10 = zj0Var.f30841b;
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
                zg.o0 d = zg.o0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f49424g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (zj0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                zj0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.f7(12)));
            zj0Var.f30843f.l();
            if (!zj0Var.f30847w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(qr.f27642f);
                duration.addUpdateListener(new p70(zj0Var, 5));
                duration.addListener(new dd0(zj0Var, 7));
                duration.start();
                zj0Var.j();
                zj0Var.f30847w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            zj0Var.f30846s = str;
            if (str == null) {
                zj0Var.f30848x = false;
            }
            zj0Var.v = false;
            return;
        }
        zj0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f30841b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f30842c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f18421id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f30846s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 11), 64);
    }

    public final void d(org.telegram.ui.qe qeVar) {
        this.G = qeVar;
    }

    public final void e(org.telegram.ui.b7 b7Var) {
        this.f30849y = b7Var;
    }

    public final void f(org.telegram.ui.cg cgVar) {
        this.F = cgVar;
    }

    public final void g(org.telegram.ui.bg bgVar) {
        this.E = bgVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f30844n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oj0 oj0Var = (oj0) it.next();
                TLObject tLObject = oj0Var.f26954a;
                if (oj0Var.f26956c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == oj0Var.f26955b) {
                                messagePeerReaction.date = oj0Var.f26956c;
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
            oj0 oj0Var2 = (oj0) it2.next();
            long j3 = oj0Var2.f26955b;
            TLObject tLObject2 = oj0Var2.f26954a;
            LongSparseArray longSparseArray = this.f30845r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f18475id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f18328id;
                }
                tL_messagePeerReaction.date = oj0Var2.f26956c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.f7(11)));
        this.f30843f.l();
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
            i10 = this.f30841b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(p5.f(i10, ((zg.o0) arrayList3.get(i11)).f49424g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f18348id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f18348id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        bb0 bb0Var = new bb0(this.f30841b, getContext(), this.K, arrayList2, 1);
        this.J = bb0Var;
        bb0Var.K = false;
    }

    public final void j() {
        if (this.f30849y != null) {
            int size = this.f30844n.size();
            if (size == 0) {
                size = this.f30840a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            bb0 bb0Var = this.J;
            if (bb0Var != null) {
                dp = org.telegram.messenger.l0.C(8.0f, bb0Var.getMeasuredHeight(), dp);
            }
            rj0 rj0Var = this.e;
            if (rj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(rj0Var.getMeasuredHeight(), dp);
            }
            this.f30849y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f30847w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f30840a = i10;
        this.h.setItemsCount(i10);
    }
}
