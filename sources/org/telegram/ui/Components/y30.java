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
public final class y30 extends r71 {
    public final x30 T;
    public int U;
    public final TLRPC.Chat V;
    public final TLRPC.ChatFull W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final a0.h f32797a0;
    public final a0.h f32798b0;
    public boolean f32799c0;
    public boolean f32800d0;
    public final a0.h f32801e0;
    public final HashSet f32802f0;
    public org.telegram.ui.t20 f32803g0;
    public boolean f32804h0;
    public int f32805i0;
    public int f32806j0;
    public int f32807k0;
    public int f32808l0;
    public int m0;
    public int f32809n0;
    public int f32810o0;
    public int f32811p0;
    public int f32812q0;
    public int f32813r0;

    public y30(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(context, i10, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f32797a0 = new a0.h();
        this.f32798b0 = new a0.h();
        setDimBehindAlpha(75);
        this.V = chat;
        this.W = chatFull;
        this.f32801e0 = hVar;
        this.f32802f0 = hashSet;
        this.d.setOnItemClickListener(new j(this, 9));
        x30 x30Var = new x30(this, context);
        this.T = x30Var;
        this.e = x30Var;
        ai.u1 u1Var = this.d;
        u30 u30Var = new u30(this, context);
        this.f30090f = u30Var;
        u1Var.setAdapter(u30Var);
        if (!this.f32799c0) {
            this.Z = false;
            T();
        }
        U();
        G(0.0f);
    }

    public static int M(y30 y30Var, int i10, TLObject tLObject, TLObject tLObject2) {
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(y30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(y30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static void N(y30 y30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        boolean z10;
        vx0 vx0Var = y30Var.f30093s;
        a0.h hVar3 = y30Var.f32797a0;
        a0.h hVar4 = y30Var.f32798b0;
        ArrayList arrayList2 = y30Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(y30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(y30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(y30Var.currentAccount).getClientUserId();
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
            y30Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = y30Var.Y;
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
                if (hVar4.f(peerId) != null || ((hVar2 = y30Var.f32801e0) != null && hVar2.h(peerId) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User user = MessagesController.getInstance(y30Var.currentAccount).getUser(Long.valueOf(peerId));
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
                if (y30Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.mq(y30Var, ConnectionsManager.getInstance(y30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (y30Var.U <= 0) {
            y30Var.f32799c0 = false;
            y30Var.f32800d0 = true;
            if (y30Var.f32812q0 == 1) {
                i10 = 1;
            } else {
                km0 km0Var = y30Var.f30090f;
                if (km0Var != null) {
                    i10 = km0Var.h() - 1;
                } else {
                    i10 = 0;
                }
            }
            y30Var.J(i10);
            if (arrayList2.isEmpty()) {
                y30Var.f32804h0 = true;
                y30Var.S();
            }
        }
        y30Var.U();
        km0 km0Var2 = y30Var.f30090f;
        if (km0Var2 != null) {
            km0Var2.l();
            if (vx0Var != null && y30Var.f30090f.h() == 0 && y30Var.f32800d0) {
                vx0Var.e(false, true);
            }
        }
    }

    public static int R(y30 y30Var) {
        return y30Var.currentAccount;
    }

    @Override
    public final void D(MotionEvent motionEvent, ei.e2 e2Var) {
        org.telegram.ui.u50 u50Var = this.f32803g0.f41861a;
        if (!u50Var.f42308w0) {
            if (motionEvent.getX() > e2Var.getLeft() && motionEvent.getX() < e2Var.getRight() && motionEvent.getY() > e2Var.getTop() && motionEvent.getY() < e2Var.getBottom()) {
                u50Var.s1(u50Var.E1, null, e2Var, true);
            } else {
                u50Var.s1(u50Var.E1, null, e2Var, false);
            }
        }
    }

    @Override
    public final void F(String str) {
        x30 x30Var = this.T;
        hg.a2 a2Var = x30Var.d;
        y30 y30Var = x30Var.f32507w;
        v30 v30Var = x30Var.e;
        if (v30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v30Var);
            x30Var.e = null;
        }
        a2Var.f(null, null);
        TLRPC.Chat chat = y30Var.V;
        ai.u1 u1Var = y30Var.d;
        a2Var.g(null, true, false, true, false, chat.f20344id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            y30Var.f30093s.e(true, true);
            u1Var.W1 = false;
            u1Var.X1 = 0;
            x30Var.l();
            u1Var.W1 = true;
            u1Var.X1 = 0;
            x30Var.h = true;
            int i10 = x30Var.f32504n + 1;
            x30Var.f32504n = i10;
            v30 v30Var2 = new v30(x30Var, str, i10, 0);
            x30Var.e = v30Var2;
            AndroidUtilities.runOnUIThread(v30Var2, 300L);
            s4.g0 adapter = u1Var.getAdapter();
            km0 km0Var = y30Var.e;
            if (adapter != km0Var) {
                u1Var.setAdapter(km0Var);
                return;
            }
            return;
        }
        x30Var.f32504n = -1;
    }

    @Override
    public final void K() {
        this.I = org.telegram.ui.ActionBar.k6.Pg;
        this.J = org.telegram.ui.ActionBar.k6.f21210eg;
        int i10 = org.telegram.ui.ActionBar.k6.f21119a;
        this.K = org.telegram.ui.ActionBar.k6.fg;
        this.L = org.telegram.ui.ActionBar.k6.f21490tg;
        this.M = org.telegram.ui.ActionBar.k6.f21377ng;
        this.N = org.telegram.ui.ActionBar.k6.f21395og;
        this.O = org.telegram.ui.ActionBar.k6.f21338lg;
        this.P = org.telegram.ui.ActionBar.k6.f21451rg;
        this.Q = org.telegram.ui.ActionBar.k6.f21357mg;
    }

    public final void S() {
        if (!this.f32804h0) {
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
                if (j11 == j10 || this.f32801e0.h(j11) >= 0 || this.f32802f0.contains(Long.valueOf(j11))) {
                    arrayList2.remove(i10);
                    i10--;
                    size--;
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new hg.d(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 2));
    }

    public final void T() {
        a0.h hVar;
        TLRPC.Chat chat = this.V;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.W;
        if (!isChannel) {
            this.f32799c0 = false;
            ArrayList arrayList = this.X;
            arrayList.clear();
            this.Y.clear();
            a0.h hVar2 = this.f32797a0;
            hVar2.b();
            this.f32798b0.b();
            if (chatFull != null) {
                long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size = chatFull.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                    long j11 = chatParticipant.user_id;
                    if (j11 != j10 && ((hVar = this.f32801e0) == null || hVar.h(j11) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f32804h0 = true;
                    S();
                }
            }
            U();
            km0 km0Var = this.f30090f;
            if (km0Var != null) {
                km0Var.l();
                return;
            }
            return;
        }
        this.f32799c0 = true;
        vx0 vx0Var = this.f30093s;
        if (vx0Var != null) {
            vx0Var.e(true, false);
        }
        km0 km0Var2 = this.f30090f;
        if (km0Var2 != null) {
            km0Var2.l();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
        if (chatFull != null && chatFull.participants_count <= 200) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        } else if (!this.Z) {
            this.U = 2;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
            this.Z = true;
            T();
        } else {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        }
        tL_channels_getParticipants.filter.f20343q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.vc(17, this, tL_channels_getParticipants));
    }

    public final void U() {
        this.f32805i0 = -1;
        this.f32807k0 = -1;
        this.f32808l0 = -1;
        this.m0 = -1;
        this.f32809n0 = -1;
        this.f32810o0 = -1;
        this.f32811p0 = -1;
        this.f32806j0 = -1;
        boolean z10 = true;
        this.f32813r0 = 1;
        TLRPC.Chat chat = this.V;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.f32813r0;
            this.f32813r0 = i10 + 1;
            this.f32805i0 = i10;
        }
        if (!this.f32799c0 || this.f32800d0) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i11 = this.f32813r0;
                int i12 = i11 + 1;
                this.f32813r0 = i12;
                this.m0 = i11;
                this.f32809n0 = i12;
                int size = arrayList.size() + i12;
                this.f32813r0 = size;
                this.f32810o0 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.X;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.f32813r0;
                    this.f32813r0 = i13 + 1;
                    this.f32811p0 = i13;
                }
                int i14 = this.f32813r0;
                this.f32807k0 = i14;
                int size2 = arrayList2.size() + i14;
                this.f32813r0 = size2;
                this.f32808l0 = size2;
            }
        }
        if (this.f32799c0) {
            int i15 = this.f32813r0;
            this.f32813r0 = i15 + 1;
            this.f32812q0 = i15;
        }
        int i16 = this.f32813r0;
        this.f32813r0 = i16 + 1;
        this.f32806j0 = i16;
    }
}
