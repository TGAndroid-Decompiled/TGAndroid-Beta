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
public final class t30 extends q61 {
    public final s30 Q;
    public int R;
    public final TLRPC.Chat S;
    public final TLRPC.ChatFull T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final a0.h X;
    public final a0.h Y;
    public boolean Z;
    public boolean f28878a0;
    public final a0.h f28879b0;
    public final HashSet f28880c0;
    public org.telegram.ui.e30 f28881d0;
    public boolean f28882e0;
    public int f28883f0;
    public int f28884g0;
    public int f28885h0;
    public int f28886i0;
    public int f28887j0;
    public int f28888k0;
    public int f28889l0;
    public int m0;
    public int f28890n0;
    public int f28891o0;

    public t30(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(context, i10, null);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.X = new a0.h();
        this.Y = new a0.h();
        setDimBehindAlpha(75);
        this.S = chat;
        this.T = chatFull;
        this.f28879b0 = hVar;
        this.f28880c0 = hashSet;
        this.d.setOnItemClickListener(new k(this, 9));
        s30 s30Var = new s30(this, context);
        this.Q = s30Var;
        this.e = s30Var;
        lh.e1 e1Var = this.d;
        p30 p30Var = new p30(this, context);
        this.f28068f = p30Var;
        e1Var.setAdapter(p30Var);
        if (!this.Z) {
            this.W = false;
            T();
        }
        U();
        G(0.0f);
    }

    public static int M(t30 t30Var, int i10, TLObject tLObject, TLObject tLObject2) {
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(t30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(t30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static void N(t30 t30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        boolean z4;
        zw0 zw0Var = t30Var.f28071s;
        a0.h hVar3 = t30Var.X;
        a0.h hVar4 = t30Var.Y;
        ArrayList arrayList2 = t30Var.U;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(t30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(t30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(t30Var.currentAccount).getClientUserId();
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
            t30Var.R--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = t30Var.V;
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
                if (hVar4.f(peerId) != null || ((hVar2 = t30Var.f28879b0) != null && hVar2.h(peerId) >= 0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                TLRPC.User user = MessagesController.getInstance(t30Var.currentAccount).getUser(Long.valueOf(peerId));
                if ((user != null && user.bot) || UserObject.isDeleted(user)) {
                    z4 = true;
                }
                if (z4) {
                    arrayList2.remove(i13);
                    hVar3.l(peerId);
                    i13--;
                    size2--;
                }
                i13++;
            }
            try {
                if (t30Var.T.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.sq(t30Var, ConnectionsManager.getInstance(t30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (t30Var.R <= 0) {
            t30Var.Z = false;
            t30Var.f28878a0 = true;
            if (t30Var.f28890n0 == 1) {
                i10 = 1;
            } else {
                rl0 rl0Var = t30Var.f28068f;
                if (rl0Var != null) {
                    i10 = rl0Var.h() - 1;
                } else {
                    i10 = 0;
                }
            }
            t30Var.I(i10);
            if (arrayList2.isEmpty()) {
                t30Var.f28882e0 = true;
                t30Var.S();
            }
        }
        t30Var.U();
        rl0 rl0Var2 = t30Var.f28068f;
        if (rl0Var2 != null) {
            rl0Var2.l();
            if (zw0Var != null && t30Var.f28068f.h() == 0 && t30Var.f28878a0) {
                zw0Var.e(false, true);
            }
        }
    }

    public static int R(t30 t30Var) {
        return t30Var.currentAccount;
    }

    @Override
    public final void D(MotionEvent motionEvent, kg.f fVar) {
        org.telegram.ui.c60 c60Var = this.f28881d0.f33877a;
        if (!c60Var.f33176t0) {
            if (motionEvent.getX() > fVar.getLeft() && motionEvent.getX() < fVar.getRight() && motionEvent.getY() > fVar.getTop() && motionEvent.getY() < fVar.getBottom()) {
                c60Var.s1(c60Var.B1, null, fVar, true);
            } else {
                c60Var.s1(c60Var.B1, null, fVar, false);
            }
        }
    }

    @Override
    public final void F(String str) {
        s30 s30Var = this.Q;
        tf.k1 k1Var = s30Var.d;
        t30 t30Var = s30Var.f28625w;
        q30 q30Var = s30Var.e;
        if (q30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(q30Var);
            s30Var.e = null;
        }
        k1Var.f(null, null);
        TLRPC.Chat chat = t30Var.S;
        lh.e1 e1Var = t30Var.d;
        k1Var.g(null, true, false, true, false, chat.f19184id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            t30Var.f28071s.e(true, true);
            e1Var.V1 = false;
            e1Var.W1 = 0;
            s30Var.l();
            e1Var.V1 = true;
            e1Var.W1 = 0;
            s30Var.h = true;
            int i10 = s30Var.f28622n + 1;
            s30Var.f28622n = i10;
            q30 q30Var2 = new q30(s30Var, str, i10, 0);
            s30Var.e = q30Var2;
            AndroidUtilities.runOnUIThread(q30Var2, 300L);
            f2.o0 adapter = e1Var.getAdapter();
            rl0 rl0Var = t30Var.e;
            if (adapter != rl0Var) {
                e1Var.setAdapter(rl0Var);
                return;
            }
            return;
        }
        s30Var.f28622n = -1;
    }

    @Override
    public final void J() {
        this.F = org.telegram.ui.ActionBar.j6.Pg;
        this.G = org.telegram.ui.ActionBar.j6.f19933eg;
        int i10 = org.telegram.ui.ActionBar.j6.f19845a;
        this.H = org.telegram.ui.ActionBar.j6.f19951fg;
        this.I = org.telegram.ui.ActionBar.j6.f20198tg;
        this.J = org.telegram.ui.ActionBar.j6.f20094ng;
        this.K = org.telegram.ui.ActionBar.j6.f20112og;
        this.L = org.telegram.ui.ActionBar.j6.f20059lg;
        this.M = org.telegram.ui.ActionBar.j6.f20166rg;
        this.N = org.telegram.ui.ActionBar.j6.f20076mg;
    }

    public final void S() {
        if (!this.f28882e0) {
            return;
        }
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(this.currentAccount).contacts;
        ArrayList arrayList2 = this.V;
        arrayList2.addAll(arrayList);
        long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i10);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j11 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j11 == j10 || this.f28879b0.h(j11) >= 0 || this.f28880c0.contains(Long.valueOf(j11))) {
                    arrayList2.remove(i10);
                    i10--;
                    size--;
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new o30(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 0));
    }

    public final void T() {
        a0.h hVar;
        TLRPC.Chat chat = this.S;
        boolean isChannel = ChatObject.isChannel(chat);
        TLRPC.ChatFull chatFull = this.T;
        if (!isChannel) {
            this.Z = false;
            ArrayList arrayList = this.U;
            arrayList.clear();
            this.V.clear();
            a0.h hVar2 = this.X;
            hVar2.b();
            this.Y.b();
            if (chatFull != null) {
                long j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size = chatFull.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                    long j11 = chatParticipant.user_id;
                    if (j11 != j10 && ((hVar = this.f28879b0) == null || hVar.h(j11) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f28882e0 = true;
                    S();
                }
            }
            U();
            rl0 rl0Var = this.f28068f;
            if (rl0Var != null) {
                rl0Var.l();
                return;
            }
            return;
        }
        this.Z = true;
        zw0 zw0Var = this.f28071s;
        if (zw0Var != null) {
            zw0Var.e(true, false);
        }
        rl0 rl0Var2 = this.f28068f;
        if (rl0Var2 != null) {
            rl0Var2.l();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
        if (chatFull != null && chatFull.participants_count <= 200) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        } else if (!this.W) {
            this.R = 2;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
            this.W = true;
            T();
        } else {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        }
        tL_channels_getParticipants.filter.f19183q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.lo(10, this, tL_channels_getParticipants));
    }

    public final void U() {
        this.f28883f0 = -1;
        this.f28885h0 = -1;
        this.f28886i0 = -1;
        this.f28887j0 = -1;
        this.f28888k0 = -1;
        this.f28889l0 = -1;
        this.m0 = -1;
        this.f28884g0 = -1;
        boolean z4 = true;
        this.f28891o0 = 1;
        TLRPC.Chat chat = this.S;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.f28891o0;
            this.f28891o0 = i10 + 1;
            this.f28883f0 = i10;
        }
        if (!this.Z || this.f28878a0) {
            ArrayList arrayList = this.V;
            if (!arrayList.isEmpty()) {
                int i11 = this.f28891o0;
                int i12 = i11 + 1;
                this.f28891o0 = i12;
                this.f28887j0 = i11;
                this.f28888k0 = i12;
                int size = arrayList.size() + i12;
                this.f28891o0 = size;
                this.f28889l0 = size;
            } else {
                z4 = false;
            }
            ArrayList arrayList2 = this.U;
            if (!arrayList2.isEmpty()) {
                if (z4) {
                    int i13 = this.f28891o0;
                    this.f28891o0 = i13 + 1;
                    this.m0 = i13;
                }
                int i14 = this.f28891o0;
                this.f28885h0 = i14;
                int size2 = arrayList2.size() + i14;
                this.f28891o0 = size2;
                this.f28886i0 = size2;
            }
        }
        if (this.Z) {
            int i15 = this.f28891o0;
            this.f28891o0 = i15 + 1;
            this.f28890n0 = i15;
        }
        int i16 = this.f28891o0;
        this.f28891o0 = i16 + 1;
        this.f28884g0 = i16;
    }
}
