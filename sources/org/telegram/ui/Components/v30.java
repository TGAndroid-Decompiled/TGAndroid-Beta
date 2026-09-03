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
public final class v30 extends r61 {
    public final u30 Q;
    public int R;
    public final TLRPC.Chat S;
    public final TLRPC.ChatFull T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final a0.h X;
    public final a0.h Y;
    public boolean Z;
    public boolean f31764a0;
    public final a0.h f31765b0;
    public final HashSet f31766c0;
    public org.telegram.ui.f30 f31767d0;
    public boolean f31768e0;
    public int f31769f0;
    public int f31770g0;
    public int f31771h0;
    public int f31772i0;
    public int f31773j0;
    public int f31774k0;
    public int f31775l0;
    public int m0;
    public int f31776n0;
    public int f31777o0;

    public v30(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(context, i10, null);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.X = new a0.h();
        this.Y = new a0.h();
        setDimBehindAlpha(75);
        this.S = chat;
        this.T = chatFull;
        this.f31765b0 = hVar;
        this.f31766c0 = hashSet;
        this.d.setOnItemClickListener(new k(this, 9));
        u30 u30Var = new u30(this, context);
        this.Q = u30Var;
        this.f30666e = u30Var;
        mh.d1 d1Var = this.d;
        r30 r30Var = new r30(this, context);
        this.f30667f = r30Var;
        d1Var.setAdapter(r30Var);
        if (!this.Z) {
            this.W = false;
            T();
        }
        U();
        G(0.0f);
    }

    public static int M(v30 v30Var, int i10, TLObject tLObject, TLObject tLObject2) {
        int i11;
        int i12;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.User user = MessagesController.getInstance(v30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        TLRPC.User user2 = MessagesController.getInstance(v30Var.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer)));
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

    public static void N(v30 v30Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        boolean z4;
        zw0 zw0Var = v30Var.f30670s;
        a0.h hVar3 = v30Var.X;
        a0.h hVar4 = v30Var.Y;
        ArrayList arrayList2 = v30Var.U;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            MessagesController.getInstance(v30Var.currentAccount).putUsers(tL_channels_channelParticipants.users, false);
            MessagesController.getInstance(v30Var.currentAccount).putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(v30Var.currentAccount).getClientUserId();
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
            v30Var.R--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = v30Var.V;
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
                if (hVar4.f(peerId) != null || ((hVar2 = v30Var.f31765b0) != null && hVar2.h(peerId) >= 0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                TLRPC.User user = MessagesController.getInstance(v30Var.currentAccount).getUser(Long.valueOf(peerId));
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
                if (v30Var.T.participants_count <= 200) {
                    Collections.sort(arrayList, new org.telegram.ui.tq(v30Var, ConnectionsManager.getInstance(v30Var.currentAccount).getCurrentTime(), 1));
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        if (v30Var.R <= 0) {
            v30Var.Z = false;
            v30Var.f31764a0 = true;
            if (v30Var.f31776n0 == 1) {
                i10 = 1;
            } else {
                rl0 rl0Var = v30Var.f30667f;
                if (rl0Var != null) {
                    i10 = rl0Var.h() - 1;
                } else {
                    i10 = 0;
                }
            }
            v30Var.I(i10);
            if (arrayList2.isEmpty()) {
                v30Var.f31768e0 = true;
                v30Var.S();
            }
        }
        v30Var.U();
        rl0 rl0Var2 = v30Var.f30667f;
        if (rl0Var2 != null) {
            rl0Var2.l();
            if (zw0Var != null && v30Var.f30667f.h() == 0 && v30Var.f31764a0) {
                zw0Var.e(false, true);
            }
        }
    }

    public static int R(v30 v30Var) {
        return v30Var.currentAccount;
    }

    @Override
    public final void D(MotionEvent motionEvent, lg.f fVar) {
        org.telegram.ui.d60 d60Var = this.f31767d0.f36646a;
        if (!d60Var.f36069t0) {
            if (motionEvent.getX() > fVar.getLeft() && motionEvent.getX() < fVar.getRight() && motionEvent.getY() > fVar.getTop() && motionEvent.getY() < fVar.getBottom()) {
                d60Var.s1(d60Var.B1, null, fVar, true);
            } else {
                d60Var.s1(d60Var.B1, null, fVar, false);
            }
        }
    }

    @Override
    public final void F(String str) {
        u30 u30Var = this.Q;
        uf.k1 k1Var = u30Var.d;
        v30 v30Var = u30Var.f31495w;
        s30 s30Var = u30Var.f31490e;
        if (s30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(s30Var);
            u30Var.f31490e = null;
        }
        k1Var.f(null, null);
        TLRPC.Chat chat = v30Var.S;
        mh.d1 d1Var = v30Var.d;
        k1Var.g(null, true, false, true, false, chat.f20845id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            v30Var.f30670s.e(true, true);
            d1Var.V1 = false;
            d1Var.W1 = 0;
            u30Var.l();
            d1Var.V1 = true;
            d1Var.W1 = 0;
            u30Var.h = true;
            int i10 = u30Var.f31492n + 1;
            u30Var.f31492n = i10;
            s30 s30Var2 = new s30(u30Var, str, i10, 0);
            u30Var.f31490e = s30Var2;
            AndroidUtilities.runOnUIThread(s30Var2, 300L);
            f2.p0 adapter = d1Var.getAdapter();
            rl0 rl0Var = v30Var.f30666e;
            if (adapter != rl0Var) {
                d1Var.setAdapter(rl0Var);
                return;
            }
            return;
        }
        u30Var.f31492n = -1;
    }

    @Override
    public final void J() {
        this.F = org.telegram.ui.ActionBar.k6.Pg;
        this.G = org.telegram.ui.ActionBar.k6.f21689eg;
        int i10 = org.telegram.ui.ActionBar.k6.f21600a;
        this.H = org.telegram.ui.ActionBar.k6.f21707fg;
        this.I = org.telegram.ui.ActionBar.k6.f21954tg;
        this.J = org.telegram.ui.ActionBar.k6.f21850ng;
        this.K = org.telegram.ui.ActionBar.k6.f21868og;
        this.L = org.telegram.ui.ActionBar.k6.f21815lg;
        this.M = org.telegram.ui.ActionBar.k6.f21922rg;
        this.N = org.telegram.ui.ActionBar.k6.f21832mg;
    }

    public final void S() {
        if (!this.f31768e0) {
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
                if (j11 == j10 || this.f31765b0.h(j11) >= 0 || this.f31766c0.contains(Long.valueOf(j11))) {
                    arrayList2.remove(i10);
                    i10--;
                    size--;
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new q30(MessagesController.getInstance(this.currentAccount), ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), 0));
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
                    if (j11 != j10 && ((hVar = this.f31765b0) == null || hVar.h(j11) < 0)) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(chatParticipant.user_id));
                        if (!UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f31768e0 = true;
                    S();
                }
            }
            U();
            rl0 rl0Var = this.f30667f;
            if (rl0Var != null) {
                rl0Var.l();
                return;
            }
            return;
        }
        this.Z = true;
        zw0 zw0Var = this.f30670s;
        if (zw0Var != null) {
            zw0Var.e(true, false);
        }
        rl0 rl0Var2 = this.f30667f;
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
        tL_channels_getParticipants.filter.f20844q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new org.telegram.ui.lo(10, this, tL_channels_getParticipants));
    }

    public final void U() {
        this.f31769f0 = -1;
        this.f31771h0 = -1;
        this.f31772i0 = -1;
        this.f31773j0 = -1;
        this.f31774k0 = -1;
        this.f31775l0 = -1;
        this.m0 = -1;
        this.f31770g0 = -1;
        boolean z4 = true;
        this.f31777o0 = 1;
        TLRPC.Chat chat = this.S;
        if (ChatObject.isPublic(chat) || ChatObject.canUserDoAdminAction(chat, 3)) {
            int i10 = this.f31777o0;
            this.f31777o0 = i10 + 1;
            this.f31769f0 = i10;
        }
        if (!this.Z || this.f31764a0) {
            ArrayList arrayList = this.V;
            if (!arrayList.isEmpty()) {
                int i11 = this.f31777o0;
                int i12 = i11 + 1;
                this.f31777o0 = i12;
                this.f31773j0 = i11;
                this.f31774k0 = i12;
                int size = arrayList.size() + i12;
                this.f31777o0 = size;
                this.f31775l0 = size;
            } else {
                z4 = false;
            }
            ArrayList arrayList2 = this.U;
            if (!arrayList2.isEmpty()) {
                if (z4) {
                    int i13 = this.f31777o0;
                    this.f31777o0 = i13 + 1;
                    this.m0 = i13;
                }
                int i14 = this.f31777o0;
                this.f31771h0 = i14;
                int size2 = arrayList2.size() + i14;
                this.f31777o0 = size2;
                this.f31772i0 = size2;
            }
        }
        if (this.Z) {
            int i15 = this.f31777o0;
            this.f31777o0 = i15 + 1;
            this.f31776n0 = i15;
        }
        int i16 = this.f31777o0;
        this.f31777o0 = i16 + 1;
        this.f31770g0 = i16;
    }
}
