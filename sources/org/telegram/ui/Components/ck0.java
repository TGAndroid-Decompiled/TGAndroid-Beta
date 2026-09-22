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
public final class ck0 extends FrameLayout {
    public bk0 E;
    public bk0 F;
    public zj0 G;
    public final ArrayList H;
    public final ArrayList I;
    public eb0 J;
    public final org.telegram.ui.ActionBar.f6 K;
    public int f23386a;
    public final int f23387b;
    public final MessageObject f23388c;
    public final TLRPC.Reaction d;
    public final uj0 e;
    public final vj0 f23389f;
    public final xj0 h;
    public final ArrayList f23390n;
    public final LongSparseArray f23391r;
    public String f23392s;
    public boolean v;
    public boolean f23393w;
    public boolean f23394x;
    public ak0 f23395y;

    public ck0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f23390n = new ArrayList();
        this.f23391r = new LongSparseArray();
        this.f23394x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f23387b = i10;
        this.f23388c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.K = f6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f23386a = i11;
        uj0 uj0Var = new uj0(this, context, f6Var);
        this.e = uj0Var;
        s4.c0 c0Var = new s4.c0();
        uj0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            uj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19199i6, false)));
        }
        vj0 vj0Var = new vj0(this, i10, context, f6Var, z10);
        this.f23389f = vj0Var;
        uj0Var.setAdapter(vj0Var);
        uj0Var.setOnItemClickListener(new j(this, 10));
        uj0Var.setOnItemLongClickListener(new mv(this, 15));
        uj0Var.j(new wj0(this, c0Var));
        uj0Var.setVerticalScrollBarEnabled(true);
        uj0Var.setAlpha(0.0f);
        addView(uj0Var, w7.y5.c(-1.0f, -1));
        xj0 xj0Var = new xj0(this, context, f6Var);
        this.h = xj0Var;
        xj0Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f19199i6, -1);
        xj0Var.setIsSingleCell(true);
        xj0Var.setItemsCount(this.f23386a);
        addView(xj0Var, w7.y5.c(-1.0f, -1));
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
        xj0Var.setViewType(i12);
    }

    public static void a(ck0 ck0Var, TLObject tLObject) {
        ArrayList arrayList = ck0Var.H;
        LongSparseArray longSparseArray = ck0Var.f23391r;
        ArrayList arrayList2 = ck0Var.f23390n;
        int i10 = ck0Var.f23387b;
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
                if (d.f49448g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (ck0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                ck0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.f7(12)));
            ck0Var.f23389f.l();
            if (!ck0Var.f23393w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(qr.f27653f);
                duration.addUpdateListener(new s70(ck0Var, 5));
                duration.addListener(new gd0(ck0Var, 7));
                duration.start();
                ck0Var.j();
                ck0Var.f23393w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            ck0Var.f23392s = str;
            if (str == null) {
                ck0Var.f23394x = false;
            }
            ck0Var.v = false;
            return;
        }
        ck0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f23387b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f23388c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f18436id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f23392s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 11), 64);
    }

    public final void d(org.telegram.ui.qe qeVar) {
        this.G = qeVar;
    }

    public final void e(org.telegram.ui.b7 b7Var) {
        this.f23395y = b7Var;
    }

    public final void f(org.telegram.ui.cg cgVar) {
        this.F = cgVar;
    }

    public final void g(org.telegram.ui.bg bgVar) {
        this.E = bgVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f23390n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rj0 rj0Var = (rj0) it.next();
                TLObject tLObject = rj0Var.f28000a;
                if (rj0Var.f28002c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == rj0Var.f28001b) {
                                messagePeerReaction.date = rj0Var.f28002c;
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
            rj0 rj0Var2 = (rj0) it2.next();
            long j3 = rj0Var2.f28001b;
            TLObject tLObject2 = rj0Var2.f28000a;
            LongSparseArray longSparseArray = this.f23391r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f18490id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f18343id;
                }
                tL_messagePeerReaction.date = rj0Var2.f28002c;
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
        this.f23389f.l();
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
            i10 = this.f23387b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(p5.f(i10, ((zg.p0) arrayList3.get(i11)).f49448g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f18363id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f18363id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        eb0 eb0Var = new eb0(this.f23387b, getContext(), this.K, arrayList2, 1);
        this.J = eb0Var;
        eb0Var.K = false;
    }

    public final void j() {
        if (this.f23395y != null) {
            int size = this.f23390n.size();
            if (size == 0) {
                size = this.f23386a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            eb0 eb0Var = this.J;
            if (eb0Var != null) {
                dp = org.telegram.messenger.l0.C(8.0f, eb0Var.getMeasuredHeight(), dp);
            }
            uj0 uj0Var = this.e;
            if (uj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(uj0Var.getMeasuredHeight(), dp);
            }
            this.f23395y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f23393w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f23386a = i10;
        this.h.setItemsCount(i10);
    }
}
