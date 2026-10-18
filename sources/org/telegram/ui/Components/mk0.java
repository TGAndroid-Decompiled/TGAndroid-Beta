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
public final class mk0 extends FrameLayout {
    public lk0 E;
    public lk0 F;
    public jk0 G;
    public final ArrayList H;
    public final ArrayList I;
    public ob0 J;
    public final org.telegram.ui.ActionBar.d6 K;
    public int f28544a;
    public final int f28545b;
    public final MessageObject f28546c;
    public final TLRPC.Reaction d;
    public final ek0 e;
    public final fk0 f28547f;
    public final hk0 h;
    public final ArrayList f28548n;
    public final LongSparseArray f28549r;
    public String f28550s;
    public boolean v;
    public boolean f28551w;
    public boolean f28552x;
    public kk0 f28553y;

    public mk0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f28548n = new ArrayList();
        this.f28549r = new LongSparseArray();
        this.f28552x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f28545b = i10;
        this.f28546c = messageObject;
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
        this.f28544a = i11;
        ek0 ek0Var = new ek0(this, context, d6Var);
        this.e = ek0Var;
        s4.b0 b0Var = new s4.b0();
        ek0Var.setLayoutManager(b0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            ek0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21082i6, false)));
        }
        fk0 fk0Var = new fk0(this, i10, context, d6Var, z10);
        this.f28547f = fk0Var;
        ek0Var.setAdapter(fk0Var);
        ek0Var.setOnItemClickListener(new j(this, 10));
        ek0Var.setOnItemLongClickListener(new tv(this, 15));
        ek0Var.j(new gk0(this, b0Var));
        ek0Var.setVerticalScrollBarEnabled(true);
        ek0Var.setAlpha(0.0f);
        addView(ek0Var, w7.z5.d(-1.0f, -1));
        hk0 hk0Var = new hk0(this, context, d6Var);
        this.h = hk0Var;
        hk0Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f21082i6, -1);
        hk0Var.setIsSingleCell(true);
        hk0Var.setItemsCount(this.f28544a);
        addView(hk0Var, w7.z5.d(-1.0f, -1));
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
        hk0Var.setViewType(i12);
    }

    public static void a(mk0 mk0Var, TLObject tLObject) {
        ArrayList arrayList = mk0Var.H;
        LongSparseArray longSparseArray = mk0Var.f28549r;
        ArrayList arrayList2 = mk0Var.f28548n;
        int i10 = mk0Var.f28545b;
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
                if (d.f786g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (mk0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                mk0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.u8(18)));
            mk0Var.f28547f.l();
            if (!mk0Var.f28551w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(bs.f25037f);
                duration.addUpdateListener(new b80(mk0Var, 6));
                duration.addListener(new c80(mk0Var, 12));
                duration.start();
                mk0Var.j();
                mk0Var.f28551w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            mk0Var.f28550s = str;
            if (str == null) {
                mk0Var.f28552x = false;
            }
            mk0Var.v = false;
            return;
        }
        mk0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f28545b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f28546c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f20372id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f28550s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new y1(this, 11), 64);
    }

    public final void d(org.telegram.ui.re reVar) {
        this.G = reVar;
    }

    public final void e(org.telegram.ui.e7 e7Var) {
        this.f28553y = e7Var;
    }

    public final void f(org.telegram.ui.wf wfVar) {
        this.F = wfVar;
    }

    public final void g(org.telegram.ui.vf vfVar) {
        this.E = vfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f28548n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bk0 bk0Var = (bk0) it.next();
                TLObject tLObject = bk0Var.f25005a;
                if (bk0Var.f25007c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == bk0Var.f25006b) {
                                messagePeerReaction.date = bk0Var.f25007c;
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
            bk0 bk0Var2 = (bk0) it2.next();
            long j10 = bk0Var2.f25006b;
            TLObject tLObject2 = bk0Var2.f25005a;
            LongSparseArray longSparseArray = this.f28549r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f20426id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f20279id;
                }
                tL_messagePeerReaction.date = bk0Var2.f25007c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.u8(17)));
        this.f28547f.l();
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
            i10 = this.f28545b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(r5.f(i10, ((ah.i1) arrayList3.get(i11)).f786g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f20299id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f20299id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        ob0 ob0Var = new ob0(this.f28545b, 1, getContext(), arrayList2, this.K);
        this.J = ob0Var;
        ob0Var.K = false;
    }

    public final void j() {
        if (this.f28553y != null) {
            int size = this.f28548n.size();
            if (size == 0) {
                size = this.f28544a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            ob0 ob0Var = this.J;
            if (ob0Var != null) {
                dp = org.telegram.messenger.g0.C(8.0f, ob0Var.getMeasuredHeight(), dp);
            }
            ek0 ek0Var = this.e;
            if (ek0Var.getMeasuredHeight() != 0) {
                dp = Math.min(ek0Var.getMeasuredHeight(), dp);
            }
            this.f28553y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f28551w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f28544a = i10;
        this.h.setItemsCount(i10);
    }
}
