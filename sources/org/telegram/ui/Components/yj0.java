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
public final class yj0 extends FrameLayout {
    public xj0 B;
    public xj0 C;
    public vj0 D;
    public final ArrayList E;
    public final ArrayList F;
    public wa0 G;
    public final org.telegram.ui.ActionBar.f6 H;
    public int f31032a;
    public final int f31033b;
    public final MessageObject f31034c;
    public final TLRPC.Reaction d;
    public final qj0 e;
    public final rj0 f31035f;
    public final tj0 h;
    public final ArrayList f31036n;
    public final LongSparseArray f31037r;
    public String f31038s;
    public boolean v;
    public boolean f31039w;
    public boolean f31040x;
    public wj0 f31041y;

    public yj0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z4) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f31036n = new ArrayList();
        this.f31037r = new LongSparseArray();
        this.f31040x = true;
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = new ArrayList();
        this.f31033b = i10;
        this.f31034c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.H = f6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f31032a = i11;
        qj0 qj0Var = new qj0(this, context, f6Var);
        this.e = qj0Var;
        f2.i0 i0Var = new f2.i0();
        qj0Var.setLayoutManager(i0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            qj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false)));
        }
        rj0 rj0Var = new rj0(this, i10, context, f6Var, z4);
        this.f31035f = rj0Var;
        qj0Var.setAdapter(rj0Var);
        qj0Var.setOnItemClickListener(new k(this, 10));
        qj0Var.setOnItemLongClickListener(new ev(this, 14));
        qj0Var.j(new sj0(this, i0Var));
        qj0Var.setVerticalScrollBarEnabled(true);
        qj0Var.setAlpha(0.0f);
        addView(qj0Var, k7.b6.c(-1.0f, -1));
        tj0 tj0Var = new tj0(this, context, f6Var);
        this.h = tj0Var;
        tj0Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f19971i6, -1);
        tj0Var.setIsSingleCell(true);
        tj0Var.setItemsCount(this.f31032a);
        addView(tj0Var, k7.b6.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(mg.q0.d(reaction));
            i();
        }
        if (arrayList.isEmpty()) {
            i12 = 16;
        } else {
            i12 = 23;
        }
        tj0Var.setViewType(i12);
    }

    public static void a(yj0 yj0Var, TLObject tLObject) {
        ArrayList arrayList = yj0Var.E;
        LongSparseArray longSparseArray = yj0Var.f31037r;
        ArrayList arrayList2 = yj0Var.f31036n;
        int i10 = yj0Var.f31033b;
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
                mg.q0 d = mg.q0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f14096g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (yj0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                yj0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new kf.d(18)));
            yj0Var.f31035f.l();
            if (!yj0Var.f31039w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(mr.f27122f);
                duration.addUpdateListener(new j70(yj0Var, 5));
                duration.addListener(new od0(yj0Var, 5));
                duration.start();
                yj0Var.j();
                yj0Var.f31039w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            yj0Var.f31038s = str;
            if (str == null) {
                yj0Var.f31040x = false;
            }
            yj0Var.v = false;
            return;
        }
        yj0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f31033b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f31034c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f19252id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f31038s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new y1(this, 11), 64);
    }

    public final void d(org.telegram.ui.ve veVar) {
        this.D = veVar;
    }

    public final void e(org.telegram.ui.f7 f7Var) {
        this.f31041y = f7Var;
    }

    public final void f(org.telegram.ui.xf xfVar) {
        this.C = xfVar;
    }

    public final void g(org.telegram.ui.wf wfVar) {
        this.B = wfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f31036n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nj0 nj0Var = (nj0) it.next();
                TLObject tLObject = nj0Var.f27280a;
                if (nj0Var.f27282c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == nj0Var.f27281b) {
                                messagePeerReaction.date = nj0Var.f27282c;
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
            nj0 nj0Var2 = (nj0) it2.next();
            long j10 = nj0Var2.f27281b;
            TLObject tLObject2 = nj0Var2.f27280a;
            LongSparseArray longSparseArray = this.f31037r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f19306id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f19159id;
                }
                tL_messagePeerReaction.date = nj0Var2.f27282c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new kf.d(17)));
        this.f31035f.l();
        j();
    }

    public final void i() {
        int i10;
        ArrayList arrayList = this.F;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (true) {
            ArrayList arrayList3 = this.E;
            int size = arrayList3.size();
            i10 = this.f31033b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(l5.f(i10, ((mg.q0) arrayList3.get(i11)).f14096g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f19179id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f19179id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        wa0 wa0Var = new wa0(this.f31033b, getContext(), this.H, arrayList2, 1);
        this.G = wa0Var;
        wa0Var.H = false;
    }

    public final void j() {
        if (this.f31041y != null) {
            int size = this.f31036n.size();
            if (size == 0) {
                size = this.f31032a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            wa0 wa0Var = this.G;
            if (wa0Var != null) {
                dp = org.telegram.messenger.y3.C(8.0f, wa0Var.getMeasuredHeight(), dp);
            }
            qj0 qj0Var = this.e;
            if (qj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(qj0Var.getMeasuredHeight(), dp);
            }
            this.f31041y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f31039w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f31032a = i10;
        this.h.setItemsCount(i10);
    }
}
