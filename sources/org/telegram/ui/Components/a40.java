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
public final class a40 extends l71 {
    public final z30 T;
    public int U;
    public final TLRPC.Chat V;
    public final TLRPC.ChatFull W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final a0.h f24484a0;
    public final a0.h f24485b0;
    public boolean f24486c0;
    public boolean f24487d0;
    public final a0.h f24488e0;
    public final HashSet f24489f0;
    public org.telegram.ui.q20 f24490g0;
    public boolean f24491h0;
    public int f24492i0;
    public int f24493j0;
    public int f24494k0;
    public int f24495l0;
    public int m0;
    public int f24496n0;
    public int f24497o0;
    public int f24498p0;
    public int f24499q0;
    public int f24500r0;

    public a40(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(context, i10, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f24484a0 = new a0.h();
        this.f24485b0 = new a0.h();
        setDimBehindAlpha(75);
        this.V = chat;
        this.W = chatFull;
        this.f24488e0 = hVar;
        this.f24489f0 = hashSet;
        this.d.setOnItemClickListener(new j(this, 9));
        z30 z30Var = new z30(this, context);
        this.T = z30Var;
        this.e = z30Var;
        ai.u1 u1Var = this.d;
        w30 w30Var = new w30(this, context);
        this.f28090f = w30Var;
        u1Var.setAdapter(w30Var);
        if (!this.f24486c0) {
            this.Z = false;
            U();
        }
        V();
        I(0.0f);
    }

    public static int N(a40 a40Var, int i10, TLObject tLObject, TLObject tLObject2) {
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(a40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(a40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static void O(a40 a40Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        boolean z10;
        tx0 tx0Var = a40Var.f28093s;
        a0.h hVar3 = a40Var.f24484a0;
        a0.h hVar4 = a40Var.f24485b0;
        ArrayList arrayList2 = a40Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(a40Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(a40Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(a40Var.currentAccount).getClientUserId();
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
            a40Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = a40Var.Y;
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
                if (hVar4.f(peerId) != null || ((hVar2 = a40Var.f24488e0) != null && hVar2.h(peerId) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User user = MessagesController.getInstance(a40Var.currentAccount).getUser(Long.valueOf(peerId));
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
                if (a40Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.kq(a40Var, ConnectionsManager.getInstance(a40Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (a40Var.U <= 0) {
            a40Var.f24486c0 = false;
            a40Var.f24487d0 = true;
            if (a40Var.f24499q0 == 1) {
                i10 = 1;
            } else {
                im0 im0Var = a40Var.f28090f;
                if (im0Var != null) {
                    i10 = im0Var.h() - 1;
                } else {
                    i10 = 0;
                }
            }
            a40Var.K(i10);
            if (arrayList2.isEmpty()) {
                a40Var.f24491h0 = true;
                a40Var.T();
            }
        }
        a40Var.V();
        im0 im0Var2 = a40Var.f28090f;
        if (im0Var2 != null) {
            im0Var2.l();
            if (tx0Var != null && a40Var.f28090f.h() == 0 && a40Var.f24487d0) {
                tx0Var.e(false, true);
            }
        }
    }

    public static int S(a40 a40Var) {
        return a40Var.currentAccount;
    }

    @Override
    public final void E(MotionEvent motionEvent, ei.e2 e2Var) {
        org.telegram.ui.q50 q50Var = this.f24490g0.f40353a;
        if (!q50Var.f40467w0) {
            if (motionEvent.getX() > e2Var.getLeft() && motionEvent.getX() < e2Var.getRight() && motionEvent.getY() > e2Var.getTop() && motionEvent.getY() < e2Var.getBottom()) {
                q50Var.t1(q50Var.E1, null, e2Var, true);
            } else {
                q50Var.t1(q50Var.E1, null, e2Var, false);
            }
        }
    }

    @Override
    public final void G(String str) {
        z30 z30Var = this.T;
        hg.a2 a2Var = z30Var.d;
        a40 a40Var = z30Var.f32826w;
        x30 x30Var = z30Var.e;
        if (x30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x30Var);
            z30Var.e = null;
        }
        a2Var.f(null, null);
        TLRPC.Chat chat = a40Var.V;
        ai.u1 u1Var = a40Var.d;
        a2Var.g(null, true, false, true, false, chat.f20276id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            a40Var.f28093s.e(true, true);
            u1Var.W1 = false;
            u1Var.X1 = 0;
            z30Var.l();
            u1Var.W1 = true;
            u1Var.X1 = 0;
            z30Var.h = true;
            int i10 = z30Var.f32823n + 1;
            z30Var.f32823n = i10;
            x30 x30Var2 = new x30(z30Var, str, i10, 0);
            z30Var.e = x30Var2;
            AndroidUtilities.runOnUIThread(x30Var2, 300L);
            s4.g0 adapter = u1Var.getAdapter();
            im0 im0Var = a40Var.e;
            if (adapter != im0Var) {
                u1Var.setAdapter(im0Var);
                return;
            }
            return;
        }
        z30Var.f32823n = -1;
    }

    @Override
    public final void L() {
        this.I = org.telegram.ui.ActionBar.h6.Pg;
        this.J = org.telegram.ui.ActionBar.h6.f21016eg;
        int i10 = org.telegram.ui.ActionBar.h6.f20925a;
        this.K = org.telegram.ui.ActionBar.h6.fg;
        this.L = org.telegram.ui.ActionBar.h6.f21296tg;
        this.M = org.telegram.ui.ActionBar.h6.f21183ng;
        this.N = org.telegram.ui.ActionBar.h6.f21201og;
        this.O = org.telegram.ui.ActionBar.h6.f21144lg;
        this.P = org.telegram.ui.ActionBar.h6.f21257rg;
        this.Q = org.telegram.ui.ActionBar.h6.f21163mg;
    }

    public final void T() {
        if (!this.f24491h0) {
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
                if (j11 == j10 || this.f24488e0.h(j11) >= 0 || this.f24489f0.contains(Long.valueOf(j11))) {
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
            this.f24486c0 = false;
            ArrayList arrayList = this.X;
            arrayList.clear();
            this.Y.clear();
            a0.h hVar2 = this.f24484a0;
            hVar2.b();
            this.f24485b0.b();
            if (chatFull != null) {
                long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size = chatFull.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                    long j11 = chatParticipant.user_id;
                    if (j11 != j10 && ((hVar = this.f24488e0) == null || hVar.h(j11) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f24491h0 = true;
                    T();
                }
            }
            V();
            im0 im0Var = this.f28090f;
            if (im0Var != null) {
                im0Var.l();
                return;
            }
            return;
        }
        this.f24486c0 = true;
        tx0 tx0Var = this.f28093s;
        if (tx0Var != null) {
            tx0Var.e(true, false);
        }
        im0 im0Var2 = this.f28090f;
        if (im0Var2 != null) {
            im0Var2.l();
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
        tL_channels_getParticipants.filter.f20275q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.vc(17, this, tL_channels_getParticipants));
    }

    public final void V() {
        this.f24492i0 = -1;
        this.f24494k0 = -1;
        this.f24495l0 = -1;
        this.m0 = -1;
        this.f24496n0 = -1;
        this.f24497o0 = -1;
        this.f24498p0 = -1;
        this.f24493j0 = -1;
        boolean z10 = true;
        this.f24500r0 = 1;
        TLRPC.Chat chat = this.V;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.f24500r0;
            this.f24500r0 = i10 + 1;
            this.f24492i0 = i10;
        }
        if (!this.f24486c0 || this.f24487d0) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i11 = this.f24500r0;
                int i12 = i11 + 1;
                this.f24500r0 = i12;
                this.m0 = i11;
                this.f24496n0 = i12;
                int size = arrayList.size() + i12;
                this.f24500r0 = size;
                this.f24497o0 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.X;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.f24500r0;
                    this.f24500r0 = i13 + 1;
                    this.f24498p0 = i13;
                }
                int i14 = this.f24500r0;
                this.f24494k0 = i14;
                int size2 = arrayList2.size() + i14;
                this.f24500r0 = size2;
                this.f24495l0 = size2;
            }
        }
        if (this.f24486c0) {
            int i15 = this.f24500r0;
            this.f24500r0 = i15 + 1;
            this.f24499q0 = i15;
        }
        int i16 = this.f24500r0;
        this.f24500r0 = i16 + 1;
        this.f24493j0 = i16;
    }
}
