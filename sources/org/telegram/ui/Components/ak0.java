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
    public zj0 E;
    public zj0 F;
    public xj0 G;
    public final ArrayList H;
    public final ArrayList I;
    public fb0 J;
    public final org.telegram.ui.ActionBar.d6 K;
    public int f22714a;
    public final int f22715b;
    public final MessageObject f22716c;
    public final TLRPC.Reaction d;
    public final sj0 e;
    public final tj0 f22717f;
    public final vj0 h;
    public final ArrayList f22718n;
    public final LongSparseArray f22719r;
    public String f22720s;
    public boolean v;
    public boolean f22721w;
    public boolean f22722x;
    public yj0 f22723y;

    public ak0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f22718n = new ArrayList();
        this.f22719r = new LongSparseArray();
        this.f22722x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f22715b = i10;
        this.f22716c = messageObject;
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
        this.f22714a = i11;
        sj0 sj0Var = new sj0(this, context, d6Var);
        this.e = sj0Var;
        s4.c0 c0Var = new s4.c0();
        sj0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            sj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19149i6, false)));
        }
        tj0 tj0Var = new tj0(this, i10, context, d6Var, z10);
        this.f22717f = tj0Var;
        sj0Var.setAdapter(tj0Var);
        sj0Var.setOnItemClickListener(new j(this, 10));
        sj0Var.setOnItemLongClickListener(new mv(this, 15));
        sj0Var.j(new uj0(this, c0Var));
        sj0Var.setVerticalScrollBarEnabled(true);
        sj0Var.setAlpha(0.0f);
        addView(sj0Var, w7.y5.c(-1.0f, -1));
        vj0 vj0Var = new vj0(this, context, d6Var);
        this.h = vj0Var;
        vj0Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f19149i6, -1);
        vj0Var.setIsSingleCell(true);
        vj0Var.setItemsCount(this.f22714a);
        addView(vj0Var, w7.y5.c(-1.0f, -1));
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
        vj0Var.setViewType(i12);
    }

    public static void a(ak0 ak0Var, TLObject tLObject) {
        ArrayList arrayList = ak0Var.H;
        LongSparseArray longSparseArray = ak0Var.f22719r;
        ArrayList arrayList2 = ak0Var.f22718n;
        int i10 = ak0Var.f22715b;
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
                if (d.f49398g != 0) {
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
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.g7(12)));
            ak0Var.f22717f.l();
            if (!ak0Var.f22721w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(rr.f28031f);
                duration.addUpdateListener(new s70(ak0Var, 5));
                duration.addListener(new fd0(ak0Var, 7));
                duration.start();
                ak0Var.j();
                ak0Var.f22721w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            ak0Var.f22720s = str;
            if (str == null) {
                ak0Var.f22722x = false;
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
        int i10 = this.f22715b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f22716c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f18429id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f22720s;
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

    public final void e(org.telegram.ui.b7 b7Var) {
        this.f22723y = b7Var;
    }

    public final void f(org.telegram.ui.zf zfVar) {
        this.F = zfVar;
    }

    public final void g(org.telegram.ui.yf yfVar) {
        this.E = yfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f22718n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pj0 pj0Var = (pj0) it.next();
                TLObject tLObject = pj0Var.f27363a;
                if (pj0Var.f27365c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == pj0Var.f27364b) {
                                messagePeerReaction.date = pj0Var.f27365c;
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
            long j3 = pj0Var2.f27364b;
            TLObject tLObject2 = pj0Var2.f27363a;
            LongSparseArray longSparseArray = this.f22719r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f18483id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f18336id;
                }
                tL_messagePeerReaction.date = pj0Var2.f27365c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new ai.g7(11)));
        this.f22717f.l();
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
            i10 = this.f22715b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(q5.f(i10, ((zg.o0) arrayList3.get(i11)).f49398g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f18356id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f18356id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        fb0 fb0Var = new fb0(this.f22715b, getContext(), this.K, arrayList2, 1);
        this.J = fb0Var;
        fb0Var.K = false;
    }

    public final void j() {
        if (this.f22723y != null) {
            int size = this.f22718n.size();
            if (size == 0) {
                size = this.f22714a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            fb0 fb0Var = this.J;
            if (fb0Var != null) {
                dp = org.telegram.messenger.f0.C(8.0f, fb0Var.getMeasuredHeight(), dp);
            }
            sj0 sj0Var = this.e;
            if (sj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(sj0Var.getMeasuredHeight(), dp);
            }
            this.f22723y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f22721w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f22714a = i10;
        this.h.setItemsCount(i10);
    }
}
