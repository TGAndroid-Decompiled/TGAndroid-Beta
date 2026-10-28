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
public final class c40 extends c81 {
    public final b40 T;
    public int U;
    public final TLRPC.Chat V;
    public final TLRPC.ChatFull W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final a0.h f27056a0;
    public final a0.h f27057b0;
    public boolean f27058c0;
    public boolean f27059d0;
    public final a0.h f27060e0;
    public final HashSet f27061f0;
    public org.telegram.ui.x20 f27062g0;
    public boolean f27063h0;
    public int f27064i0;
    public int f27065j0;
    public int f27066k0;
    public int f27067l0;
    public int m0;
    public int f27068n0;
    public int f27069o0;
    public int f27070p0;
    public int f27071q0;
    public int f27072r0;

    public c40(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(context, i10, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f27056a0 = new a0.h();
        this.f27057b0 = new a0.h();
        setDimBehindAlpha(75);
        this.V = chat;
        this.W = chatFull;
        this.f27060e0 = hVar;
        this.f27061f0 = hashSet;
        this.d.setOnItemClickListener(new j(this, 9));
        b40 b40Var = new b40(this, context);
        this.T = b40Var;
        this.e = b40Var;
        bi.r1 r1Var = this.d;
        y30 y30Var = new y30(this, context);
        this.f27093f = y30Var;
        r1Var.setAdapter(y30Var);
        if (!this.f27058c0) {
            this.Z = false;
            T();
        }
        U();
        H(0.0f);
    }

    public static int M(c40 c40Var, int i10, TLObject tLObject, TLObject tLObject2) {
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(c40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(c40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static void N(c40 c40Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        boolean z10;
        fy0 fy0Var = c40Var.f27096s;
        a0.h hVar3 = c40Var.f27056a0;
        a0.h hVar4 = c40Var.f27057b0;
        ArrayList arrayList2 = c40Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(c40Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(c40Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(c40Var.currentAccount).getClientUserId();
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
            c40Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = c40Var.Y;
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
                if (hVar4.f(peerId) != null || ((hVar2 = c40Var.f27060e0) != null && hVar2.h(peerId) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User user = MessagesController.getInstance(c40Var.currentAccount).getUser(Long.valueOf(peerId));
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
                if (c40Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.qq(c40Var, ConnectionsManager.getInstance(c40Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (c40Var.U <= 0) {
            c40Var.f27058c0 = false;
            c40Var.f27059d0 = true;
            if (c40Var.f27071q0 == 1) {
                i10 = 1;
            } else {
                mm0 mm0Var = c40Var.f27093f;
                if (mm0Var != null) {
                    i10 = mm0Var.h() - 1;
                } else {
                    i10 = 0;
                }
            }
            c40Var.J(i10);
            if (arrayList2.isEmpty()) {
                c40Var.f27063h0 = true;
                c40Var.S();
            }
        }
        c40Var.U();
        mm0 mm0Var2 = c40Var.f27093f;
        if (mm0Var2 != null) {
            mm0Var2.l();
            if (fy0Var != null && c40Var.f27093f.h() == 0 && c40Var.f27059d0) {
                fy0Var.e(false, true);
            }
        }
    }

    public static int R(c40 c40Var) {
        return c40Var.currentAccount;
    }

    @Override
    public final void D(MotionEvent motionEvent, fi.c2 c2Var) {
        org.telegram.ui.x50 x50Var = this.f27062g0.f45460a;
        if (!x50Var.f45582w0) {
            if (motionEvent.getX() > c2Var.getLeft() && motionEvent.getX() < c2Var.getRight() && motionEvent.getY() > c2Var.getTop() && motionEvent.getY() < c2Var.getBottom()) {
                x50Var.s1(x50Var.E1, null, c2Var, true);
            } else {
                x50Var.s1(x50Var.E1, null, c2Var, false);
            }
        }
    }

    @Override
    public final void G(String str) {
        b40 b40Var = this.T;
        ig.a2 a2Var = b40Var.d;
        c40 c40Var = b40Var.f26729w;
        z30 z30Var = b40Var.e;
        if (z30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z30Var);
            b40Var.e = null;
        }
        a2Var.f(null, null);
        TLRPC.Chat chat = c40Var.V;
        bi.r1 r1Var = c40Var.d;
        a2Var.g(null, true, false, true, false, chat.f22028id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            c40Var.f27096s.e(true, true);
            r1Var.W1 = false;
            r1Var.X1 = 0;
            b40Var.l();
            r1Var.W1 = true;
            r1Var.X1 = 0;
            b40Var.h = true;
            int i10 = b40Var.f26726n + 1;
            b40Var.f26726n = i10;
            z30 z30Var2 = new z30(b40Var, str, i10, 0);
            b40Var.e = z30Var2;
            AndroidUtilities.runOnUIThread(z30Var2, 300L);
            s4.h0 adapter = r1Var.getAdapter();
            mm0 mm0Var = c40Var.e;
            if (adapter != mm0Var) {
                r1Var.setAdapter(mm0Var);
                return;
            }
            return;
        }
        b40Var.f26726n = -1;
    }

    @Override
    public final void K() {
        this.I = org.telegram.ui.ActionBar.y6.Pg;
        this.J = org.telegram.ui.ActionBar.y6.f23384eg;
        int i10 = org.telegram.ui.ActionBar.y6.f23293a;
        this.K = org.telegram.ui.ActionBar.y6.f23403fg;
        this.L = org.telegram.ui.ActionBar.y6.f23664tg;
        this.M = org.telegram.ui.ActionBar.y6.f23551ng;
        this.N = org.telegram.ui.ActionBar.y6.f23571og;
        this.O = org.telegram.ui.ActionBar.y6.f23512lg;
        this.P = org.telegram.ui.ActionBar.y6.f23625rg;
        this.Q = org.telegram.ui.ActionBar.y6.f23531mg;
    }

    public final void S() {
        if (!this.f27063h0) {
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
                if (j11 == j10 || this.f27060e0.h(j11) >= 0 || this.f27061f0.contains(Long.valueOf(j11))) {
                    arrayList2.remove(i10);
                    i10--;
                    size--;
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new ig.d(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 2));
    }

    public final void T() {
        a0.h hVar;
        TLRPC.Chat chat = this.V;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.W;
        if (!isChannel) {
            this.f27058c0 = false;
            ArrayList arrayList = this.X;
            arrayList.clear();
            this.Y.clear();
            a0.h hVar2 = this.f27056a0;
            hVar2.b();
            this.f27057b0.b();
            if (chatFull != null) {
                long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size = chatFull.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                    long j11 = chatParticipant.user_id;
                    if (j11 != j10 && ((hVar = this.f27060e0) == null || hVar.h(j11) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f27063h0 = true;
                    S();
                }
            }
            U();
            mm0 mm0Var = this.f27093f;
            if (mm0Var != null) {
                mm0Var.l();
                return;
            }
            return;
        }
        this.f27058c0 = true;
        fy0 fy0Var = this.f27096s;
        if (fy0Var != null) {
            fy0Var.e(true, false);
        }
        mm0 mm0Var2 = this.f27093f;
        if (mm0Var2 != null) {
            mm0Var2.l();
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
        tL_channels_getParticipants.filter.f22027q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.z7(18, this, tL_channels_getParticipants));
    }

    public final void U() {
        this.f27064i0 = -1;
        this.f27066k0 = -1;
        this.f27067l0 = -1;
        this.m0 = -1;
        this.f27068n0 = -1;
        this.f27069o0 = -1;
        this.f27070p0 = -1;
        this.f27065j0 = -1;
        boolean z10 = true;
        this.f27072r0 = 1;
        TLRPC.Chat chat = this.V;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.f27072r0;
            this.f27072r0 = i10 + 1;
            this.f27064i0 = i10;
        }
        if (!this.f27058c0 || this.f27059d0) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i11 = this.f27072r0;
                int i12 = i11 + 1;
                this.f27072r0 = i12;
                this.m0 = i11;
                this.f27068n0 = i12;
                int size = arrayList.size() + i12;
                this.f27072r0 = size;
                this.f27069o0 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.X;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.f27072r0;
                    this.f27072r0 = i13 + 1;
                    this.f27070p0 = i13;
                }
                int i14 = this.f27072r0;
                this.f27066k0 = i14;
                int size2 = arrayList2.size() + i14;
                this.f27072r0 = size2;
                this.f27067l0 = size2;
            }
        }
        if (this.f27058c0) {
            int i15 = this.f27072r0;
            this.f27072r0 = i15 + 1;
            this.f27071q0 = i15;
        }
        int i16 = this.f27072r0;
        this.f27072r0 = i16 + 1;
        this.f27065j0 = i16;
    }
}
