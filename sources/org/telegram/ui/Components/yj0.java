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
public final class yj0 extends FrameLayout {
    public xj0 B;
    public xj0 C;
    public vj0 D;
    public final ArrayList E;
    public final ArrayList F;
    public va0 G;
    public final org.telegram.ui.ActionBar.f6 H;
    public int f31028a;
    public final int f31029b;
    public final MessageObject f31030c;
    public final TLRPC.Reaction d;
    public final qj0 e;
    public final rj0 f31031f;
    public final tj0 h;
    public final ArrayList f31032n;
    public final LongSparseArray f31033r;
    public String f31034s;
    public boolean v;
    public boolean f31035w;
    public boolean f31036x;
    public wj0 f31037y;

    public yj0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z4) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f31032n = new ArrayList();
        this.f31033r = new LongSparseArray();
        this.f31036x = true;
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = new ArrayList();
        this.f31029b = i10;
        this.f31030c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.H = f6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f31028a = i11;
        qj0 qj0Var = new qj0(this, context, f6Var);
        this.e = qj0Var;
        f2.i0 i0Var = new f2.i0();
        qj0Var.setLayoutManager(i0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            qj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false)));
        }
        rj0 rj0Var = new rj0(this, i10, context, f6Var, z4);
        this.f31031f = rj0Var;
        qj0Var.setAdapter(rj0Var);
        qj0Var.setOnItemClickListener(new k(this, 10));
        qj0Var.setOnItemLongClickListener(new fv(this, 14));
        qj0Var.j(new sj0(this, i0Var));
        qj0Var.setVerticalScrollBarEnabled(true);
        qj0Var.setAlpha(0.0f);
        addView(qj0Var, k7.b6.c(-1.0f, -1));
        tj0 tj0Var = new tj0(this, context, f6Var);
        this.h = tj0Var;
        tj0Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f19996i6, -1);
        tj0Var.setIsSingleCell(true);
        tj0Var.setItemsCount(this.f31028a);
        addView(tj0Var, k7.b6.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(mg.q0.d(reaction));
            i();
        }
        if (arrayList.isEmpty()) {
            i12 = 16;
        } else {
            i12 = 23;
        }
        tj0Var.setViewType(i12);
    }

    public static void a(yj0 yj0Var, TLObject tLObject) {
        ArrayList arrayList = yj0Var.E;
        LongSparseArray longSparseArray = yj0Var.f31033r;
        ArrayList arrayList2 = yj0Var.f31032n;
        int i10 = yj0Var.f31029b;
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
                mg.q0 d = mg.q0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f14108g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (yj0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                yj0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new lf.d(18)));
            yj0Var.f31031f.l();
            if (!yj0Var.f31035w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(nr.f27346f);
                duration.addUpdateListener(new i70(yj0Var, 5));
                duration.addListener(new nd0(yj0Var, 5));
                duration.start();
                yj0Var.j();
                yj0Var.f31035w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            yj0Var.f31034s = str;
            if (str == null) {
                yj0Var.f31036x = false;
            }
            yj0Var.v = false;
            return;
        }
        yj0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f31029b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f31030c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f19277id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f31034s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new y1(this, 11), 64);
    }

    public final void d(org.telegram.ui.te teVar) {
        this.D = teVar;
    }

    public final void e(org.telegram.ui.d7 d7Var) {
        this.f31037y = d7Var;
    }

    public final void f(org.telegram.ui.vf vfVar) {
        this.C = vfVar;
    }

    public final void g(org.telegram.ui.uf ufVar) {
        this.B = ufVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f31032n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nj0 nj0Var = (nj0) it.next();
                TLObject tLObject = nj0Var.f27295a;
                if (nj0Var.f27297c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == nj0Var.f27296b) {
                                messagePeerReaction.date = nj0Var.f27297c;
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
            nj0 nj0Var2 = (nj0) it2.next();
            long j10 = nj0Var2.f27296b;
            TLObject tLObject2 = nj0Var2.f27295a;
            LongSparseArray longSparseArray = this.f31033r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f19331id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f19184id;
                }
                tL_messagePeerReaction.date = nj0Var2.f27297c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new lf.d(17)));
        this.f31031f.l();
        j();
    }

    public final void i() {
        int i10;
        ArrayList arrayList = this.F;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (true) {
            ArrayList arrayList3 = this.E;
            int size = arrayList3.size();
            i10 = this.f31029b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(l5.f(i10, ((mg.q0) arrayList3.get(i11)).f14108g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f19204id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f19204id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        va0 va0Var = new va0(this.f31029b, getContext(), this.H, arrayList2, 1);
        this.G = va0Var;
        va0Var.H = false;
    }

    public final void j() {
        if (this.f31037y != null) {
            int size = this.f31032n.size();
            if (size == 0) {
                size = this.f31028a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            va0 va0Var = this.G;
            if (va0Var != null) {
                dp = org.telegram.messenger.y3.C(8.0f, va0Var.getMeasuredHeight(), dp);
            }
            qj0 qj0Var = this.e;
            if (qj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(qj0Var.getMeasuredHeight(), dp);
            }
            this.f31037y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f31035w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f31028a = i10;
        this.h.setItemsCount(i10);
    }
}
