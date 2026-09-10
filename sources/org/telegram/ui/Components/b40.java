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
public final class b40 extends b71 {
    public final a40 T;
    public int U;
    public final TLRPC.Chat V;
    public final TLRPC.ChatFull W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final a0.i f21704a0;
    public final a0.i f21705b0;
    public boolean f21706c0;
    public boolean f21707d0;
    public final a0.i f21708e0;
    public final HashSet f21709f0;
    public org.telegram.ui.k30 f21710g0;
    public boolean f21711h0;
    public int f21712i0;
    public int f21713j0;
    public int f21714k0;
    public int f21715l0;
    public int m0;
    public int f21716n0;
    public int f21717o0;
    public int f21718p0;
    public int f21719q0;
    public int f21720r0;

    public b40(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.i iVar, HashSet hashSet) {
        super(context, i10, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f21704a0 = new a0.i();
        this.f21705b0 = new a0.i();
        setDimBehindAlpha(75);
        this.V = chat;
        this.W = chatFull;
        this.f21708e0 = iVar;
        this.f21709f0 = hashSet;
        this.d.setOnItemClickListener(new k(this, 9));
        a40 a40Var = new a40(this, context);
        this.T = a40Var;
        this.e = a40Var;
        bi.y1 y1Var = this.d;
        x30 x30Var = new x30(this, context);
        this.f21746f = x30Var;
        y1Var.setAdapter(x30Var);
        if (!this.f21706c0) {
            this.Z = false;
            T();
        }
        U();
        H(0.0f);
    }

    public static int M(b40 b40Var, int i10, TLObject tLObject, TLObject tLObject2) {
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(b40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(b40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static void N(b40 b40Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i10;
        a0.i iVar;
        ArrayList arrayList;
        a0.i iVar2;
        boolean z10;
        jx0 jx0Var = b40Var.f21749s;
        a0.i iVar3 = b40Var.f21704a0;
        a0.i iVar4 = b40Var.f21705b0;
        ArrayList arrayList2 = b40Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(b40Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(b40Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(b40Var.currentAccount).getClientUserId();
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
            b40Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = b40Var.Y;
                iVar = iVar4;
            } else {
                iVar = iVar3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i12);
                iVar.k(channelParticipant, MessageObject.getPeerId(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) arrayList2.get(i13)).peer);
                if (iVar4.f(peerId) != null || ((iVar2 = b40Var.f21708e0) != null && iVar2.h(peerId) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User user = MessagesController.getInstance(b40Var.currentAccount).getUser(Long.valueOf(peerId));
                if ((user != null && user.bot) || UserObject.isDeleted(user)) {
                    z10 = true;
                }
                if (z10) {
                    arrayList2.remove(i13);
                    iVar3.l(peerId);
                    i13--;
                    size2--;
                }
                i13++;
            }
            try {
                if (b40Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.ar(b40Var, ConnectionsManager.getInstance(b40Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (b40Var.U <= 0) {
            b40Var.f21706c0 = false;
            b40Var.f21707d0 = true;
            if (b40Var.f21719q0 == 1) {
                i10 = 1;
            } else {
                ul0 ul0Var = b40Var.f21746f;
                if (ul0Var != null) {
                    i10 = ul0Var.h() - 1;
                } else {
                    i10 = 0;
                }
            }
            b40Var.J(i10);
            if (arrayList2.isEmpty()) {
                b40Var.f21711h0 = true;
                b40Var.S();
            }
        }
        b40Var.U();
        ul0 ul0Var2 = b40Var.f21746f;
        if (ul0Var2 != null) {
            ul0Var2.l();
            if (jx0Var != null && b40Var.f21746f.h() == 0 && b40Var.f21707d0) {
                jx0Var.e(false, true);
            }
        }
    }

    public static int R(b40 b40Var) {
        return b40Var.currentAccount;
    }

    @Override
    public final void D(MotionEvent motionEvent, bi.t2 t2Var) {
        org.telegram.ui.j60 j60Var = this.f21710g0.f34208a;
        if (!j60Var.f34026w0) {
            if (motionEvent.getX() > t2Var.getLeft() && motionEvent.getX() < t2Var.getRight() && motionEvent.getY() > t2Var.getTop() && motionEvent.getY() < t2Var.getBottom()) {
                j60Var.s1(j60Var.E1, null, t2Var, true);
            } else {
                j60Var.s1(j60Var.E1, null, t2Var, false);
            }
        }
    }

    @Override
    public final void F(String str) {
        a40 a40Var = this.T;
        fg.d2 d2Var = a40Var.d;
        b40 b40Var = a40Var.f21385w;
        y30 y30Var = a40Var.e;
        if (y30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y30Var);
            a40Var.e = null;
        }
        d2Var.f(null, null);
        TLRPC.Chat chat = b40Var.V;
        bi.y1 y1Var = b40Var.d;
        d2Var.g(null, true, false, true, false, chat.f17195id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            b40Var.f21749s.e(true, true);
            y1Var.Y1 = false;
            y1Var.Z1 = 0;
            a40Var.l();
            y1Var.Y1 = true;
            y1Var.Z1 = 0;
            a40Var.h = true;
            int i10 = a40Var.f21382n + 1;
            a40Var.f21382n = i10;
            y30 y30Var2 = new y30(a40Var, str, i10, 0);
            a40Var.e = y30Var2;
            AndroidUtilities.runOnUIThread(y30Var2, 300L);
            s4.h0 adapter = y1Var.getAdapter();
            ul0 ul0Var = b40Var.e;
            if (adapter != ul0Var) {
                y1Var.setAdapter(ul0Var);
                return;
            }
            return;
        }
        a40Var.f21382n = -1;
    }

    @Override
    public final void K() {
        this.I = org.telegram.ui.ActionBar.j6.Pg;
        this.J = org.telegram.ui.ActionBar.j6.f17954eg;
        int i10 = org.telegram.ui.ActionBar.j6.f17865a;
        this.K = org.telegram.ui.ActionBar.j6.f17972fg;
        this.L = org.telegram.ui.ActionBar.j6.f18227tg;
        this.M = org.telegram.ui.ActionBar.j6.f18117ng;
        this.N = org.telegram.ui.ActionBar.j6.f18135og;
        this.O = org.telegram.ui.ActionBar.j6.f18083lg;
        this.P = org.telegram.ui.ActionBar.j6.f18190rg;
        this.Q = org.telegram.ui.ActionBar.j6.f18101mg;
    }

    public final void S() {
        if (!this.f21711h0) {
            return;
        }
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(this.currentAccount).contacts;
        ArrayList arrayList2 = this.Y;
        arrayList2.addAll(arrayList);
        long j3 = UserConfig.getInstance(this.currentAccount).clientUserId;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i10);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j10 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j10 == j3 || this.f21708e0.h(j10) >= 0 || this.f21709f0.contains(Long.valueOf(j10))) {
                    arrayList2.remove(i10);
                    i10--;
                    size--;
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new fg.d(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 2));
    }

    public final void T() {
        a0.i iVar;
        TLRPC.Chat chat = this.V;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.W;
        if (!isChannel) {
            this.f21706c0 = false;
            ArrayList arrayList = this.X;
            arrayList.clear();
            this.Y.clear();
            a0.i iVar2 = this.f21704a0;
            iVar2.b();
            this.f21705b0.b();
            if (chatFull != null) {
                long j3 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size = chatFull.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                    long j10 = chatParticipant.user_id;
                    if (j10 != j3 && ((iVar = this.f21708e0) == null || iVar.h(j10) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            iVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f21711h0 = true;
                    S();
                }
            }
            U();
            ul0 ul0Var = this.f21746f;
            if (ul0Var != null) {
                ul0Var.l();
                return;
            }
            return;
        }
        this.f21706c0 = true;
        jx0 jx0Var = this.f21749s;
        if (jx0Var != null) {
            jx0Var.e(true, false);
        }
        ul0 ul0Var2 = this.f21746f;
        if (ul0Var2 != null) {
            ul0Var2.l();
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
        tL_channels_getParticipants.filter.f17194q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new th(5, this, tL_channels_getParticipants));
    }

    public final void U() {
        this.f21712i0 = -1;
        this.f21714k0 = -1;
        this.f21715l0 = -1;
        this.m0 = -1;
        this.f21716n0 = -1;
        this.f21717o0 = -1;
        this.f21718p0 = -1;
        this.f21713j0 = -1;
        boolean z10 = true;
        this.f21720r0 = 1;
        TLRPC.Chat chat = this.V;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.f21720r0;
            this.f21720r0 = i10 + 1;
            this.f21712i0 = i10;
        }
        if (!this.f21706c0 || this.f21707d0) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i11 = this.f21720r0;
                int i12 = i11 + 1;
                this.f21720r0 = i12;
                this.m0 = i11;
                this.f21716n0 = i12;
                int size = arrayList.size() + i12;
                this.f21720r0 = size;
                this.f21717o0 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.X;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.f21720r0;
                    this.f21720r0 = i13 + 1;
                    this.f21718p0 = i13;
                }
                int i14 = this.f21720r0;
                this.f21714k0 = i14;
                int size2 = arrayList2.size() + i14;
                this.f21720r0 = size2;
                this.f21715l0 = size2;
            }
        }
        if (this.f21706c0) {
            int i15 = this.f21720r0;
            this.f21720r0 = i15 + 1;
            this.f21719q0 = i15;
        }
        int i16 = this.f21720r0;
        this.f21720r0 = i16 + 1;
        this.f21713j0 = i16;
    }
}
