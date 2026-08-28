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
public final class b30 extends s51 {
    public final a30 P;
    public int Q;
    public final TLRPC.Chat R;
    public final TLRPC.ChatFull S;
    public final ArrayList T;
    public final ArrayList U;
    public boolean V;
    public final a0.h W;
    public final a0.h X;
    public boolean Y;
    public boolean Z;
    public final a0.h f27017a0;
    public final HashSet f27018b0;
    public org.telegram.ui.o20 f27019c0;
    public boolean f27020d0;
    public int f27021e0;
    public int f27022f0;
    public int f27023g0;
    public int f27024h0;
    public int f27025i0;
    public int f27026j0;
    public int f27027k0;
    public int f27028l0;
    public int m0;
    public int f27029n0;

    public b30(Context context, int i9, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(context, i9, null);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.W = new a0.h();
        this.X = new a0.h();
        setDimBehindAlpha(75);
        this.R = chat;
        this.S = chatFull;
        this.f27017a0 = hVar;
        this.f27018b0 = hashSet;
        this.d.setOnItemClickListener(new j(this, 9));
        a30 a30Var = new a30(this, context);
        this.P = a30Var;
        this.f32371e = a30Var;
        gh.f1 f1Var = this.d;
        x20 x20Var = new x20(this, context);
        this.f32372f = x20Var;
        f1Var.setAdapter(x20Var);
        if (!this.Y) {
            this.V = false;
            S();
        }
        T();
        G(0.0f);
    }

    public static int L(b30 b30Var, int i9, TLObject tLObject, TLObject tLObject2) {
        int i10;
        int i11;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(b30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(b30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
        if (user != null && (userStatus2 = user.status) != null) {
            if (user.self) {
                i10 = i9 + 50000;
            } else {
                i10 = userStatus2.expires;
            }
        } else {
            i10 = 0;
        }
        if (user2 != null && (userStatus = user2.status) != null) {
            if (user2.self) {
                i11 = i9 + 50000;
            } else {
                i11 = userStatus.expires;
            }
        } else {
            i11 = 0;
        }
        if (i10 > 0 && i11 > 0) {
            if (i10 <= i11) {
                if (i10 < i11) {
                    return -1;
                }
            } else {
                return 1;
            }
        } else if (i10 < 0 && i11 < 0) {
            if (i10 <= i11) {
                if (i10 < i11) {
                    return -1;
                }
            } else {
                return 1;
            }
        } else if (i10 >= 0 || i11 <= 0) {
            if (i10 == 0 && i11 != 0) {
                return -1;
            }
            if (i11 >= 0 || i10 <= 0) {
                if (i11 == 0 && i10 != 0) {
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

    public static void M(b30 b30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i9;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        boolean z10;
        gw0 gw0Var = b30Var.f32375s;
        a0.h hVar3 = b30Var.W;
        a0.h hVar4 = b30Var.X;
        ArrayList arrayList2 = b30Var.T;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(b30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(b30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(b30Var.currentAccount).getClientUserId();
            int i10 = 0;
            while (true) {
                if (i10 >= tL_channels_channelParticipants.participants.size()) {
                    break;
                } else if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i10).peer) == clientUserId) {
                    tL_channels_channelParticipants.participants.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
            b30Var.Q--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = b30Var.U;
                hVar = hVar4;
            } else {
                hVar = hVar3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                hVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) arrayList2.get(i12)).peer);
                if (hVar4.f(peerId) != null || ((hVar2 = b30Var.f27017a0) != null && hVar2.h(peerId) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User user = MessagesController.getInstance(b30Var.currentAccount).getUser(Long.valueOf(peerId));
                if ((user != null && user.bot) || UserObject.isDeleted(user)) {
                    z10 = true;
                }
                if (z10) {
                    arrayList2.remove(i12);
                    hVar3.l(peerId);
                    i12--;
                    size2--;
                }
                i12++;
            }
            try {
                if (b30Var.S.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.kq(b30Var, ConnectionsManager.getInstance(b30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (b30Var.Q <= 0) {
            b30Var.Y = false;
            b30Var.Z = true;
            if (b30Var.m0 == 1) {
                i9 = 1;
            } else {
                vk0 vk0Var = b30Var.f32372f;
                if (vk0Var != null) {
                    i9 = vk0Var.h() - 1;
                } else {
                    i9 = 0;
                }
            }
            b30Var.I(i9);
            if (arrayList2.isEmpty()) {
                b30Var.f27020d0 = true;
                b30Var.R();
            }
        }
        b30Var.T();
        vk0 vk0Var2 = b30Var.f32372f;
        if (vk0Var2 != null) {
            vk0Var2.l();
            if (gw0Var != null && b30Var.f32372f.h() == 0 && b30Var.Z) {
                gw0Var.e(false, true);
            }
        }
    }

    public static int Q(b30 b30Var) {
        return b30Var.currentAccount;
    }

    @Override
    public final void D(MotionEvent motionEvent, fg.g gVar) {
        org.telegram.ui.o50 o50Var = this.f27019c0.f40870a;
        if (!o50Var.f40956s0) {
            if (motionEvent.getX() > gVar.getLeft() && motionEvent.getX() < gVar.getRight() && motionEvent.getY() > gVar.getTop() && motionEvent.getY() < gVar.getBottom()) {
                o50Var.s1(o50Var.A1, null, gVar, true);
            } else {
                o50Var.s1(o50Var.A1, null, gVar, false);
            }
        }
    }

    @Override
    public final void F(String str) {
        a30 a30Var = this.P;
        of.v1 v1Var = a30Var.d;
        b30 b30Var = a30Var.f26656w;
        y20 y20Var = a30Var.f26651e;
        if (y20Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y20Var);
            a30Var.f26651e = null;
        }
        v1Var.f(null, null);
        TLRPC.Chat chat = b30Var.R;
        gh.f1 f1Var = b30Var.d;
        v1Var.g(null, true, false, true, false, chat.f22380id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            b30Var.f32375s.e(true, true);
            f1Var.U1 = false;
            f1Var.V1 = 0;
            a30Var.l();
            f1Var.U1 = true;
            f1Var.V1 = 0;
            a30Var.h = true;
            int i9 = a30Var.f26653n + 1;
            a30Var.f26653n = i9;
            y20 y20Var2 = new y20(a30Var, str, i9, 0);
            a30Var.f26651e = y20Var2;
            AndroidUtilities.runOnUIThread(y20Var2, 300L);
            f2.r0 adapter = f1Var.getAdapter();
            vk0 vk0Var = b30Var.f32371e;
            if (adapter != vk0Var) {
                f1Var.setAdapter(vk0Var);
                return;
            }
            return;
        }
        a30Var.f26653n = -1;
    }

    @Override
    public final void J() {
        this.E = org.telegram.ui.ActionBar.f6.Pg;
        this.F = org.telegram.ui.ActionBar.f6.f23028eg;
        int i9 = org.telegram.ui.ActionBar.f6.f22941a;
        this.G = org.telegram.ui.ActionBar.f6.f23046fg;
        this.H = org.telegram.ui.ActionBar.f6.f23295tg;
        this.I = org.telegram.ui.ActionBar.f6.f23188ng;
        this.J = org.telegram.ui.ActionBar.f6.f23203og;
        this.K = org.telegram.ui.ActionBar.f6.f23154lg;
        this.L = org.telegram.ui.ActionBar.f6.f23258rg;
        this.M = org.telegram.ui.ActionBar.f6.f23170mg;
    }

    public final void R() {
        if (!this.f27020d0) {
            return;
        }
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(this.currentAccount).contacts;
        ArrayList arrayList2 = this.U;
        arrayList2.addAll(arrayList);
        long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i9);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j11 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j11 == j10 || this.f27017a0.h(j11) >= 0 || this.f27018b0.contains(Long.valueOf(j11))) {
                    arrayList2.remove(i9);
                    i9--;
                    size--;
                }
            }
            i9++;
        }
        Collections.sort(arrayList2, new of.d(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 2));
    }

    public final void S() {
        a0.h hVar;
        TLRPC.Chat chat = this.R;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.S;
        if (!isChannel) {
            this.Y = false;
            ArrayList arrayList = this.T;
            arrayList.clear();
            this.U.clear();
            a0.h hVar2 = this.W;
            hVar2.b();
            this.X.b();
            if (chatFull != null) {
                long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size = chatFull.participants.participants.size();
                for (int i9 = 0; i9 < size; i9++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i9);
                    long j11 = chatParticipant.user_id;
                    if (j11 != j10 && ((hVar = this.f27017a0) == null || hVar.h(j11) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f27020d0 = true;
                    R();
                }
            }
            T();
            vk0 vk0Var = this.f32372f;
            if (vk0Var != null) {
                vk0Var.l();
                return;
            }
            return;
        }
        this.Y = true;
        gw0 gw0Var = this.f32375s;
        if (gw0Var != null) {
            gw0Var.e(true, false);
        }
        vk0 vk0Var2 = this.f32372f;
        if (vk0Var2 != null) {
            vk0Var2.l();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
        if (chatFull != null && chatFull.participants_count <= 200) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        } else if (!this.V) {
            this.Q = 2;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
            this.V = true;
            S();
        } else {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        }
        tL_channels_getParticipants.filter.f22379q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.rc(17, this, tL_channels_getParticipants));
    }

    public final void T() {
        this.f27021e0 = -1;
        this.f27023g0 = -1;
        this.f27024h0 = -1;
        this.f27025i0 = -1;
        this.f27026j0 = -1;
        this.f27027k0 = -1;
        this.f27028l0 = -1;
        this.f27022f0 = -1;
        boolean z10 = true;
        this.f27029n0 = 1;
        TLRPC.Chat chat = this.R;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i9 = this.f27029n0;
            this.f27029n0 = i9 + 1;
            this.f27021e0 = i9;
        }
        if (!this.Y || this.Z) {
            ArrayList arrayList = this.U;
            if (!arrayList.isEmpty()) {
                int i10 = this.f27029n0;
                int i11 = i10 + 1;
                this.f27029n0 = i11;
                this.f27025i0 = i10;
                this.f27026j0 = i11;
                int size = arrayList.size() + i11;
                this.f27029n0 = size;
                this.f27027k0 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.T;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i12 = this.f27029n0;
                    this.f27029n0 = i12 + 1;
                    this.f27028l0 = i12;
                }
                int i13 = this.f27029n0;
                this.f27023g0 = i13;
                int size2 = arrayList2.size() + i13;
                this.f27029n0 = size2;
                this.f27024h0 = size2;
            }
        }
        if (this.Y) {
            int i14 = this.f27029n0;
            this.f27029n0 = i14 + 1;
            this.m0 = i14;
        }
        int i15 = this.f27029n0;
        this.f27029n0 = i15 + 1;
        this.f27022f0 = i15;
    }
}
