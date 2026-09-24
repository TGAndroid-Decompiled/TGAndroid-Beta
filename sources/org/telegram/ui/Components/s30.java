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
public final class s30 extends b71 {
    public final r30 T;
    public int U;
    public final TLRPC.Chat V;
    public final TLRPC.ChatFull W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final a0.i f28113a0;
    public final a0.i f28114b0;
    public boolean f28115c0;
    public boolean f28116d0;
    public final a0.i f28117e0;
    public final HashSet f28118f0;
    public org.telegram.ui.e30 f28119g0;
    public boolean f28120h0;
    public int f28121i0;
    public int f28122j0;
    public int f28123k0;
    public int f28124l0;
    public int m0;
    public int f28125n0;
    public int f28126o0;
    public int f28127p0;
    public int f28128q0;
    public int f28129r0;

    public s30(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.i iVar, HashSet hashSet) {
        super(context, i10, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f28113a0 = new a0.i();
        this.f28114b0 = new a0.i();
        setDimBehindAlpha(75);
        this.V = chat;
        this.W = chatFull;
        this.f28117e0 = iVar;
        this.f28118f0 = hashSet;
        this.d.setOnItemClickListener(new j(this, 9));
        r30 r30Var = new r30(this, context);
        this.T = r30Var;
        this.e = r30Var;
        ai.w0 w0Var = this.d;
        o30 o30Var = new o30(this, context);
        this.f22907f = o30Var;
        w0Var.setAdapter(o30Var);
        if (!this.f28115c0) {
            this.Z = false;
            T();
        }
        U();
        H(0.0f);
    }

    public static int M(s30 s30Var, int i10, TLObject tLObject, TLObject tLObject2) {
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(s30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(s30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static void N(s30 s30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i10;
        a0.i iVar;
        ArrayList arrayList;
        a0.i iVar2;
        boolean z10;
        ix0 ix0Var = s30Var.f22910s;
        a0.i iVar3 = s30Var.f28113a0;
        a0.i iVar4 = s30Var.f28114b0;
        ArrayList arrayList2 = s30Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(s30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(s30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(s30Var.currentAccount).getClientUserId();
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
            s30Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = s30Var.Y;
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
                if (iVar4.f(peerId) != null || ((iVar2 = s30Var.f28117e0) != null && iVar2.h(peerId) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User user = MessagesController.getInstance(s30Var.currentAccount).getUser(Long.valueOf(peerId));
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
                if (s30Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.tq(s30Var, ConnectionsManager.getInstance(s30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (s30Var.U <= 0) {
            s30Var.f28115c0 = false;
            s30Var.f28116d0 = true;
            if (s30Var.f28128q0 == 1) {
                i10 = 1;
            } else {
                vl0 vl0Var = s30Var.f22907f;
                if (vl0Var != null) {
                    i10 = vl0Var.h() - 1;
                } else {
                    i10 = 0;
                }
            }
            s30Var.J(i10);
            if (arrayList2.isEmpty()) {
                s30Var.f28120h0 = true;
                s30Var.S();
            }
        }
        s30Var.U();
        vl0 vl0Var2 = s30Var.f22907f;
        if (vl0Var2 != null) {
            vl0Var2.l();
            if (ix0Var != null && s30Var.f22907f.h() == 0 && s30Var.f28116d0) {
                ix0Var.e(false, true);
            }
        }
    }

    public static int R(s30 s30Var) {
        return s30Var.currentAccount;
    }

    @Override
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.d60 d60Var = this.f28119g0.f33238a;
        if (!d60Var.f33009w0) {
            if (motionEvent.getX() > h2Var.getLeft() && motionEvent.getX() < h2Var.getRight() && motionEvent.getY() > h2Var.getTop() && motionEvent.getY() < h2Var.getBottom()) {
                d60Var.s1(d60Var.E1, null, h2Var, true);
            } else {
                d60Var.s1(d60Var.E1, null, h2Var, false);
            }
        }
    }

    @Override
    public final void G(String str) {
        r30 r30Var = this.T;
        gg.c2 c2Var = r30Var.d;
        s30 s30Var = r30Var.f27835w;
        p30 p30Var = r30Var.e;
        if (p30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p30Var);
            r30Var.e = null;
        }
        c2Var.f(null, null);
        TLRPC.Chat chat = s30Var.V;
        ai.w0 w0Var = s30Var.d;
        c2Var.g(null, true, false, true, false, chat.f18321id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            s30Var.f22910s.e(true, true);
            w0Var.Y1 = false;
            w0Var.Z1 = 0;
            r30Var.l();
            w0Var.Y1 = true;
            w0Var.Z1 = 0;
            r30Var.h = true;
            int i10 = r30Var.f27832n + 1;
            r30Var.f27832n = i10;
            p30 p30Var2 = new p30(r30Var, str, i10, 0);
            r30Var.e = p30Var2;
            AndroidUtilities.runOnUIThread(p30Var2, 300L);
            s4.h0 adapter = w0Var.getAdapter();
            vl0 vl0Var = s30Var.e;
            if (adapter != vl0Var) {
                w0Var.setAdapter(vl0Var);
                return;
            }
            return;
        }
        r30Var.f27832n = -1;
    }

    @Override
    public final void K() {
        this.I = org.telegram.ui.ActionBar.h6.Pg;
        this.J = org.telegram.ui.ActionBar.h6.eg;
        int i10 = org.telegram.ui.ActionBar.h6.f18982a;
        this.K = org.telegram.ui.ActionBar.h6.f19089fg;
        this.L = org.telegram.ui.ActionBar.h6.f19349tg;
        this.M = org.telegram.ui.ActionBar.h6.f19236ng;
        this.N = org.telegram.ui.ActionBar.h6.f19255og;
        this.O = org.telegram.ui.ActionBar.h6.f19200lg;
        this.P = org.telegram.ui.ActionBar.h6.f19312rg;
        this.Q = org.telegram.ui.ActionBar.h6.f19219mg;
    }

    public final void S() {
        if (!this.f28120h0) {
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
                if (j10 == j3 || this.f28117e0.h(j10) >= 0 || this.f28118f0.contains(Long.valueOf(j10))) {
                    arrayList2.remove(i10);
                    i10--;
                    size--;
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new gg.d(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 2));
    }

    public final void T() {
        a0.i iVar;
        TLRPC.Chat chat = this.V;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.W;
        if (!isChannel) {
            this.f28115c0 = false;
            ArrayList arrayList = this.X;
            arrayList.clear();
            this.Y.clear();
            a0.i iVar2 = this.f28113a0;
            iVar2.b();
            this.f28114b0.b();
            if (chatFull != null) {
                long j3 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size = chatFull.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                    long j10 = chatParticipant.user_id;
                    if (j10 != j3 && ((iVar = this.f28117e0) == null || iVar.h(j10) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            iVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f28120h0 = true;
                    S();
                }
            }
            U();
            vl0 vl0Var = this.f22907f;
            if (vl0Var != null) {
                vl0Var.l();
                return;
            }
            return;
        }
        this.f28115c0 = true;
        ix0 ix0Var = this.f22910s;
        if (ix0Var != null) {
            ix0Var.e(true, false);
        }
        vl0 vl0Var2 = this.f22907f;
        if (vl0Var2 != null) {
            vl0Var2.l();
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
        tL_channels_getParticipants.filter.f18320q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.lo(10, this, tL_channels_getParticipants));
    }

    public final void U() {
        this.f28121i0 = -1;
        this.f28123k0 = -1;
        this.f28124l0 = -1;
        this.m0 = -1;
        this.f28125n0 = -1;
        this.f28126o0 = -1;
        this.f28127p0 = -1;
        this.f28122j0 = -1;
        boolean z10 = true;
        this.f28129r0 = 1;
        TLRPC.Chat chat = this.V;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.f28129r0;
            this.f28129r0 = i10 + 1;
            this.f28121i0 = i10;
        }
        if (!this.f28115c0 || this.f28116d0) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i11 = this.f28129r0;
                int i12 = i11 + 1;
                this.f28129r0 = i12;
                this.m0 = i11;
                this.f28125n0 = i12;
                int size = arrayList.size() + i12;
                this.f28129r0 = size;
                this.f28126o0 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.X;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.f28129r0;
                    this.f28129r0 = i13 + 1;
                    this.f28127p0 = i13;
                }
                int i14 = this.f28129r0;
                this.f28123k0 = i14;
                int size2 = arrayList2.size() + i14;
                this.f28129r0 = size2;
                this.f28124l0 = size2;
            }
        }
        if (this.f28115c0) {
            int i15 = this.f28129r0;
            this.f28129r0 = i15 + 1;
            this.f28128q0 = i15;
        }
        int i16 = this.f28129r0;
        this.f28129r0 = i16 + 1;
        this.f28122j0 = i16;
    }
}
