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
    public nb0 J;
    public final org.telegram.ui.ActionBar.u6 K;
    public int f31920a;
    public final int f31921b;
    public final MessageObject f31922c;
    public final TLRPC.Reaction d;
    public final ik0 e;
    public final jk0 f31923f;
    public final lk0 h;
    public final ArrayList f31924n;
    public final LongSparseArray f31925r;
    public String f31926s;
    public boolean v;
    public boolean f31927w;
    public boolean f31928x;
    public ok0 f31929y;

    public qk0(Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f31924n = new ArrayList();
        this.f31925r = new LongSparseArray();
        this.f31928x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f31921b = i10;
        this.f31922c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.K = u6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f31920a = i11;
        ik0 ik0Var = new ik0(this, context, u6Var);
        this.e = ik0Var;
        s4.c0 c0Var = new s4.c0();
        ik0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            ik0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23449i6, false)));
        }
        jk0 jk0Var = new jk0(this, i10, context, u6Var, z10);
        this.f31923f = jk0Var;
        ik0Var.setAdapter(jk0Var);
        ik0Var.setOnItemClickListener(new j(this, 10));
        ik0Var.setOnItemLongClickListener(new tv(this, 17));
        ik0Var.j(new kk0(this, c0Var));
        ik0Var.setVerticalScrollBarEnabled(true);
        ik0Var.setAlpha(0.0f);
        addView(ik0Var, kb1.g(-1.0f, -1));
        lk0 lk0Var = new lk0(this, context, u6Var);
        this.h = lk0Var;
        lk0Var.e(org.telegram.ui.ActionBar.y6.G8, org.telegram.ui.ActionBar.y6.f23449i6, -1);
        lk0Var.setIsSingleCell(true);
        lk0Var.setItemsCount(this.f31920a);
        addView(lk0Var, kb1.g(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(bh.x0.d(reaction));
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
        LongSparseArray longSparseArray = qk0Var.f31925r;
        ArrayList arrayList2 = qk0Var.f31924n;
        int i10 = qk0Var.f31921b;
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
                bh.x0 d = bh.x0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f4209g != 0) {
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
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ag.e(19)));
            qk0Var.f31923f.l();
            if (!qk0Var.f31927w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(ds.f27530f);
                duration.addUpdateListener(new f80(qk0Var, 6));
                duration.addListener(new i10(qk0Var, 14));
                duration.start();
                qk0Var.j();
                qk0Var.f31927w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            qk0Var.f31926s = str;
            if (str == null) {
                qk0Var.f31928x = false;
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
        int i10 = this.f31921b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f31922c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f22123id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f31926s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new b2(this, 11), 64);
    }

    public final void d(org.telegram.ui.qe qeVar) {
        this.G = qeVar;
    }

    public final void e(org.telegram.ui.e7 e7Var) {
        this.f31929y = e7Var;
    }

    public final void f(org.telegram.ui.tf tfVar) {
        this.F = tfVar;
    }

    public final void g(org.telegram.ui.sf sfVar) {
        this.E = sfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f31924n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fk0 fk0Var = (fk0) it.next();
                TLObject tLObject = fk0Var.f28202a;
                if (fk0Var.f28204c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == fk0Var.f28203b) {
                                messagePeerReaction.date = fk0Var.f28204c;
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
            long j10 = fk0Var2.f28203b;
            TLObject tLObject2 = fk0Var2.f28202a;
            LongSparseArray longSparseArray = this.f31925r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f22177id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f22028id;
                }
                tL_messagePeerReaction.date = fk0Var2.f28204c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new ag.e(18)));
        this.f31923f.l();
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
            i10 = this.f31921b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(t5.f(i10, ((bh.x0) arrayList3.get(i11)).f4209g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f22048id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f22048id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        nb0 nb0Var = new nb0(this.f31921b, 1, getContext(), arrayList2, this.K);
        this.J = nb0Var;
        nb0Var.K = false;
    }

    public final void j() {
        if (this.f31929y != null) {
            int size = this.f31924n.size();
            if (size == 0) {
                size = this.f31920a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            nb0 nb0Var = this.J;
            if (nb0Var != null) {
                dp = org.telegram.messenger.t.D(8.0f, nb0Var.getMeasuredHeight(), dp);
            }
            ik0 ik0Var = this.e;
            if (ik0Var.getMeasuredHeight() != 0) {
                dp = Math.min(ik0Var.getMeasuredHeight(), dp);
            }
            this.f31929y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f31927w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f31920a = i10;
        this.h.setItemsCount(i10);
    }
}
