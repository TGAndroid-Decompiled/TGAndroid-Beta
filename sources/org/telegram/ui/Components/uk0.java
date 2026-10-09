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
public final class uk0 extends FrameLayout {
    public tk0 E;
    public tk0 F;
    public rk0 G;
    public final ArrayList H;
    public final ArrayList I;
    public vb0 J;
    public final org.telegram.ui.ActionBar.e6 K;
    public int f31521a;
    public final int f31522b;
    public final MessageObject f31523c;
    public final TLRPC.Reaction d;
    public final mk0 f31524e;
    public final nk0 f31525f;
    public final pk0 h;
    public final ArrayList f31526n;
    public final LongSparseArray f31527r;
    public String f31528s;
    public boolean v;
    public boolean f31529w;
    public boolean f31530x;
    public sk0 f31531y;

    public uk0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f31526n = new ArrayList();
        this.f31527r = new LongSparseArray();
        this.f31530x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f31522b = i10;
        this.f31523c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.K = e6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f31521a = i11;
        mk0 mk0Var = new mk0(this, context, e6Var);
        this.f31524e = mk0Var;
        s4.d0 d0Var = new s4.d0();
        mk0Var.setLayoutManager(d0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            mk0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false)));
        }
        nk0 nk0Var = new nk0(this, i10, context, e6Var, z10);
        this.f31525f = nk0Var;
        mk0Var.setAdapter(nk0Var);
        mk0Var.setOnItemClickListener(new j(this, 10));
        mk0Var.setOnItemLongClickListener(new bw(this, 15));
        mk0Var.j(new ok0(this, d0Var));
        mk0Var.setVerticalScrollBarEnabled(true);
        mk0Var.setAlpha(0.0f);
        addView(mk0Var, w7.x5.d(-1.0f, -1));
        pk0 pk0Var = new pk0(this, context, e6Var);
        this.h = pk0Var;
        pk0Var.f(org.telegram.ui.ActionBar.i6.G8, org.telegram.ui.ActionBar.i6.f20888i6, -1);
        pk0Var.setIsSingleCell(true);
        pk0Var.setItemsCount(this.f31521a);
        addView(pk0Var, w7.x5.d(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(zg.n0.d(reaction));
            i();
        }
        if (arrayList.isEmpty()) {
            i12 = 16;
        } else {
            i12 = 23;
        }
        pk0Var.setViewType(i12);
    }

    public static void a(uk0 uk0Var, TLObject tLObject) {
        ArrayList arrayList = uk0Var.H;
        LongSparseArray longSparseArray = uk0Var.f31527r;
        ArrayList arrayList2 = uk0Var.f31526n;
        int i10 = uk0Var.f31522b;
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
                zg.n0 d = zg.n0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f54618g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (uk0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                uk0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.h7(13)));
            uk0Var.f31525f.l();
            if (!uk0Var.f31529w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(hs.f27118f);
                duration.addUpdateListener(new j80(uk0Var, 6));
                duration.addListener(new vd0(uk0Var, 7));
                duration.start();
                uk0Var.j();
                uk0Var.f31529w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            uk0Var.f31528s = str;
            if (str == null) {
                uk0Var.f31530x = false;
            }
            uk0Var.v = false;
            return;
        }
        uk0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f31522b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f31523c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f20131id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f31528s;
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

    public final void e(org.telegram.ui.a7 a7Var) {
        this.f31531y = a7Var;
    }

    public final void f(org.telegram.ui.cg cgVar) {
        this.F = cgVar;
    }

    public final void g(org.telegram.ui.bg bgVar) {
        this.E = bgVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f31526n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jk0 jk0Var = (jk0) it.next();
                TLObject tLObject = jk0Var.f27734a;
                if (jk0Var.f27736c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == jk0Var.f27735b) {
                                messagePeerReaction.date = jk0Var.f27736c;
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
            jk0 jk0Var2 = (jk0) it2.next();
            long j3 = jk0Var2.f27735b;
            TLObject tLObject2 = jk0Var2.f27734a;
            LongSparseArray longSparseArray = this.f31527r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f20185id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f20038id;
                }
                tL_messagePeerReaction.date = jk0Var2.f27736c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.h7(12)));
        this.f31525f.l();
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
            i10 = this.f31522b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(s5.f(i10, ((zg.n0) arrayList3.get(i11)).f54618g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f20058id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f20058id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        vb0 vb0Var = new vb0(this.f31522b, 1, getContext(), arrayList2, this.K);
        this.J = vb0Var;
        vb0Var.K = false;
    }

    public final void j() {
        if (this.f31531y != null) {
            int size = this.f31526n.size();
            if (size == 0) {
                size = this.f31521a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            vb0 vb0Var = this.J;
            if (vb0Var != null) {
                dp = org.telegram.messenger.q.C(8.0f, vb0Var.getMeasuredHeight(), dp);
            }
            mk0 mk0Var = this.f31524e;
            if (mk0Var.getMeasuredHeight() != 0) {
                dp = Math.min(mk0Var.getMeasuredHeight(), dp);
            }
            this.f31531y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f31529w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f31521a = i10;
        this.h.setItemsCount(i10);
    }
}
