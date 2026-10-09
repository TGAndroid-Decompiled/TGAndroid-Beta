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
public final class i40 extends t71 {
    public final h40 T;
    public int U;
    public final TLRPC.Chat V;
    public final TLRPC.ChatFull W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final a0.i f27221a0;
    public final a0.i f27222b0;
    public boolean f27223c0;
    public boolean f27224d0;
    public final a0.i f27225e0;
    public final HashSet f27226f0;
    public org.telegram.ui.h30 f27227g0;
    public boolean f27228h0;
    public int f27229i0;
    public int f27230j0;
    public int f27231k0;
    public int f27232l0;
    public int m0;
    public int f27233n0;
    public int f27234o0;
    public int f27235p0;
    public int f27236q0;
    public int f27237r0;

    public i40(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.i iVar, HashSet hashSet) {
        super(context, i10, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f27221a0 = new a0.i();
        this.f27222b0 = new a0.i();
        setDimBehindAlpha(75);
        this.V = chat;
        this.W = chatFull;
        this.f27225e0 = iVar;
        this.f27226f0 = hashSet;
        this.d.setOnItemClickListener(new j(this, 9));
        h40 h40Var = new h40(this, context);
        this.T = h40Var;
        this.f31077e = h40Var;
        ai.w0 w0Var = this.d;
        e40 e40Var = new e40(this, context);
        this.f31078f = e40Var;
        w0Var.setAdapter(e40Var);
        if (!this.f27223c0) {
            this.Z = false;
            U();
        }
        V();
        I(0.0f);
    }

    public static int N(i40 i40Var, int i10, TLObject tLObject, TLObject tLObject2) {
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(i40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(i40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static void O(i40 i40Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i10;
        a0.i iVar;
        ArrayList arrayList;
        a0.i iVar2;
        boolean z10;
        ay0 ay0Var = i40Var.f31081s;
        a0.i iVar3 = i40Var.f27221a0;
        a0.i iVar4 = i40Var.f27222b0;
        ArrayList arrayList2 = i40Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(i40Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(i40Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(i40Var.currentAccount).getClientUserId();
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
            i40Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = i40Var.Y;
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
                if (iVar4.f(peerId) != null || ((iVar2 = i40Var.f27225e0) != null && iVar2.h(peerId) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User user = MessagesController.getInstance(i40Var.currentAccount).getUser(Long.valueOf(peerId));
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
                if (i40Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.wq(i40Var, ConnectionsManager.getInstance(i40Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (i40Var.U <= 0) {
            i40Var.f27223c0 = false;
            i40Var.f27224d0 = true;
            if (i40Var.f27236q0 == 1) {
                i10 = 1;
            } else {
                pm0 pm0Var = i40Var.f31078f;
                if (pm0Var != null) {
                    i10 = pm0Var.h() - 1;
                } else {
                    i10 = 0;
                }
            }
            i40Var.K(i10);
            if (arrayList2.isEmpty()) {
                i40Var.f27228h0 = true;
                i40Var.T();
            }
        }
        i40Var.V();
        pm0 pm0Var2 = i40Var.f31078f;
        if (pm0Var2 != null) {
            pm0Var2.l();
            if (ay0Var != null && i40Var.f31078f.h() == 0 && i40Var.f27224d0) {
                ay0Var.e(false, true);
            }
        }
    }

    public static int S(i40 i40Var) {
        return i40Var.currentAccount;
    }

    @Override
    public final void F(MotionEvent motionEvent, ci.g2 g2Var) {
        org.telegram.ui.g60 g60Var = this.f27227g0.f38206a;
        if (!g60Var.f37878w0) {
            if (motionEvent.getX() > g2Var.getLeft() && motionEvent.getX() < g2Var.getRight() && motionEvent.getY() > g2Var.getTop() && motionEvent.getY() < g2Var.getBottom()) {
                g60Var.t1(g60Var.E1, null, g2Var, true);
            } else {
                g60Var.t1(g60Var.E1, null, g2Var, false);
            }
        }
    }

    @Override
    public final void H(String str) {
        h40 h40Var = this.T;
        gg.b2 b2Var = h40Var.d;
        i40 i40Var = h40Var.f26959w;
        f40 f40Var = h40Var.f26954e;
        if (f40Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f40Var);
            h40Var.f26954e = null;
        }
        b2Var.f(null, null);
        TLRPC.Chat chat = i40Var.V;
        ai.w0 w0Var = i40Var.d;
        b2Var.g(null, true, false, true, false, chat.f20038id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            i40Var.f31081s.e(true, true);
            w0Var.W1 = false;
            w0Var.X1 = 0;
            h40Var.l();
            w0Var.W1 = true;
            w0Var.X1 = 0;
            h40Var.h = true;
            int i10 = h40Var.f26956n + 1;
            h40Var.f26956n = i10;
            f40 f40Var2 = new f40(h40Var, str, i10, 0);
            h40Var.f26954e = f40Var2;
            AndroidUtilities.runOnUIThread(f40Var2, 300L);
            s4.i0 adapter = w0Var.getAdapter();
            pm0 pm0Var = i40Var.f31077e;
            if (adapter != pm0Var) {
                w0Var.setAdapter(pm0Var);
                return;
            }
            return;
        }
        h40Var.f26956n = -1;
    }

    @Override
    public final void L() {
        this.I = org.telegram.ui.ActionBar.i6.Pg;
        this.J = org.telegram.ui.ActionBar.i6.eg;
        int i10 = org.telegram.ui.ActionBar.i6.f20734a;
        this.K = org.telegram.ui.ActionBar.i6.f20843fg;
        this.L = org.telegram.ui.ActionBar.i6.f21101tg;
        this.M = org.telegram.ui.ActionBar.i6.f20990ng;
        this.N = org.telegram.ui.ActionBar.i6.f21008og;
        this.O = org.telegram.ui.ActionBar.i6.f20953lg;
        this.P = org.telegram.ui.ActionBar.i6.f21064rg;
        this.Q = org.telegram.ui.ActionBar.i6.f20972mg;
    }

    public final void T() {
        if (!this.f27228h0) {
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
                if (j10 == j3 || this.f27225e0.h(j10) >= 0 || this.f27226f0.contains(Long.valueOf(j10))) {
                    arrayList2.remove(i10);
                    i10--;
                    size--;
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new gg.d(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 2));
    }

    public final void U() {
        a0.i iVar;
        TLRPC.Chat chat = this.V;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.W;
        if (!isChannel) {
            this.f27223c0 = false;
            ArrayList arrayList = this.X;
            arrayList.clear();
            this.Y.clear();
            a0.i iVar2 = this.f27221a0;
            iVar2.b();
            this.f27222b0.b();
            if (chatFull != null) {
                long j3 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size = chatFull.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                    long j10 = chatParticipant.user_id;
                    if (j10 != j3 && ((iVar = this.f27225e0) == null || iVar.h(j10) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            iVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f27228h0 = true;
                    T();
                }
            }
            V();
            pm0 pm0Var = this.f31078f;
            if (pm0Var != null) {
                pm0Var.l();
                return;
            }
            return;
        }
        this.f27223c0 = true;
        ay0 ay0Var = this.f31081s;
        if (ay0Var != null) {
            ay0Var.e(true, false);
        }
        pm0 pm0Var2 = this.f31078f;
        if (pm0Var2 != null) {
            pm0Var2.l();
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
        tL_channels_getParticipants.filter.f20037q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.oo(10, this, tL_channels_getParticipants));
    }

    public final void V() {
        this.f27229i0 = -1;
        this.f27231k0 = -1;
        this.f27232l0 = -1;
        this.m0 = -1;
        this.f27233n0 = -1;
        this.f27234o0 = -1;
        this.f27235p0 = -1;
        this.f27230j0 = -1;
        boolean z10 = true;
        this.f27237r0 = 1;
        TLRPC.Chat chat = this.V;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.f27237r0;
            this.f27237r0 = i10 + 1;
            this.f27229i0 = i10;
        }
        if (!this.f27223c0 || this.f27224d0) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i11 = this.f27237r0;
                int i12 = i11 + 1;
                this.f27237r0 = i12;
                this.m0 = i11;
                this.f27233n0 = i12;
                int size = arrayList.size() + i12;
                this.f27237r0 = size;
                this.f27234o0 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.X;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.f27237r0;
                    this.f27237r0 = i13 + 1;
                    this.f27235p0 = i13;
                }
                int i14 = this.f27237r0;
                this.f27231k0 = i14;
                int size2 = arrayList2.size() + i14;
                this.f27237r0 = size2;
                this.f27232l0 = size2;
            }
        }
        if (this.f27223c0) {
            int i15 = this.f27237r0;
            this.f27237r0 = i15 + 1;
            this.f27236q0 = i15;
        }
        int i16 = this.f27237r0;
        this.f27237r0 = i16 + 1;
        this.f27230j0 = i16;
    }
}
