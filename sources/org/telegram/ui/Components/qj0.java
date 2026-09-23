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
    public ua0 J;
    public final org.telegram.ui.ActionBar.d6 K;
    public int f27364a;
    public final int f27365b;
    public final MessageObject f27366c;
    public final TLRPC.Reaction d;
    public final ij0 e;
    public final jj0 f27367f;
    public final lj0 h;
    public final ArrayList f27368n;
    public final LongSparseArray f27369r;
    public String f27370s;
    public boolean v;
    public boolean f27371w;
    public boolean f27372x;
    public oj0 f27373y;

    public qj0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f27368n = new ArrayList();
        this.f27369r = new LongSparseArray();
        this.f27372x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f27365b = i10;
        this.f27366c = messageObject;
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
        this.f27364a = i11;
        ij0 ij0Var = new ij0(this, context, d6Var);
        this.e = ij0Var;
        s4.c0 c0Var = new s4.c0();
        ij0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            ij0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false)));
        }
        jj0 jj0Var = new jj0(this, i10, context, d6Var, z10);
        this.f27367f = jj0Var;
        ij0Var.setAdapter(jj0Var);
        ij0Var.setOnItemClickListener(new j(this, 10));
        ij0Var.setOnItemLongClickListener(new mv(this, 14));
        ij0Var.j(new kj0(this, c0Var));
        ij0Var.setVerticalScrollBarEnabled(true);
        ij0Var.setAlpha(0.0f);
        addView(ij0Var, w7.x5.c(-1.0f, -1));
        lj0 lj0Var = new lj0(this, context, d6Var);
        this.h = lj0Var;
        lj0Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f18878i6, -1);
        lj0Var.setIsSingleCell(true);
        lj0Var.setItemsCount(this.f27364a);
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
        LongSparseArray longSparseArray = qj0Var.f27369r;
        ArrayList arrayList2 = qj0Var.f27368n;
        int i10 = qj0Var.f27365b;
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
                if (d.f49072g != 0) {
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
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.g7(12)));
            qj0Var.f27367f.l();
            if (!qj0Var.f27371w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(rr.f27701f);
                duration.addUpdateListener(new i70(qj0Var, 5));
                duration.addListener(new jd0(qj0Var, 6));
                duration.start();
                qj0Var.j();
                qj0Var.f27371w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            qj0Var.f27370s = str;
            if (str == null) {
                qj0Var.f27372x = false;
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
        int i10 = this.f27365b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f27366c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f18176id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f27370s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new y1(this, 11), 64);
    }

    public final void d(org.telegram.ui.ue ueVar) {
        this.G = ueVar;
    }

    public final void e(org.telegram.ui.b7 b7Var) {
        this.f27373y = b7Var;
    }

    public final void f(org.telegram.ui.ag agVar) {
        this.F = agVar;
    }

    public final void g(org.telegram.ui.zf zfVar) {
        this.E = zfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f27368n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fj0 fj0Var = (fj0) it.next();
                TLObject tLObject = fj0Var.f23995a;
                if (fj0Var.f23997c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == fj0Var.f23996b) {
                                messagePeerReaction.date = fj0Var.f23997c;
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
            long j3 = fj0Var2.f23996b;
            TLObject tLObject2 = fj0Var2.f23995a;
            LongSparseArray longSparseArray = this.f27369r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f18230id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f18083id;
                }
                tL_messagePeerReaction.date = fj0Var2.f23997c;
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
        this.f27367f.l();
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
            i10 = this.f27365b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(q5.f(i10, ((zg.p0) arrayList3.get(i11)).f49072g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f18103id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f18103id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        ua0 ua0Var = new ua0(this.f27365b, getContext(), this.K, arrayList2, 1);
        this.J = ua0Var;
        ua0Var.K = false;
    }

    public final void j() {
        if (this.f27373y != null) {
            int size = this.f27368n.size();
            if (size == 0) {
                size = this.f27364a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            ua0 ua0Var = this.J;
            if (ua0Var != null) {
                dp = org.telegram.messenger.z0.C(8.0f, ua0Var.getMeasuredHeight(), dp);
            }
            ij0 ij0Var = this.e;
            if (ij0Var.getMeasuredHeight() != 0) {
                dp = Math.min(ij0Var.getMeasuredHeight(), dp);
            }
            this.f27373y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f27371w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f27364a = i10;
        this.h.setItemsCount(i10);
    }
}
