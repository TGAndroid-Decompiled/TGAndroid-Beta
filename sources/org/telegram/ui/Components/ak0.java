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
public final class ak0 extends FrameLayout {
    public zj0 B;
    public zj0 C;
    public xj0 D;
    public final ArrayList E;
    public final ArrayList F;
    public xa0 G;
    public final org.telegram.ui.ActionBar.g6 H;
    public int f25271a;
    public final int f25272b;
    public final MessageObject f25273c;
    public final TLRPC.Reaction d;
    public final sj0 f25274e;
    public final tj0 f25275f;
    public final vj0 h;
    public final ArrayList f25276n;
    public final LongSparseArray f25277r;
    public String f25278s;
    public boolean v;
    public boolean f25279w;
    public boolean f25280x;
    public yj0 f25281y;

    public ak0(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z4) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f25276n = new ArrayList();
        this.f25277r = new LongSparseArray();
        this.f25280x = true;
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = new ArrayList();
        this.f25272b = i10;
        this.f25273c = messageObject;
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
        this.f25271a = i11;
        sj0 sj0Var = new sj0(this, context, g6Var);
        this.f25274e = sj0Var;
        f2.j0 j0Var = new f2.j0();
        sj0Var.setLayoutManager(j0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            sj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false)));
        }
        tj0 tj0Var = new tj0(this, i10, context, g6Var, z4);
        this.f25275f = tj0Var;
        sj0Var.setAdapter(tj0Var);
        sj0Var.setOnItemClickListener(new k(this, 10));
        sj0Var.setOnItemLongClickListener(new hv(this, 14));
        sj0Var.j(new uj0(this, j0Var));
        sj0Var.setVerticalScrollBarEnabled(true);
        sj0Var.setAlpha(0.0f);
        addView(sj0Var, k7.c6.c(-1.0f, -1));
        vj0 vj0Var = new vj0(this, context, g6Var);
        this.h = vj0Var;
        vj0Var.f(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f21750i6, -1);
        vj0Var.setIsSingleCell(true);
        vj0Var.setItemsCount(this.f25271a);
        addView(vj0Var, k7.c6.c(-1.0f, -1));
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
        vj0Var.setViewType(i12);
    }

    public static void a(ak0 ak0Var, TLObject tLObject) {
        ArrayList arrayList = ak0Var.E;
        LongSparseArray longSparseArray = ak0Var.f25277r;
        ArrayList arrayList2 = ak0Var.f25276n;
        int i10 = ak0Var.f25272b;
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
                if (d.f16179g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (ak0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                ak0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new lf.d(18)));
            ak0Var.f25275f.l();
            if (!ak0Var.f25279w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(pr.f30183f);
                duration.addUpdateListener(new k70(ak0Var, 5));
                duration.addListener(new pd0(ak0Var, 5));
                duration.start();
                ak0Var.j();
                ak0Var.f25279w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            ak0Var.f25278s = str;
            if (str == null) {
                ak0Var.f25280x = false;
            }
            ak0Var.v = false;
            return;
        }
        ak0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f25272b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f25273c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f20936id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f25278s;
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
        this.f25281y = d7Var;
    }

    public final void f(org.telegram.ui.vf vfVar) {
        this.C = vfVar;
    }

    public final void g(org.telegram.ui.uf ufVar) {
        this.B = ufVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f25276n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pj0 pj0Var = (pj0) it.next();
                TLObject tLObject = pj0Var.f30094a;
                if (pj0Var.f30096c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == pj0Var.f30095b) {
                                messagePeerReaction.date = pj0Var.f30096c;
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
            pj0 pj0Var2 = (pj0) it2.next();
            long j10 = pj0Var2.f30095b;
            TLObject tLObject2 = pj0Var2.f30094a;
            LongSparseArray longSparseArray = this.f25277r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f20990id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f20843id;
                }
                tL_messagePeerReaction.date = pj0Var2.f30096c;
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
        this.f25275f.l();
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
            i10 = this.f25272b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(l5.f(i10, ((ng.q0) arrayList3.get(i11)).f16179g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f20863id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f20863id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        xa0 xa0Var = new xa0(this.f25272b, getContext(), this.H, arrayList2, 1);
        this.G = xa0Var;
        xa0Var.H = false;
    }

    public final void j() {
        if (this.f25281y != null) {
            int size = this.f25276n.size();
            if (size == 0) {
                size = this.f25271a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            xa0 xa0Var = this.G;
            if (xa0Var != null) {
                dp = org.telegram.messenger.y3.C(8.0f, xa0Var.getMeasuredHeight(), dp);
            }
            sj0 sj0Var = this.f25274e;
            if (sj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(sj0Var.getMeasuredHeight(), dp);
            }
            this.f25281y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f25279w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f25271a = i10;
        this.h.setItemsCount(i10);
    }
}
