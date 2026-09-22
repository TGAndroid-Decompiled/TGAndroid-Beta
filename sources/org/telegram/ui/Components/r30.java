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
public final class r30 extends o61 {
    public final q30 T;
    public int U;
    public final TLRPC.Chat V;
    public final TLRPC.ChatFull W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final a0.i f27526a0;
    public final a0.i f27527b0;
    public boolean f27528c0;
    public boolean f27529d0;
    public final a0.i f27530e0;
    public final HashSet f27531f0;
    public org.telegram.ui.j30 f27532g0;
    public boolean f27533h0;
    public int f27534i0;
    public int f27535j0;
    public int f27536k0;
    public int f27537l0;
    public int m0;
    public int f27538n0;
    public int f27539o0;
    public int f27540p0;
    public int f27541q0;
    public int f27542r0;

    public r30(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.i iVar, HashSet hashSet) {
        super(context, i10, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f27526a0 = new a0.i();
        this.f27527b0 = new a0.i();
        setDimBehindAlpha(75);
        this.V = chat;
        this.W = chatFull;
        this.f27530e0 = iVar;
        this.f27531f0 = hashSet;
        this.d.setOnItemClickListener(new j(this, 9));
        q30 q30Var = new q30(this, context);
        this.T = q30Var;
        this.e = q30Var;
        ai.w0 w0Var = this.d;
        n30 n30Var = new n30(this, context);
        this.f26703f = n30Var;
        w0Var.setAdapter(n30Var);
        if (!this.f27528c0) {
            this.Z = false;
            T();
        }
        U();
        H(0.0f);
    }

    public static int M(r30 r30Var, int i10, TLObject tLObject, TLObject tLObject2) {
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(r30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(r30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static void N(r30 r30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i10;
        a0.i iVar;
        ArrayList arrayList;
        a0.i iVar2;
        boolean z10;
        yw0 yw0Var = r30Var.f26706s;
        a0.i iVar3 = r30Var.f27526a0;
        a0.i iVar4 = r30Var.f27527b0;
        ArrayList arrayList2 = r30Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(r30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(r30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(r30Var.currentAccount).getClientUserId();
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
            r30Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = r30Var.Y;
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
                if (iVar4.f(peerId) != null || ((iVar2 = r30Var.f27530e0) != null && iVar2.h(peerId) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User user = MessagesController.getInstance(r30Var.currentAccount).getUser(Long.valueOf(peerId));
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
                if (r30Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.yq(r30Var, ConnectionsManager.getInstance(r30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (r30Var.U <= 0) {
            r30Var.f27528c0 = false;
            r30Var.f27529d0 = true;
            if (r30Var.f27541q0 == 1) {
                i10 = 1;
            } else {
                kl0 kl0Var = r30Var.f26703f;
                if (kl0Var != null) {
                    i10 = kl0Var.h() - 1;
                } else {
                    i10 = 0;
                }
            }
            r30Var.J(i10);
            if (arrayList2.isEmpty()) {
                r30Var.f27533h0 = true;
                r30Var.S();
            }
        }
        r30Var.U();
        kl0 kl0Var2 = r30Var.f26703f;
        if (kl0Var2 != null) {
            kl0Var2.l();
            if (yw0Var != null && r30Var.f26703f.h() == 0 && r30Var.f27529d0) {
                yw0Var.e(false, true);
            }
        }
    }

    public static int R(r30 r30Var) {
        return r30Var.currentAccount;
    }

    @Override
    public final void E(MotionEvent motionEvent, ci.h2 h2Var) {
        org.telegram.ui.i60 i60Var = this.f27532g0.f34782a;
        if (!i60Var.f34518w0) {
            if (motionEvent.getX() > h2Var.getLeft() && motionEvent.getX() < h2Var.getRight() && motionEvent.getY() > h2Var.getTop() && motionEvent.getY() < h2Var.getBottom()) {
                i60Var.s1(i60Var.E1, null, h2Var, true);
            } else {
                i60Var.s1(i60Var.E1, null, h2Var, false);
            }
        }
    }

    @Override
    public final void G(String str) {
        q30 q30Var = this.T;
        gg.c2 c2Var = q30Var.d;
        r30 r30Var = q30Var.f27240w;
        o30 o30Var = q30Var.e;
        if (o30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(o30Var);
            q30Var.e = null;
        }
        c2Var.f(null, null);
        TLRPC.Chat chat = r30Var.V;
        ai.w0 w0Var = r30Var.d;
        c2Var.g(null, true, false, true, false, chat.f18109id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            r30Var.f26706s.e(true, true);
            w0Var.Y1 = false;
            w0Var.Z1 = 0;
            q30Var.l();
            w0Var.Y1 = true;
            w0Var.Z1 = 0;
            q30Var.h = true;
            int i10 = q30Var.f27237n + 1;
            q30Var.f27237n = i10;
            o30 o30Var2 = new o30(q30Var, str, i10, 0);
            q30Var.e = o30Var2;
            AndroidUtilities.runOnUIThread(o30Var2, 300L);
            s4.h0 adapter = w0Var.getAdapter();
            kl0 kl0Var = r30Var.e;
            if (adapter != kl0Var) {
                w0Var.setAdapter(kl0Var);
                return;
            }
            return;
        }
        q30Var.f27237n = -1;
    }

    @Override
    public final void K() {
        this.I = org.telegram.ui.ActionBar.i6.Pg;
        this.J = org.telegram.ui.ActionBar.i6.eg;
        int i10 = org.telegram.ui.ActionBar.i6.f18771a;
        this.K = org.telegram.ui.ActionBar.i6.f18878fg;
        this.L = org.telegram.ui.ActionBar.i6.f19136tg;
        this.M = org.telegram.ui.ActionBar.i6.f19025ng;
        this.N = org.telegram.ui.ActionBar.i6.f19044og;
        this.O = org.telegram.ui.ActionBar.i6.f18989lg;
        this.P = org.telegram.ui.ActionBar.i6.f19099rg;
        this.Q = org.telegram.ui.ActionBar.i6.f19008mg;
    }

    public final void S() {
        if (!this.f27533h0) {
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
                if (j10 == j3 || this.f27530e0.h(j10) >= 0 || this.f27531f0.contains(Long.valueOf(j10))) {
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
            this.f27528c0 = false;
            ArrayList arrayList = this.X;
            arrayList.clear();
            this.Y.clear();
            a0.i iVar2 = this.f27526a0;
            iVar2.b();
            this.f27527b0.b();
            if (chatFull != null) {
                long j3 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size = chatFull.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                    long j10 = chatParticipant.user_id;
                    if (j10 != j3 && ((iVar = this.f27530e0) == null || iVar.h(j10) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            iVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f27533h0 = true;
                    S();
                }
            }
            U();
            kl0 kl0Var = this.f26703f;
            if (kl0Var != null) {
                kl0Var.l();
                return;
            }
            return;
        }
        this.f27528c0 = true;
        yw0 yw0Var = this.f26706s;
        if (yw0Var != null) {
            yw0Var.e(true, false);
        }
        kl0 kl0Var2 = this.f26703f;
        if (kl0Var2 != null) {
            kl0Var2.l();
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
        tL_channels_getParticipants.filter.f18108q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.qo(10, this, tL_channels_getParticipants));
    }

    public final void U() {
        this.f27534i0 = -1;
        this.f27536k0 = -1;
        this.f27537l0 = -1;
        this.m0 = -1;
        this.f27538n0 = -1;
        this.f27539o0 = -1;
        this.f27540p0 = -1;
        this.f27535j0 = -1;
        boolean z10 = true;
        this.f27542r0 = 1;
        TLRPC.Chat chat = this.V;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.f27542r0;
            this.f27542r0 = i10 + 1;
            this.f27534i0 = i10;
        }
        if (!this.f27528c0 || this.f27529d0) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i11 = this.f27542r0;
                int i12 = i11 + 1;
                this.f27542r0 = i12;
                this.m0 = i11;
                this.f27538n0 = i12;
                int size = arrayList.size() + i12;
                this.f27542r0 = size;
                this.f27539o0 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.X;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.f27542r0;
                    this.f27542r0 = i13 + 1;
                    this.f27540p0 = i13;
                }
                int i14 = this.f27542r0;
                this.f27536k0 = i14;
                int size2 = arrayList2.size() + i14;
                this.f27542r0 = size2;
                this.f27537l0 = size2;
            }
        }
        if (this.f27528c0) {
            int i15 = this.f27542r0;
            this.f27542r0 = i15 + 1;
            this.f27541q0 = i15;
        }
        int i16 = this.f27542r0;
        this.f27542r0 = i16 + 1;
        this.f27535j0 = i16;
    }
}
