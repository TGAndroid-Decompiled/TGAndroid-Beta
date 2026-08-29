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
    public oj0 A;
    public oj0 B;
    public mj0 C;
    public final ArrayList D;
    public final ArrayList E;
    public qa0 F;
    public final org.telegram.ui.ActionBar.c6 G;
    public int f31686a;
    public final int f31687b;
    public final MessageObject f31688c;
    public final TLRPC.Reaction d;
    public final hj0 f31689e;
    public final ij0 f31690f;
    public final kj0 h;
    public final ArrayList f31691n;
    public final LongSparseArray f31692r;
    public String f31693s;
    public boolean v;
    public boolean f31694w;
    public boolean f31695x;
    public nj0 f31696y;

    public pj0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f31691n = new ArrayList();
        this.f31692r = new LongSparseArray();
        this.f31695x = true;
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        this.E = new ArrayList();
        this.f31687b = i10;
        this.f31688c = messageObject;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.G = c6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f31686a = i11;
        hj0 hj0Var = new hj0(this, context, c6Var);
        this.f31689e = hj0Var;
        f2.j0 j0Var = new f2.j0();
        hj0Var.setLayoutManager(j0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            hj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false)));
        }
        ij0 ij0Var = new ij0(this, i10, context, c6Var, z10);
        this.f31690f = ij0Var;
        hj0Var.setAdapter(ij0Var);
        hj0Var.setOnItemClickListener(new k(this, 10));
        hj0Var.setOnItemLongClickListener(new cv(this, 14));
        hj0Var.j(new jj0(this, j0Var));
        hj0Var.setVerticalScrollBarEnabled(true);
        hj0Var.setAlpha(0.0f);
        addView(hj0Var, i7.f6.c(-1.0f, -1));
        kj0 kj0Var = new kj0(this, context, c6Var);
        this.h = kj0Var;
        kj0Var.f(org.telegram.ui.ActionBar.g6.G8, org.telegram.ui.ActionBar.g6.f23152i6, -1);
        kj0Var.setIsSingleCell(true);
        kj0Var.setItemsCount(this.f31686a);
        addView(kj0Var, i7.f6.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            arrayList.clear();
            arrayList.add(kg.q0.d(reaction));
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
        ArrayList arrayList = pj0Var.D;
        LongSparseArray longSparseArray = pj0Var.f31692r;
        ArrayList arrayList2 = pj0Var.f31691n;
        int i10 = pj0Var.f31687b;
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
                kg.q0 d = kg.q0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f13826g != 0) {
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
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new jf.d(18)));
            pj0Var.f31690f.l();
            if (!pj0Var.f31694w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(jr.f29800f);
                duration.addUpdateListener(new d70(pj0Var, 5));
                duration.addListener(new zz(pj0Var, 14));
                duration.start();
                pj0Var.j();
                pj0Var.f31694w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            pj0Var.f31693s = str;
            if (str == null) {
                pj0Var.f31695x = false;
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
        int i10 = this.f31687b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f31688c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f22485id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f31693s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new a2(this, 11), 64);
    }

    public final void d(org.telegram.ui.me meVar) {
        this.C = meVar;
    }

    public final void e(org.telegram.ui.z6 z6Var) {
        this.f31696y = z6Var;
    }

    public final void f(org.telegram.ui.of ofVar) {
        this.B = ofVar;
    }

    public final void g(org.telegram.ui.nf nfVar) {
        this.A = nfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f31691n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ej0 ej0Var = (ej0) it.next();
                TLObject tLObject = ej0Var.f28093a;
                if (ej0Var.f28095c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == ej0Var.f28094b) {
                                messagePeerReaction.date = ej0Var.f28095c;
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
            long j10 = ej0Var2.f28094b;
            TLObject tLObject2 = ej0Var2.f28093a;
            LongSparseArray longSparseArray = this.f31692r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f22539id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f22392id;
                }
                tL_messagePeerReaction.date = ej0Var2.f28095c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(MessageObject.getPeerId(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new jf.d(17)));
        this.f31690f.l();
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
            i10 = this.f31687b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(p5.f(i10, ((kg.q0) arrayList3.get(i11)).f13826g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f22412id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f22412id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        qa0 qa0Var = new qa0(this.f31687b, getContext(), this.G, arrayList2, 1);
        this.F = qa0Var;
        qa0Var.G = false;
    }

    public final void j() {
        if (this.f31696y != null) {
            int size = this.f31691n.size();
            if (size == 0) {
                size = this.f31686a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            qa0 qa0Var = this.F;
            if (qa0Var != null) {
                dp = org.telegram.messenger.x3.C(8.0f, qa0Var.getMeasuredHeight(), dp);
            }
            hj0 hj0Var = this.f31689e;
            if (hj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(hj0Var.getMeasuredHeight(), dp);
            }
            this.f31696y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f31694w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f31686a = i10;
        this.h.setItemsCount(i10);
    }
}
