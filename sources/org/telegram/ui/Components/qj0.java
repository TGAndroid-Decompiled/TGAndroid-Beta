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
public final class qj0 extends FrameLayout {
    public pj0 E;
    public pj0 F;
    public nj0 G;
    public final ArrayList H;
    public final ArrayList I;
    public ta0 J;
    public final org.telegram.ui.ActionBar.f6 K;
    public int f27324a;
    public final int f27325b;
    public final MessageObject f27326c;
    public final TLRPC.Reaction d;
    public final ij0 e;
    public final jj0 f27327f;
    public final lj0 h;
    public final ArrayList f27328n;
    public final LongSparseArray f27329r;
    public String f27330s;
    public boolean v;
    public boolean f27331w;
    public boolean f27332x;
    public oj0 f27333y;

    public qj0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f27328n = new ArrayList();
        this.f27329r = new LongSparseArray();
        this.f27332x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f27325b = i10;
        this.f27326c = messageObject;
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
        this.f27324a = i11;
        ij0 ij0Var = new ij0(this, context, f6Var);
        this.e = ij0Var;
        s4.c0 c0Var = new s4.c0();
        ij0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            ij0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18952i6, false)));
        }
        jj0 jj0Var = new jj0(this, i10, context, f6Var, z10);
        this.f27327f = jj0Var;
        ij0Var.setAdapter(jj0Var);
        ij0Var.setOnItemClickListener(new j(this, 10));
        ij0Var.setOnItemLongClickListener(new lv(this, 14));
        ij0Var.j(new kj0(this, c0Var));
        ij0Var.setVerticalScrollBarEnabled(true);
        ij0Var.setAlpha(0.0f);
        addView(ij0Var, w7.x5.c(-1.0f, -1));
        lj0 lj0Var = new lj0(this, context, f6Var);
        this.h = lj0Var;
        lj0Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f18952i6, -1);
        lj0Var.setIsSingleCell(true);
        lj0Var.setItemsCount(this.f27324a);
        addView(lj0Var, w7.x5.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(zg.p0.d(reaction));
            i();
        }
        if (arrayList.isEmpty()) {
            i12 = 16;
        } else {
            i12 = 23;
        }
        lj0Var.setViewType(i12);
    }

    public static void a(qj0 qj0Var, TLObject tLObject) {
        ArrayList arrayList = qj0Var.H;
        LongSparseArray longSparseArray = qj0Var.f27329r;
        ArrayList arrayList2 = qj0Var.f27328n;
        int i10 = qj0Var.f27325b;
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
                zg.p0 d = zg.p0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f49151g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (qj0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                qj0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.f7(12)));
            qj0Var.f27327f.l();
            if (!qj0Var.f27331w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(qr.f27380f);
                duration.addUpdateListener(new h70(qj0Var, 5));
                duration.addListener(new jd0(qj0Var, 6));
                duration.start();
                qj0Var.j();
                qj0Var.f27331w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            qj0Var.f27330s = str;
            if (str == null) {
                qj0Var.f27332x = false;
            }
            qj0Var.v = false;
            return;
        }
        qj0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f27325b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f27326c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f18214id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f27330s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 11), 64);
    }

    public final void d(org.telegram.ui.we weVar) {
        this.G = weVar;
    }

    public final void e(org.telegram.ui.c7 c7Var) {
        this.f27333y = c7Var;
    }

    public final void f(org.telegram.ui.dg dgVar) {
        this.F = dgVar;
    }

    public final void g(org.telegram.ui.cg cgVar) {
        this.E = cgVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f27328n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fj0 fj0Var = (fj0) it.next();
                TLObject tLObject = fj0Var.f23952a;
                if (fj0Var.f23954c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == fj0Var.f23953b) {
                                messagePeerReaction.date = fj0Var.f23954c;
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
            fj0 fj0Var2 = (fj0) it2.next();
            long j3 = fj0Var2.f23953b;
            TLObject tLObject2 = fj0Var2.f23952a;
            LongSparseArray longSparseArray = this.f27329r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f18268id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f18121id;
                }
                tL_messagePeerReaction.date = fj0Var2.f23954c;
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
        this.f27327f.l();
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
            i10 = this.f27325b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(o5.f(i10, ((zg.p0) arrayList3.get(i11)).f49151g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f18141id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f18141id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        ta0 ta0Var = new ta0(this.f27325b, getContext(), this.K, arrayList2, 1);
        this.J = ta0Var;
        ta0Var.K = false;
    }

    public final void j() {
        if (this.f27333y != null) {
            int size = this.f27328n.size();
            if (size == 0) {
                size = this.f27324a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            ta0 ta0Var = this.J;
            if (ta0Var != null) {
                dp = org.telegram.messenger.w1.C(8.0f, ta0Var.getMeasuredHeight(), dp);
            }
            ij0 ij0Var = this.e;
            if (ij0Var.getMeasuredHeight() != 0) {
                dp = Math.min(ij0Var.getMeasuredHeight(), dp);
            }
            this.f27333y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f27331w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f27324a = i10;
        this.h.setItemsCount(i10);
    }
}
