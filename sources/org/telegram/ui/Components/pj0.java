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
public final class pj0 extends FrameLayout {
    public oj0 E;
    public oj0 F;
    public mj0 G;
    public final ArrayList H;
    public final ArrayList I;
    public ta0 J;
    public final org.telegram.ui.ActionBar.e6 K;
    public int f27056a;
    public final int f27057b;
    public final MessageObject f27058c;
    public final TLRPC.Reaction d;
    public final hj0 e;
    public final ij0 f27059f;
    public final kj0 h;
    public final ArrayList f27060n;
    public final LongSparseArray f27061r;
    public String f27062s;
    public boolean v;
    public boolean f27063w;
    public boolean f27064x;
    public nj0 f27065y;

    public pj0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f27060n = new ArrayList();
        this.f27061r = new LongSparseArray();
        this.f27064x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f27057b = i10;
        this.f27058c = messageObject;
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
        this.f27056a = i11;
        hj0 hj0Var = new hj0(this, context, e6Var);
        this.e = hj0Var;
        s4.c0 c0Var = new s4.c0();
        hj0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            hj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18923i6, false)));
        }
        ij0 ij0Var = new ij0(this, i10, context, e6Var, z10);
        this.f27059f = ij0Var;
        hj0Var.setAdapter(ij0Var);
        hj0Var.setOnItemClickListener(new j(this, 10));
        hj0Var.setOnItemLongClickListener(new lv(this, 14));
        hj0Var.j(new jj0(this, c0Var));
        hj0Var.setVerticalScrollBarEnabled(true);
        hj0Var.setAlpha(0.0f);
        addView(hj0Var, w7.x5.c(-1.0f, -1));
        kj0 kj0Var = new kj0(this, context, e6Var);
        this.h = kj0Var;
        kj0Var.f(org.telegram.ui.ActionBar.i6.G8, org.telegram.ui.ActionBar.i6.f18923i6, -1);
        kj0Var.setIsSingleCell(true);
        kj0Var.setItemsCount(this.f27056a);
        addView(kj0Var, w7.x5.c(-1.0f, -1));
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
        kj0Var.setViewType(i12);
    }

    public static void a(pj0 pj0Var, TLObject tLObject) {
        ArrayList arrayList = pj0Var.H;
        LongSparseArray longSparseArray = pj0Var.f27061r;
        ArrayList arrayList2 = pj0Var.f27060n;
        int i10 = pj0Var.f27057b;
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
                if (d.f49121g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (pj0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                pj0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.f7(12)));
            pj0Var.f27059f.l();
            if (!pj0Var.f27063w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(qr.f27420f);
                duration.addUpdateListener(new h70(pj0Var, 5));
                duration.addListener(new jd0(pj0Var, 6));
                duration.start();
                pj0Var.j();
                pj0Var.f27063w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            pj0Var.f27062s = str;
            if (str == null) {
                pj0Var.f27064x = false;
            }
            pj0Var.v = false;
            return;
        }
        pj0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f27057b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f27058c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f18202id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f27062s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 11), 64);
    }

    public final void d(org.telegram.ui.ue ueVar) {
        this.G = ueVar;
    }

    public final void e(org.telegram.ui.b7 b7Var) {
        this.f27065y = b7Var;
    }

    public final void f(org.telegram.ui.bg bgVar) {
        this.F = bgVar;
    }

    public final void g(org.telegram.ui.ag agVar) {
        this.E = agVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f27060n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ej0 ej0Var = (ej0) it.next();
                TLObject tLObject = ej0Var.f23677a;
                if (ej0Var.f23679c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == ej0Var.f23678b) {
                                messagePeerReaction.date = ej0Var.f23679c;
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
            ej0 ej0Var2 = (ej0) it2.next();
            long j3 = ej0Var2.f23678b;
            TLObject tLObject2 = ej0Var2.f23677a;
            LongSparseArray longSparseArray = this.f27061r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f18256id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f18109id;
                }
                tL_messagePeerReaction.date = ej0Var2.f23679c;
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
        this.f27059f.l();
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
            i10 = this.f27057b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(o5.f(i10, ((zg.p0) arrayList3.get(i11)).f49121g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f18129id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f18129id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        ta0 ta0Var = new ta0(this.f27057b, getContext(), this.K, arrayList2, 1);
        this.J = ta0Var;
        ta0Var.K = false;
    }

    public final void j() {
        if (this.f27065y != null) {
            int size = this.f27060n.size();
            if (size == 0) {
                size = this.f27056a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            ta0 ta0Var = this.J;
            if (ta0Var != null) {
                dp = org.telegram.messenger.y0.C(8.0f, ta0Var.getMeasuredHeight(), dp);
            }
            hj0 hj0Var = this.e;
            if (hj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(hj0Var.getMeasuredHeight(), dp);
            }
            this.f27065y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f27063w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f27056a = i10;
        this.h.setItemsCount(i10);
    }
}
