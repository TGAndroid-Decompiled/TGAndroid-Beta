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
public final class bk0 extends FrameLayout {
    public ak0 E;
    public ak0 F;
    public yj0 G;
    public final ArrayList H;
    public final ArrayList I;
    public gb0 J;
    public final org.telegram.ui.ActionBar.d6 K;
    public int f23046a;
    public final int f23047b;
    public final MessageObject f23048c;
    public final TLRPC.Reaction d;
    public final tj0 e;
    public final uj0 f23049f;
    public final wj0 h;
    public final ArrayList f23050n;
    public final LongSparseArray f23051r;
    public String f23052s;
    public boolean v;
    public boolean f23053w;
    public boolean f23054x;
    public zj0 f23055y;

    public bk0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f23050n = new ArrayList();
        this.f23051r = new LongSparseArray();
        this.f23054x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f23047b = i10;
        this.f23048c = messageObject;
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
        this.f23046a = i11;
        tj0 tj0Var = new tj0(this, context, d6Var);
        this.e = tj0Var;
        s4.c0 c0Var = new s4.c0();
        tj0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            tj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19148i6, false)));
        }
        uj0 uj0Var = new uj0(this, i10, context, d6Var, z10);
        this.f23049f = uj0Var;
        tj0Var.setAdapter(uj0Var);
        tj0Var.setOnItemClickListener(new j(this, 10));
        tj0Var.setOnItemLongClickListener(new nv(this, 15));
        tj0Var.j(new vj0(this, c0Var));
        tj0Var.setVerticalScrollBarEnabled(true);
        tj0Var.setAlpha(0.0f);
        addView(tj0Var, w7.y5.c(-1.0f, -1));
        wj0 wj0Var = new wj0(this, context, d6Var);
        this.h = wj0Var;
        wj0Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f19148i6, -1);
        wj0Var.setIsSingleCell(true);
        wj0Var.setItemsCount(this.f23046a);
        addView(wj0Var, w7.y5.c(-1.0f, -1));
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
        wj0Var.setViewType(i12);
    }

    public static void a(bk0 bk0Var, TLObject tLObject) {
        ArrayList arrayList = bk0Var.H;
        LongSparseArray longSparseArray = bk0Var.f23051r;
        ArrayList arrayList2 = bk0Var.f23050n;
        int i10 = bk0Var.f23047b;
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
                if (d.f49396g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (bk0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                bk0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.g7(12)));
            bk0Var.f23049f.l();
            if (!bk0Var.f23053w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(sr.f28339f);
                duration.addUpdateListener(new t70(bk0Var, 5));
                duration.addListener(new gd0(bk0Var, 7));
                duration.start();
                bk0Var.j();
                bk0Var.f23053w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            bk0Var.f23052s = str;
            if (str == null) {
                bk0Var.f23054x = false;
            }
            bk0Var.v = false;
            return;
        }
        bk0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f23047b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f23048c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f18428id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f23052s;
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
        this.f23055y = b7Var;
    }

    public final void f(org.telegram.ui.zf zfVar) {
        this.F = zfVar;
    }

    public final void g(org.telegram.ui.yf yfVar) {
        this.E = yfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f23050n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qj0 qj0Var = (qj0) it.next();
                TLObject tLObject = qj0Var.f27694a;
                if (qj0Var.f27696c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == qj0Var.f27695b) {
                                messagePeerReaction.date = qj0Var.f27696c;
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
            qj0 qj0Var2 = (qj0) it2.next();
            long j3 = qj0Var2.f27695b;
            TLObject tLObject2 = qj0Var2.f27694a;
            LongSparseArray longSparseArray = this.f23051r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f18482id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f18335id;
                }
                tL_messagePeerReaction.date = qj0Var2.f27696c;
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
        this.f23049f.l();
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
            i10 = this.f23047b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(q5.f(i10, ((zg.o0) arrayList3.get(i11)).f49396g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f18355id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f18355id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        gb0 gb0Var = new gb0(this.f23047b, getContext(), this.K, arrayList2, 1);
        this.J = gb0Var;
        gb0Var.K = false;
    }

    public final void j() {
        if (this.f23055y != null) {
            int size = this.f23050n.size();
            if (size == 0) {
                size = this.f23046a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            gb0 gb0Var = this.J;
            if (gb0Var != null) {
                dp = org.telegram.messenger.f0.C(8.0f, gb0Var.getMeasuredHeight(), dp);
            }
            tj0 tj0Var = this.e;
            if (tj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(tj0Var.getMeasuredHeight(), dp);
            }
            this.f23055y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f23053w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f23046a = i10;
        this.h.setItemsCount(i10);
    }
}
