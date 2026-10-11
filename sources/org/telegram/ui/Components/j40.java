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
public final class j40 extends v71 {
    public final i40 T;
    public int U;
    public final TLRPC.Chat V;
    public final TLRPC.ChatFull W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public final a0.i f27542a0;
    public final a0.i f27543b0;
    public boolean f27544c0;
    public boolean f27545d0;
    public final a0.i f27546e0;
    public final HashSet f27547f0;
    public org.telegram.ui.h30 f27548g0;
    public boolean f27549h0;
    public int f27550i0;
    public int f27551j0;
    public int f27552k0;
    public int f27553l0;
    public int m0;
    public int f27554n0;
    public int f27555o0;
    public int f27556p0;
    public int f27557q0;
    public int f27558r0;

    public j40(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.i iVar, HashSet hashSet) {
        super(context, i10, null);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f27542a0 = new a0.i();
        this.f27543b0 = new a0.i();
        setDimBehindAlpha(75);
        this.V = chat;
        this.W = chatFull;
        this.f27546e0 = iVar;
        this.f27547f0 = hashSet;
        this.d.setOnItemClickListener(new j(this, 9));
        i40 i40Var = new i40(this, context);
        this.T = i40Var;
        this.f31695e = i40Var;
        ai.w0 w0Var = this.d;
        f40 f40Var = new f40(this, context);
        this.f31696f = f40Var;
        w0Var.setAdapter(f40Var);
        if (!this.f27544c0) {
            this.Z = false;
            U();
        }
        V();
        I(0.0f);
    }

    public static int N(j40 j40Var, int i10, TLObject tLObject, TLObject tLObject2) {
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(j40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(j40Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static void O(j40 j40Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i10;
        a0.i iVar;
        ArrayList arrayList;
        a0.i iVar2;
        boolean z10;
        cy0 cy0Var = j40Var.f31699s;
        a0.i iVar3 = j40Var.f27542a0;
        a0.i iVar4 = j40Var.f27543b0;
        ArrayList arrayList2 = j40Var.X;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(j40Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(j40Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(j40Var.currentAccount).getClientUserId();
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
            j40Var.U--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = j40Var.Y;
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
                if (iVar4.f(peerId) != null || ((iVar2 = j40Var.f27546e0) != null && iVar2.h(peerId) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User user = MessagesController.getInstance(j40Var.currentAccount).getUser(Long.valueOf(peerId));
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
                if (j40Var.W.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.wq(j40Var, ConnectionsManager.getInstance(j40Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (j40Var.U <= 0) {
            j40Var.f27544c0 = false;
            j40Var.f27545d0 = true;
            if (j40Var.f27557q0 == 1) {
                i10 = 1;
            } else {
                rm0 rm0Var = j40Var.f31696f;
                if (rm0Var != null) {
                    i10 = rm0Var.h() - 1;
                } else {
                    i10 = 0;
                }
            }
            j40Var.K(i10);
            if (arrayList2.isEmpty()) {
                j40Var.f27549h0 = true;
                j40Var.T();
            }
        }
        j40Var.V();
        rm0 rm0Var2 = j40Var.f31696f;
        if (rm0Var2 != null) {
            rm0Var2.l();
            if (cy0Var != null && j40Var.f31696f.h() == 0 && j40Var.f27545d0) {
                cy0Var.e(false, true);
            }
        }
    }

    public static int S(j40 j40Var) {
        return j40Var.currentAccount;
    }

    @Override
    public final void F(MotionEvent motionEvent, ci.g2 g2Var) {
        org.telegram.ui.g60 g60Var = this.f27548g0.f38237a;
        if (!g60Var.f37960w0) {
            if (motionEvent.getX() > g2Var.getLeft() && motionEvent.getX() < g2Var.getRight() && motionEvent.getY() > g2Var.getTop() && motionEvent.getY() < g2Var.getBottom()) {
                g60Var.t1(g60Var.E1, null, g2Var, true);
            } else {
                g60Var.t1(g60Var.E1, null, g2Var, false);
            }
        }
    }

    @Override
    public final void H(String str) {
        i40 i40Var = this.T;
        gg.b2 b2Var = i40Var.d;
        j40 j40Var = i40Var.f27178w;
        g40 g40Var = i40Var.f27173e;
        if (g40Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g40Var);
            i40Var.f27173e = null;
        }
        b2Var.f(null, null);
        TLRPC.Chat chat = j40Var.V;
        ai.w0 w0Var = j40Var.d;
        b2Var.g(null, true, false, true, false, chat.f20032id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            j40Var.f31699s.e(true, true);
            w0Var.W1 = false;
            w0Var.X1 = 0;
            i40Var.l();
            w0Var.W1 = true;
            w0Var.X1 = 0;
            i40Var.h = true;
            int i10 = i40Var.f27175n + 1;
            i40Var.f27175n = i10;
            g40 g40Var2 = new g40(i40Var, str, i10, 0);
            i40Var.f27173e = g40Var2;
            AndroidUtilities.runOnUIThread(g40Var2, 300L);
            s4.i0 adapter = w0Var.getAdapter();
            rm0 rm0Var = j40Var.f31695e;
            if (adapter != rm0Var) {
                w0Var.setAdapter(rm0Var);
                return;
            }
            return;
        }
        i40Var.f27175n = -1;
    }

    @Override
    public final void L() {
        this.I = org.telegram.ui.ActionBar.h6.Pg;
        this.J = org.telegram.ui.ActionBar.h6.eg;
        int i10 = org.telegram.ui.ActionBar.h6.f20723a;
        this.K = org.telegram.ui.ActionBar.h6.f20832fg;
        this.L = org.telegram.ui.ActionBar.h6.f21091tg;
        this.M = org.telegram.ui.ActionBar.h6.f20979ng;
        this.N = org.telegram.ui.ActionBar.h6.f20997og;
        this.O = org.telegram.ui.ActionBar.h6.f20942lg;
        this.P = org.telegram.ui.ActionBar.h6.f21054rg;
        this.Q = org.telegram.ui.ActionBar.h6.f20961mg;
    }

    public final void T() {
        if (!this.f27549h0) {
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
                if (j10 == j3 || this.f27546e0.h(j10) >= 0 || this.f27547f0.contains(Long.valueOf(j10))) {
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
            this.f27544c0 = false;
            ArrayList arrayList = this.X;
            arrayList.clear();
            this.Y.clear();
            a0.i iVar2 = this.f27542a0;
            iVar2.b();
            this.f27543b0.b();
            if (chatFull != null) {
                long j3 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size = chatFull.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                    long j10 = chatParticipant.user_id;
                    if (j10 != j3 && ((iVar = this.f27546e0) == null || iVar.h(j10) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            iVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f27549h0 = true;
                    T();
                }
            }
            V();
            rm0 rm0Var = this.f31696f;
            if (rm0Var != null) {
                rm0Var.l();
                return;
            }
            return;
        }
        this.f27544c0 = true;
        cy0 cy0Var = this.f31699s;
        if (cy0Var != null) {
            cy0Var.e(true, false);
        }
        rm0 rm0Var2 = this.f31696f;
        if (rm0Var2 != null) {
            rm0Var2.l();
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
        tL_channels_getParticipants.filter.f20031q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.oo(10, this, tL_channels_getParticipants));
    }

    public final void V() {
        this.f27550i0 = -1;
        this.f27552k0 = -1;
        this.f27553l0 = -1;
        this.m0 = -1;
        this.f27554n0 = -1;
        this.f27555o0 = -1;
        this.f27556p0 = -1;
        this.f27551j0 = -1;
        boolean z10 = true;
        this.f27558r0 = 1;
        TLRPC.Chat chat = this.V;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.f27558r0;
            this.f27558r0 = i10 + 1;
            this.f27550i0 = i10;
        }
        if (!this.f27544c0 || this.f27545d0) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i11 = this.f27558r0;
                int i12 = i11 + 1;
                this.f27558r0 = i12;
                this.m0 = i11;
                this.f27554n0 = i12;
                int size = arrayList.size() + i12;
                this.f27558r0 = size;
                this.f27555o0 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.X;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.f27558r0;
                    this.f27558r0 = i13 + 1;
                    this.f27556p0 = i13;
                }
                int i14 = this.f27558r0;
                this.f27552k0 = i14;
                int size2 = arrayList2.size() + i14;
                this.f27558r0 = size2;
                this.f27553l0 = size2;
            }
        }
        if (this.f27544c0) {
            int i15 = this.f27558r0;
            this.f27558r0 = i15 + 1;
            this.f27557q0 = i15;
        }
        int i16 = this.f27558r0;
        this.f27558r0 = i16 + 1;
        this.f27551j0 = i16;
    }
}
