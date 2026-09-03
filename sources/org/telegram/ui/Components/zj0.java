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
    public yj0 B;
    public yj0 C;
    public wj0 D;
    public final ArrayList E;
    public final ArrayList F;
    public xa0 G;
    public final org.telegram.ui.ActionBar.g6 H;
    public int f33949a;
    public final int f33950b;
    public final MessageObject f33951c;
    public final TLRPC.Reaction d;
    public final rj0 f33952e;
    public final sj0 f33953f;
    public final uj0 h;
    public final ArrayList f33954n;
    public final LongSparseArray f33955r;
    public String f33956s;
    public boolean v;
    public boolean f33957w;
    public boolean f33958x;
    public xj0 f33959y;

    public zj0(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z4) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f33954n = new ArrayList();
        this.f33955r = new LongSparseArray();
        this.f33958x = true;
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = new ArrayList();
        this.f33950b = i10;
        this.f33951c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.H = g6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f33949a = i11;
        rj0 rj0Var = new rj0(this, context, g6Var);
        this.f33952e = rj0Var;
        f2.j0 j0Var = new f2.j0();
        rj0Var.setLayoutManager(j0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            rj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false)));
        }
        sj0 sj0Var = new sj0(this, i10, context, g6Var, z4);
        this.f33953f = sj0Var;
        rj0Var.setAdapter(sj0Var);
        rj0Var.setOnItemClickListener(new k(this, 10));
        rj0Var.setOnItemLongClickListener(new hv(this, 14));
        rj0Var.j(new tj0(this, j0Var));
        rj0Var.setVerticalScrollBarEnabled(true);
        rj0Var.setAlpha(0.0f);
        addView(rj0Var, k7.c6.c(-1.0f, -1));
        uj0 uj0Var = new uj0(this, context, g6Var);
        this.h = uj0Var;
        uj0Var.f(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f21752i6, -1);
        uj0Var.setIsSingleCell(true);
        uj0Var.setItemsCount(this.f33949a);
        addView(uj0Var, k7.c6.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(ng.q0.d(reaction));
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
        ArrayList arrayList = zj0Var.E;
        LongSparseArray longSparseArray = zj0Var.f33955r;
        ArrayList arrayList2 = zj0Var.f33954n;
        int i10 = zj0Var.f33950b;
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
                ng.q0 d = ng.q0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f16181g != 0) {
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
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new lf.d(18)));
            zj0Var.f33953f.l();
            if (!zj0Var.f33957w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(pr.f30168f);
                duration.addUpdateListener(new k70(zj0Var, 5));
                duration.addListener(new pd0(zj0Var, 5));
                duration.start();
                zj0Var.j();
                zj0Var.f33957w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            zj0Var.f33956s = str;
            if (str == null) {
                zj0Var.f33958x = false;
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
        int i10 = this.f33950b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f33951c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f20938id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f33956s;
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
        this.f33959y = d7Var;
    }

    public final void f(org.telegram.ui.vf vfVar) {
        this.C = vfVar;
    }

    public final void g(org.telegram.ui.uf ufVar) {
        this.B = ufVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f33954n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oj0 oj0Var = (oj0) it.next();
                TLObject tLObject = oj0Var.f29785a;
                if (oj0Var.f29787c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == oj0Var.f29786b) {
                                messagePeerReaction.date = oj0Var.f29787c;
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
            long j10 = oj0Var2.f29786b;
            TLObject tLObject2 = oj0Var2.f29785a;
            LongSparseArray longSparseArray = this.f33955r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f20992id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f20845id;
                }
                tL_messagePeerReaction.date = oj0Var2.f29787c;
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
        this.f33953f.l();
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
            i10 = this.f33950b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(l5.f(i10, ((ng.q0) arrayList3.get(i11)).f16181g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f20865id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f20865id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        xa0 xa0Var = new xa0(this.f33950b, getContext(), this.H, arrayList2, 1);
        this.G = xa0Var;
        xa0Var.H = false;
    }

    public final void j() {
        if (this.f33959y != null) {
            int size = this.f33954n.size();
            if (size == 0) {
                size = this.f33949a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            xa0 xa0Var = this.G;
            if (xa0Var != null) {
                dp = org.telegram.messenger.y3.C(8.0f, xa0Var.getMeasuredHeight(), dp);
            }
            rj0 rj0Var = this.f33952e;
            if (rj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(rj0Var.getMeasuredHeight(), dp);
            }
            this.f33959y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f33957w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f33949a = i10;
        this.h.setItemsCount(i10);
    }
}
