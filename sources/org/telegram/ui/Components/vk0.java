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
public final class vk0 extends FrameLayout {
    public uk0 E;
    public uk0 F;
    public sk0 G;
    public final ArrayList H;
    public final ArrayList I;
    public vb0 J;
    public final org.telegram.ui.ActionBar.d6 K;
    public int f31904a;
    public final int f31905b;
    public final MessageObject f31906c;
    public final TLRPC.Reaction d;
    public final nk0 f31907e;
    public final ok0 f31908f;
    public final qk0 h;
    public final ArrayList f31909n;
    public final LongSparseArray f31910r;
    public String f31911s;
    public boolean v;
    public boolean f31912w;
    public boolean f31913x;
    public tk0 f31914y;

    public vk0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f31909n = new ArrayList();
        this.f31910r = new LongSparseArray();
        this.f31913x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f31905b = i10;
        this.f31906c = messageObject;
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
        this.f31904a = i11;
        nk0 nk0Var = new nk0(this, context, d6Var);
        this.f31907e = nk0Var;
        s4.d0 d0Var = new s4.d0();
        nk0Var.setLayoutManager(d0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            nk0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20913i6, false)));
        }
        ok0 ok0Var = new ok0(this, i10, context, d6Var, z10);
        this.f31908f = ok0Var;
        nk0Var.setAdapter(ok0Var);
        nk0Var.setOnItemClickListener(new j(this, 10));
        nk0Var.setOnItemLongClickListener(new cw(this, 15));
        nk0Var.j(new pk0(this, d0Var));
        nk0Var.setVerticalScrollBarEnabled(true);
        nk0Var.setAlpha(0.0f);
        addView(nk0Var, w7.x5.d(-1.0f, -1));
        qk0 qk0Var = new qk0(this, context, d6Var);
        this.h = qk0Var;
        qk0Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f20913i6, -1);
        qk0Var.setIsSingleCell(true);
        qk0Var.setItemsCount(this.f31904a);
        addView(qk0Var, w7.x5.d(-1.0f, -1));
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
        qk0Var.setViewType(i12);
    }

    public static void a(vk0 vk0Var, TLObject tLObject) {
        ArrayList arrayList = vk0Var.H;
        LongSparseArray longSparseArray = vk0Var.f31910r;
        ArrayList arrayList2 = vk0Var.f31909n;
        int i10 = vk0Var.f31905b;
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
                if (d.f54739g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (vk0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                vk0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.h7(13)));
            vk0Var.f31908f.l();
            if (!vk0Var.f31912w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(is.f27500f);
                duration.addUpdateListener(new j80(vk0Var, 6));
                duration.addListener(new vd0(vk0Var, 7));
                duration.start();
                vk0Var.j();
                vk0Var.f31912w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            vk0Var.f31911s = str;
            if (str == null) {
                vk0Var.f31913x = false;
            }
            vk0Var.v = false;
            return;
        }
        vk0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f31905b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f31906c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f20161id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f31911s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new y1(this, 11), 64);
    }

    public final void d(org.telegram.ui.qe qeVar) {
        this.G = qeVar;
    }

    public final void e(org.telegram.ui.z6 z6Var) {
        this.f31914y = z6Var;
    }

    public final void f(org.telegram.ui.bg bgVar) {
        this.F = bgVar;
    }

    public final void g(org.telegram.ui.ag agVar) {
        this.E = agVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f31909n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kk0 kk0Var = (kk0) it.next();
                TLObject tLObject = kk0Var.f28100a;
                if (kk0Var.f28102c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == kk0Var.f28101b) {
                                messagePeerReaction.date = kk0Var.f28102c;
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
            kk0 kk0Var2 = (kk0) it2.next();
            long j3 = kk0Var2.f28101b;
            TLObject tLObject2 = kk0Var2.f28100a;
            LongSparseArray longSparseArray = this.f31910r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f20215id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f20068id;
                }
                tL_messagePeerReaction.date = kk0Var2.f28102c;
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
        this.f31908f.l();
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
            i10 = this.f31905b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(s5.f(i10, ((zg.n0) arrayList3.get(i11)).f54739g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f20088id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f20088id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        vb0 vb0Var = new vb0(this.f31905b, 1, getContext(), arrayList2, this.K);
        this.J = vb0Var;
        vb0Var.K = false;
    }

    public final void j() {
        if (this.f31914y != null) {
            int size = this.f31909n.size();
            if (size == 0) {
                size = this.f31904a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            vb0 vb0Var = this.J;
            if (vb0Var != null) {
                dp = org.telegram.messenger.q.C(8.0f, vb0Var.getMeasuredHeight(), dp);
            }
            nk0 nk0Var = this.f31907e;
            if (nk0Var.getMeasuredHeight() != 0) {
                dp = Math.min(nk0Var.getMeasuredHeight(), dp);
            }
            this.f31914y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f31912w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f31904a = i10;
        this.h.setItemsCount(i10);
    }
}
