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

public final class gj0 extends FrameLayout {
    public fj0 A;
    public fj0 B;
    public dj0 C;
    public final ArrayList D;
    public final ArrayList E;
    public ga0 F;
    public final org.telegram.ui.ActionBar.c6 G;

    public int f28723a;

    public final int f28724b;

    public final MessageObject f28725c;
    public final TLRPC.Reaction d;

    public final yi0 f28726e;

    public final zi0 f28727f;
    public final bj0 h;

    public final ArrayList f28728n;

    public final LongSparseArray f28729r;

    public String f28730s;
    public boolean v;

    public boolean f28731w;

    public boolean f28732x;

    public ej0 f28733y;

    public gj0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        this.f28728n = new ArrayList();
        this.f28729r = new LongSparseArray();
        this.f28732x = true;
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        this.E = new ArrayList();
        this.f28724b = i10;
        this.f28725c = messageObject;
        TLRPC.Reaction reaction = reactionCount == null ? null : reactionCount.reaction;
        this.d = reaction;
        this.G = c6Var;
        this.f28723a = reactionCount == null ? 6 : reactionCount.count;
        yi0 yi0Var = new yi0(this, context, c6Var);
        this.f28726e = yi0Var;
        f2.k0 k0Var = new f2.k0();
        yi0Var.setLayoutManager(k0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            yi0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false)));
        }
        zi0 zi0Var = new zi0(this, i10, context, c6Var, z10);
        this.f28727f = zi0Var;
        yi0Var.setAdapter(zi0Var);
        yi0Var.setOnItemClickListener(new j(this, 10));
        yi0Var.setOnItemLongClickListener(new vu(this, 14));
        yi0Var.j(new aj0(this, k0Var));
        yi0Var.setVerticalScrollBarEnabled(true);
        yi0Var.setAlpha(0.0f);
        addView(yi0Var, h7.z5.c(-1.0f, -1));
        bj0 bj0Var = new bj0(this, context, c6Var);
        this.h = bj0Var;
        bj0Var.f(org.telegram.ui.ActionBar.g6.G8, org.telegram.ui.ActionBar.g6.f23144i6, -1);
        bj0Var.setIsSingleCell(true);
        bj0Var.setItemsCount(this.f28723a);
        addView(bj0Var, h7.z5.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(ig.q0.d(reaction));
            i();
        }
        bj0Var.setViewType(arrayList.isEmpty() ? 16 : 23);
    }

    public static void a(gj0 gj0Var, TLObject tLObject) {
        ArrayList arrayList = gj0Var.D;
        LongSparseArray longSparseArray = gj0Var.f28729r;
        ArrayList arrayList2 = gj0Var.f28728n;
        int i10 = gj0Var.f28724b;
        if (!(tLObject instanceof TLRPC.TL_messages_messageReactionsList)) {
            gj0Var.v = false;
            return;
        }
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
            ig.q0 q0VarD = ig.q0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
            if (q0VarD.f11413g != 0) {
                hashSet.add(q0VarD);
            }
            arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
            longSparseArray.put(peerId, arrayList3);
        }
        if (gj0Var.d == null) {
            arrayList.clear();
            arrayList.addAll(hashSet);
            gj0Var.i();
        }
        Collections.sort(arrayList2, Comparator$CC.comparingInt(new gf.d(18)));
        gj0Var.f28727f.l();
        if (!gj0Var.f28731w) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.setInterpolator(er.f28122f);
            duration.addUpdateListener(new v60(gj0Var, 5));
            duration.addListener(new sz(gj0Var, 14));
            duration.start();
            gj0Var.j();
            gj0Var.f28731w = true;
        }
        String str = tL_messages_messageReactionsList.next_offset;
        gj0Var.f28730s = str;
        if (str == null) {
            gj0Var.f28732x = false;
        }
        gj0Var.v = false;
    }

    public int getLoadCount() {
        return this.d == null ? 100 : 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f28724b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f28725c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f22473id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f28730s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new w1(this, 11), 64);
    }

    public final void d(org.telegram.ui.oe oeVar) {
        this.C = oeVar;
    }

    public final void e(org.telegram.ui.b7 b7Var) {
        this.f28733y = b7Var;
    }

    public final void f(org.telegram.ui.rf rfVar) {
        this.B = rfVar;
    }

    public final void g(org.telegram.ui.qf qfVar) {
        this.A = qfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f28728n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vi0 vi0Var = (vi0) it.next();
                TLObject tLObject = vi0Var.f33424a;
                if (vi0Var.f33426c > 0) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                        if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == vi0Var.f33425b) {
                            messagePeerReaction.date = vi0Var.f33426c;
                            messagePeerReaction.dateIsSeen = true;
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            vi0 vi0Var2 = (vi0) it2.next();
            long j10 = vi0Var2.f33425b;
            TLObject tLObject2 = vi0Var2.f33424a;
            LongSparseArray longSparseArray = this.f28729r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f22527id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f22380id;
                }
                tL_messagePeerReaction.date = vi0Var2.f33426c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new gf.d(17)));
        this.f28727f.l();
        j();
    }

    public final void i() {
        int i10;
        ArrayList arrayList = this.E;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (true) {
            ArrayList arrayList3 = this.D;
            int size = arrayList3.size();
            i10 = this.f28724b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(k5.f(i10, ((ig.q0) arrayList3.get(i11)).f11413g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f22400id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f22400id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        ga0 ga0Var = new ga0(this.f28724b, getContext(), this.G, arrayList2, 1);
        this.F = ga0Var;
        ga0Var.G = false;
    }

    public final void j() {
        if (this.f28733y != null) {
            int size = this.f28728n.size();
            if (size == 0) {
                size = this.f28723a;
            }
            int iDp = AndroidUtilities.dp(size * 50);
            ga0 ga0Var = this.F;
            if (ga0Var != null) {
                iDp = org.telegram.messenger.y1.C(8.0f, ga0Var.getMeasuredHeight(), iDp);
            }
            yi0 yi0Var = this.f28726e;
            if (yi0Var.getMeasuredHeight() != 0) {
                iDp = Math.min(yi0Var.getMeasuredHeight(), iDp);
            }
            this.f28733y.a(this, iDp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28731w || this.v) {
            return;
        }
        c();
    }

    public void setPredictiveCount(int i10) {
        this.f28723a = i10;
        this.h.setItemsCount(i10);
    }
}
