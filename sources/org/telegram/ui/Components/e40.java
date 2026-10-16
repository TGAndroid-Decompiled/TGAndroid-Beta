package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e40 extends r71 {
    public final d40 T;
    public int U;
    public final TLRPC.Chat V;
    public final TLRPC.ChatFull W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final a0.h f24286a0;
    public final a0.h f24287b0;
    public boolean f24288c0;
    public boolean f24289d0;
    public final a0.h f24290e0;
    public final HashSet f24291f0;
    public org.telegram.ui.n30 f24292g0;
    public boolean f24293h0;
    public int f24294i0;
    public int f24295j0;
    public int f24296k0;
    public int f24297l0;
    public int m0;
    public int f24298n0;
    public int f24299o0;
    public int f24300p0;
    public int f24301q0;
    public int f24302r0;

    public e40(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(context, i10, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f24286a0 = new a0.h();
        this.f24287b0 = new a0.h();
        setDimBehindAlpha(75);
        this.V = chat;
        this.W = chatFull;
        this.f24290e0 = hVar;
        this.f24291f0 = hashSet;
        this.d.setOnItemClickListener(new j(this, 9));
        d40 d40Var = new d40(this, context);
        this.T = d40Var;
        this.e = d40Var;
        bi.o0 o0Var = this.d;
        a40 a40Var = new a40(this, context);
        this.f28460f = a40Var;
        o0Var.setAdapter(a40Var);
        if (!this.f24288c0) {
            this.Z = false;
            U();
        }
        V();
        I(0.0f);
    }

    public static int N(e40 e40Var, int i10, TLObject tLObject, TLObject tLObject2) {
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(e40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(e40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
        if (user != null && (userStatus2 = user.status) != null) {
            if (user.self) {
                i11 = i10 + 50000;
            } else {
                i11 = userStatus2.expires;
            }
        } else {
            i11 = 0;
        }
        if (user2 != null && (userStatus = user2.status) != null) {
            if (user2.self) {
                i12 = i10 + 50000;
            } else {
                i12 = userStatus.expires;
            }
        } else {
            i12 = 0;
        }
        if (i11 > 0 && i12 > 0) {
            if (i11 <= i12) {
                if (i11 < i12) {
                    return -1;
                }
            } else {
                return 1;
            }
        } else if (i11 < 0 && i12 < 0) {
            if (i11 <= i12) {
                if (i11 < i12) {
                    return -1;
                }
            } else {
                return 1;
            }
        } else if (i11 >= 0 || i12 <= 0) {
            if (i11 == 0 && i12 != 0) {
                return -1;
            }
            if (i12 >= 0 || i11 <= 0) {
                if (i12 == 0 && i11 != 0) {
                    return 1;
                }
            } else {
                return 1;
            }
        } else {
            return -1;
        }
        return 0;
    }

    public static void O(e40 e40Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        boolean z10;
        wx0 wx0Var = e40Var.f28463s;
        a0.h hVar3 = e40Var.f24286a0;
        a0.h hVar4 = e40Var.f24287b0;
        ArrayList arrayList2 = e40Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(e40Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(e40Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(e40Var.currentAccount).getClientUserId();
            int i11 = 0;
            while (true) {
                if (i11 >= tL_channels_channelParticipants.participants.size()) {
                    break;
                } else if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i11).peer) == clientUserId) {
                    tL_channels_channelParticipants.participants.remove(i11);
                    break;
                } else {
                    i11++;
                }
            }
            e40Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = e40Var.Y;
                hVar = hVar4;
            } else {
                hVar = hVar3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) arrayList2.get(i13)).peer);
                if (hVar4.f(peerId) != null || ((hVar2 = e40Var.f24290e0) != null && hVar2.h(peerId) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User user = MessagesController.getInstance(e40Var.currentAccount).getUser(Long.valueOf(peerId));
                if ((user != null && user.bot) || UserObject.isDeleted(user)) {
                    z10 = true;
                }
                if (z10) {
                    arrayList2.remove(i13);
                    hVar3.l(peerId);
                    i13--;
                    size2--;
                }
                i13++;
            }
            try {
                if (e40Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.cr(e40Var, ConnectionsManager.getInstance(e40Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (e40Var.U <= 0) {
            e40Var.f24288c0 = false;
            e40Var.f24289d0 = true;
            if (e40Var.f24301q0 == 1) {
                i10 = 1;
            } else {
                lm0 lm0Var = e40Var.f28460f;
                if (lm0Var != null) {
                    i10 = lm0Var.h() - 1;
                } else {
                    i10 = 0;
                }
            }
            e40Var.K(i10);
            if (arrayList2.isEmpty()) {
                e40Var.f24293h0 = true;
                e40Var.T();
            }
        }
        e40Var.V();
        lm0 lm0Var2 = e40Var.f28460f;
        if (lm0Var2 != null) {
            lm0Var2.l();
            if (wx0Var != null && e40Var.f28460f.h() == 0 && e40Var.f24289d0) {
                wx0Var.e(false, true);
            }
        }
    }

    public static int S(e40 e40Var) {
        return e40Var.currentAccount;
    }

    @Override
    public final void F(MotionEvent motionEvent, di.g2 g2Var) {
        org.telegram.ui.n60 n60Var = this.f24292g0.f38129a;
        if (!n60Var.f38248w0) {
            if (motionEvent.getX() > g2Var.getLeft() && motionEvent.getX() < g2Var.getRight() && motionEvent.getY() > g2Var.getTop() && motionEvent.getY() < g2Var.getBottom()) {
                n60Var.t1(n60Var.E1, null, g2Var, true);
            } else {
                n60Var.t1(n60Var.E1, null, g2Var, false);
            }
        }
    }

    @Override
    public final void H(String str) {
        d40 d40Var = this.T;
        hg.a2 a2Var = d40Var.d;
        e40 e40Var = d40Var.f23981w;
        b40 b40Var = d40Var.e;
        if (b40Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b40Var);
            d40Var.e = null;
        }
        a2Var.f(null, null);
        TLRPC.Chat chat = e40Var.V;
        bi.o0 o0Var = e40Var.d;
        a2Var.g(null, true, false, true, false, chat.f18916id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            e40Var.f28463s.e(true, true);
            o0Var.W1 = false;
            o0Var.X1 = 0;
            d40Var.l();
            o0Var.W1 = true;
            o0Var.X1 = 0;
            d40Var.h = true;
            int i10 = d40Var.f23978n + 1;
            d40Var.f23978n = i10;
            b40 b40Var2 = new b40(d40Var, str, i10, 0);
            d40Var.e = b40Var2;
            AndroidUtilities.runOnUIThread(b40Var2, 300L);
            s4.g0 adapter = o0Var.getAdapter();
            lm0 lm0Var = e40Var.e;
            if (adapter != lm0Var) {
                o0Var.setAdapter(lm0Var);
                return;
            }
            return;
        }
        d40Var.f23978n = -1;
    }

    @Override
    public final void L() {
        this.I = org.telegram.ui.ActionBar.g6.Pg;
        this.J = org.telegram.ui.ActionBar.g6.f19627eg;
        int i10 = org.telegram.ui.ActionBar.g6.f19536a;
        this.K = org.telegram.ui.ActionBar.g6.fg;
        this.L = org.telegram.ui.ActionBar.g6.f19907tg;
        this.M = org.telegram.ui.ActionBar.g6.f19794ng;
        this.N = org.telegram.ui.ActionBar.g6.f19812og;
        this.O = org.telegram.ui.ActionBar.g6.f19755lg;
        this.P = org.telegram.ui.ActionBar.g6.f19868rg;
        this.Q = org.telegram.ui.ActionBar.g6.f19774mg;
    }

    public final void T() {
        if (!this.f24293h0) {
            return;
        }
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(this.currentAccount).contacts;
        ArrayList arrayList2 = this.Y;
        arrayList2.addAll(arrayList);
        long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i10);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j11 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j11 == j10 || this.f24290e0.h(j11) >= 0 || this.f24291f0.contains(Long.valueOf(j11))) {
                    arrayList2.remove(i10);
                    i10--;
                    size--;
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new hg.d(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 2));
    }

    public final void U() {
        a0.h hVar;
        TLRPC.Chat chat = this.V;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.W;
        if (!isChannel) {
            this.f24288c0 = false;
            ArrayList arrayList = this.X;
            arrayList.clear();
            this.Y.clear();
            a0.h hVar2 = this.f24286a0;
            hVar2.b();
            this.f24287b0.b();
            if (chatFull != null) {
                long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size = chatFull.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                    long j11 = chatParticipant.user_id;
                    if (j11 != j10 && ((hVar = this.f24290e0) == null || hVar.h(j11) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f24293h0 = true;
                    T();
                }
            }
            V();
            lm0 lm0Var = this.f28460f;
            if (lm0Var != null) {
                lm0Var.l();
                return;
            }
            return;
        }
        this.f24288c0 = true;
        wx0 wx0Var = this.f28463s;
        if (wx0Var != null) {
            wx0Var.e(true, false);
        }
        lm0 lm0Var2 = this.f28460f;
        if (lm0Var2 != null) {
            lm0Var2.l();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
        if (chatFull != null && chatFull.participants_count <= 200) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        } else if (!this.Z) {
            this.U = 2;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
            this.Z = true;
            U();
        } else {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        }
        tL_channels_getParticipants.filter.f18915q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.to(10, this, tL_channels_getParticipants));
    }

    public final void V() {
        this.f24294i0 = -1;
        this.f24296k0 = -1;
        this.f24297l0 = -1;
        this.m0 = -1;
        this.f24298n0 = -1;
        this.f24299o0 = -1;
        this.f24300p0 = -1;
        this.f24295j0 = -1;
        boolean z10 = true;
        this.f24302r0 = 1;
        TLRPC.Chat chat = this.V;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.f24302r0;
            this.f24302r0 = i10 + 1;
            this.f24294i0 = i10;
        }
        if (!this.f24288c0 || this.f24289d0) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i11 = this.f24302r0;
                int i12 = i11 + 1;
                this.f24302r0 = i12;
                this.m0 = i11;
                this.f24298n0 = i12;
                int size = arrayList.size() + i12;
                this.f24302r0 = size;
                this.f24299o0 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.X;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.f24302r0;
                    this.f24302r0 = i13 + 1;
                    this.f24300p0 = i13;
                }
                int i14 = this.f24302r0;
                this.f24296k0 = i14;
                int size2 = arrayList2.size() + i14;
                this.f24302r0 = size2;
                this.f24297l0 = size2;
            }
        }
        if (this.f24288c0) {
            int i15 = this.f24302r0;
            this.f24302r0 = i15 + 1;
            this.f24301q0 = i15;
        }
        int i16 = this.f24302r0;
        this.f24302r0 = i16 + 1;
        this.f24295j0 = i16;
    }
}
