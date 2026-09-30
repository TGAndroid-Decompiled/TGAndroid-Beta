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
public final class dk0 extends FrameLayout {
    public ck0 E;
    public ck0 F;
    public ak0 G;
    public final ArrayList H;
    public final ArrayList I;
    public ib0 J;
    public final org.telegram.ui.ActionBar.d6 K;
    public int f23665a;
    public final int f23666b;
    public final MessageObject f23667c;
    public final TLRPC.Reaction d;
    public final vj0 e;
    public final wj0 f23668f;
    public final yj0 h;
    public final ArrayList f23669n;
    public final LongSparseArray f23670r;
    public String f23671s;
    public boolean v;
    public boolean f23672w;
    public boolean f23673x;
    public bk0 f23674y;

    public dk0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f23669n = new ArrayList();
        this.f23670r = new LongSparseArray();
        this.f23673x = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f23666b = i10;
        this.f23667c = messageObject;
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
        this.f23665a = i11;
        vj0 vj0Var = new vj0(this, context, d6Var);
        this.e = vj0Var;
        s4.c0 c0Var = new s4.c0();
        vj0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            vj0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165i6, false)));
        }
        wj0 wj0Var = new wj0(this, i10, context, d6Var, z10);
        this.f23668f = wj0Var;
        vj0Var.setAdapter(wj0Var);
        vj0Var.setOnItemClickListener(new j(this, 10));
        vj0Var.setOnItemLongClickListener(new ov(this, 15));
        vj0Var.j(new xj0(this, c0Var));
        vj0Var.setVerticalScrollBarEnabled(true);
        vj0Var.setAlpha(0.0f);
        addView(vj0Var, w7.y5.c(-1.0f, -1));
        yj0 yj0Var = new yj0(this, context, d6Var);
        this.h = yj0Var;
        yj0Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f19165i6, -1);
        yj0Var.setIsSingleCell(true);
        yj0Var.setItemsCount(this.f23665a);
        addView(yj0Var, w7.y5.c(-1.0f, -1));
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
        yj0Var.setViewType(i12);
    }

    public static void a(dk0 dk0Var, TLObject tLObject) {
        ArrayList arrayList = dk0Var.H;
        LongSparseArray longSparseArray = dk0Var.f23670r;
        ArrayList arrayList2 = dk0Var.f23669n;
        int i10 = dk0Var.f23666b;
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
                if (d.f49505g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(peerId, arrayList3);
            }
            if (dk0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                dk0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new ai.g7(12)));
            dk0Var.f23668f.l();
            if (!dk0Var.f23672w) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(tr.f28636f);
                duration.addUpdateListener(new v70(dk0Var, 5));
                duration.addListener(new id0(dk0Var, 7));
                duration.start();
                dk0Var.j();
                dk0Var.f23672w = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            dk0Var.f23671s = str;
            if (str == null) {
                dk0Var.f23673x = false;
            }
            dk0Var.v = false;
            return;
        }
        dk0Var.v = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.v = true;
        int i10 = this.f23666b;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        MessageObject messageObject = this.f23667c;
        tL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(messageObject.getDialogId());
        tL_messages_getMessageReactionsList.f18445id = messageObject.getId();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f23671s;
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
        this.f23674y = b7Var;
    }

    public final void f(org.telegram.ui.zf zfVar) {
        this.F = zfVar;
    }

    public final void g(org.telegram.ui.yf yfVar) {
        this.E = yfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f23669n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sj0 sj0Var = (sj0) it.next();
                TLObject tLObject = sj0Var.f28274a;
                if (sj0Var.f28276c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && MessageObject.getPeerId(messagePeerReaction.peer_id) == sj0Var.f28275b) {
                                messagePeerReaction.date = sj0Var.f28276c;
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
            sj0 sj0Var2 = (sj0) it2.next();
            long j3 = sj0Var2.f28275b;
            TLObject tLObject2 = sj0Var2.f28274a;
            LongSparseArray longSparseArray = this.f23670r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f18499id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f18352id;
                }
                tL_messagePeerReaction.date = sj0Var2.f28276c;
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
        this.f23668f.l();
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
            i10 = this.f23666b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(q5.f(i10, ((zg.o0) arrayList3.get(i11)).f49505g));
            if (inputStickerSet != null && !hashSet.contains(Long.valueOf(inputStickerSet.f18372id))) {
                arrayList2.add(inputStickerSet);
                hashSet.add(Long.valueOf(inputStickerSet.f18372id));
            }
            i11++;
        }
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        arrayList.addAll(arrayList2);
        ib0 ib0Var = new ib0(this.f23666b, getContext(), this.K, arrayList2, 1);
        this.J = ib0Var;
        ib0Var.K = false;
    }

    public final void j() {
        if (this.f23674y != null) {
            int size = this.f23669n.size();
            if (size == 0) {
                size = this.f23665a;
            }
            int dp = AndroidUtilities.dp(size * 50);
            ib0 ib0Var = this.J;
            if (ib0Var != null) {
                dp = org.telegram.messenger.f0.C(8.0f, ib0Var.getMeasuredHeight(), dp);
            }
            vj0 vj0Var = this.e;
            if (vj0Var.getMeasuredHeight() != 0) {
                dp = Math.min(vj0Var.getMeasuredHeight(), dp);
            }
            this.f23674y.a(this, dp);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f23672w && !this.v) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f23665a = i10;
        this.h.setItemsCount(i10);
    }
}
