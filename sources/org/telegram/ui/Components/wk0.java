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
public final class wk0 extends FrameLayout {
    public vk0 E;
    public vk0 F;
    public tk0 G;
    public final ArrayList H;
    public final ArrayList I;
    public wb0 J;
    public final org.telegram.ui.ActionBar.d6 K;
    public int f32663a;
    public final int f32664b;
    public final MessageObject f32665c;
    public final TLRPC.Reaction d;
    public final ok0 f32666e;
    public final pk0 f32667f;
    public final rk0 h;
    public final ArrayList f32668n;
    public final LongSparseArray f32669r;
    public String f32670s;
    public boolean v;
    public boolean f32671w;
    public boolean f32672x;
    public uk0 f32673y;

    public wk0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f32668n = new ArrayList();
        this.f32669r = new LongSparseArray();
        this.f32672x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f32664b = i10;
        this.f32665c = messageObject;
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
        this.f32663a = i11;
        ok0 ok0Var = new ok0(this, context, d6Var);
        this.f32666e = ok0Var;
        s4.d0 d0Var = new s4.d0();
        ok0Var.setLayoutManager(d0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            ok0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20877i6, false)));
        }
        pk0 pk0Var = new pk0(this, i10, context, d6Var, z10);
        this.f32667f = pk0Var;
        ok0Var.setAdapter(pk0Var);
        ok0Var.setOnItemClickListener(new j(this, 10));
        ok0Var.setOnItemLongClickListener(new cw(this, 15));
        ok0Var.j(new qk0(this, d0Var));
        ok0Var.setVerticalScrollBarEnabled(true);
        ok0Var.setAlpha(0.0f);
        addView(ok0Var, w7.x5.d(-1.0f, -1));
        rk0 rk0Var = new rk0(this, context, d6Var);
        this.h = rk0Var;
        rk0Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f20877i6, -1);
        rk0Var.setIsSingleCell(true);
        rk0Var.setItemsCount(this.f32663a);
        addView(rk0Var, w7.x5.d(-1.0f, -1));
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
        rk0Var.setViewType(i12);
    }

    public static void a(wk0 wk0Var, TLObject tLObject) {
        ArrayList arrayList = wk0Var.H;
        LongSparseArray longSparseArray = wk0Var.f32669r;
        ArrayList arrayList2 = wk0Var.f32668n;
        int i10 = wk0Var.f32664b;
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
                if (d.f54705g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (wk0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                wk0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.h7(13)));
            wk0Var.f32667f.l();
            if (!wk0Var.f32671w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(is.f27451f);
                duration.addUpdateListener(new k80(wk0Var, 6));
                duration.addListener(new wd0(wk0Var, 7));
                duration.start();
                wk0Var.j();
                wk0Var.f32671w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            wk0Var.f32670s = str;
            if (str == null) {
                wk0Var.f32672x = false;
            }
            wk0Var.v = false;
            return;
        }
        wk0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f32664b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f32665c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f20125id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f32670s;
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
        this.f32673y = z6Var;
    }

    public final void f(org.telegram.ui.bg bgVar) {
        this.F = bgVar;
    }

    public final void g(org.telegram.ui.ag agVar) {
        this.E = agVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f32668n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lk0 lk0Var = (lk0) it.next();
                TLObject tLObject = lk0Var.f28358a;
                if (lk0Var.f28360c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == lk0Var.f28359b) {
                                messagePeerReaction.date = lk0Var.f28360c;
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
            lk0 lk0Var2 = (lk0) it2.next();
            long j3 = lk0Var2.f28359b;
            TLObject tLObject2 = lk0Var2.f28358a;
            LongSparseArray longSparseArray = this.f32669r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f20179id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f20032id;
                }
                tL_messagePeerReaction.date = lk0Var2.f28360c;
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
        this.f32667f.l();
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
            i10 = this.f32664b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(s5.f(i10, ((zg.n0) arrayList3.get(i11)).f54705g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f20052id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f20052id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        wb0 wb0Var = new wb0(this.f32664b, 1, getContext(), arrayList2, this.K);
        this.J = wb0Var;
        wb0Var.K = false;
    }

    public final void j() {
        if (this.f32673y != null) {
            int size = this.f32668n.size();
            if (size == 0) {
                size = this.f32663a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            wb0 wb0Var = this.J;
            if (wb0Var != null) {
                dp = org.telegram.messenger.q.C(8.0f, wb0Var.getMeasuredHeight(), dp);
            }
            ok0 ok0Var = this.f32666e;
            if (ok0Var.getMeasuredHeight() != 0) {
                dp = Math.min(ok0Var.getMeasuredHeight(), dp);
            }
            this.f32673y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f32671w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f32663a = i10;
        this.h.setItemsCount(i10);
    }
}
