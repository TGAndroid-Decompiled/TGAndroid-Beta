package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h20 extends b51 {
    public final g20 K1;
    public int L1;
    public final TLRPC.Chat M1;
    public final TLRPC.ChatFull N1;
    public final ArrayList O1;
    public final ArrayList P1;
    public boolean Q1;
    public final a0.h R1;
    public final a0.h S1;
    public boolean T1;
    public boolean U1;
    public final a0.h V1;
    public final HashSet W1;
    public org.telegram.ui.h10 X1;
    public boolean Y1;
    public int Z1;
    public int f34094a2;
    public int f34095b2;
    public int f34096c2;
    public int d2;
    public int f34097e2;
    public int f34098f2;
    public int f34099g2;
    public int f34100h2;
    public int f34101i2;

    public h20(Context context, int i7, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(i7, context, null);
        this.O1 = new ArrayList();
        this.P1 = new ArrayList();
        this.R1 = new a0.h();
        this.S1 = new a0.h();
        this.f28643p0 = 75;
        this.M1 = chat;
        this.N1 = chatFull;
        this.V1 = hVar;
        this.W1 = hashSet;
        this.f32043k1.setOnItemClickListener(new k(this, 9));
        g20 g20Var = new g20(this, context);
        this.K1 = g20Var;
        this.l1 = g20Var;
        bi.q1 q1Var = this.f32043k1;
        d20 d20Var = new d20(this, context);
        this.f32044m1 = d20Var;
        q1Var.setAdapter(d20Var);
        if (!this.T1) {
            this.Q1 = false;
            S0();
        }
        T0();
        M0(0.0f);
    }

    @Override
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.c40 c40Var = this.X1.f46193a;
        if (!c40Var.f44602n2) {
            if (motionEvent.getX() > iVar.getLeft() && motionEvent.getX() < iVar.getRight() && motionEvent.getY() > iVar.getTop() && motionEvent.getY() < iVar.getBottom()) {
                c40Var.v1(c40Var.f44640v3, null, iVar, true);
            } else {
                c40Var.v1(c40Var.f44640v3, null, iVar, false);
            }
        }
    }

    @Override
    public final void L0(String str) {
        g20 g20Var = this.K1;
        jg.z1 z1Var = g20Var.d;
        h20 h20Var = g20Var.f33801x;
        e20 e20Var = g20Var.f33795e;
        if (e20Var != null) {
            org.telegram.messenger.g0.r(e20Var);
            g20Var.f33795e = null;
        }
        z1Var.f(null, null);
        TLRPC.Chat chat = h20Var.M1;
        bi.q1 q1Var = h20Var.f32043k1;
        z1Var.g(null, true, false, true, false, chat.f26956id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            h20Var.f32047q1.e(true, true);
            q1Var.W1 = false;
            q1Var.X1 = 0;
            g20Var.f();
            q1Var.W1 = true;
            q1Var.X1 = 0;
            g20Var.h = true;
            int i7 = g20Var.f33797n + 1;
            g20Var.f33797n = i7;
            e20 e20Var2 = new e20(g20Var, str, i7, 0);
            g20Var.f33795e = e20Var2;
            org.telegram.messenger.g0.i3(e20Var2, 300L);
            v4.g0 adapter = q1Var.getAdapter();
            oj0 oj0Var = h20Var.l1;
            if (adapter != oj0Var) {
                q1Var.setAdapter(oj0Var);
                return;
            }
            return;
        }
        g20Var.f33797n = -1;
    }

    @Override
    public final void P0() {
        this.f32056z1 = org.telegram.ui.ActionBar.k6.Dh;
        this.A1 = org.telegram.ui.ActionBar.k6.Sg;
        int i7 = org.telegram.ui.ActionBar.k6.f27788a;
        this.B1 = org.telegram.ui.ActionBar.k6.Tg;
        this.C1 = org.telegram.ui.ActionBar.k6.f27935hh;
        this.D1 = org.telegram.ui.ActionBar.k6.f27825bh;
        this.E1 = org.telegram.ui.ActionBar.k6.f27845ch;
        this.F1 = org.telegram.ui.ActionBar.k6.Zg;
        this.G1 = org.telegram.ui.ActionBar.k6.f27898fh;
        this.H1 = org.telegram.ui.ActionBar.k6.f27806ah;
    }

    public final void R0() {
        if (!this.Y1) {
            return;
        }
        ArrayList arrayList = org.telegram.messenger.g5.r(this.f28616a).f22608e0;
        ArrayList arrayList2 = this.P1;
        arrayList2.addAll(arrayList);
        long j3 = org.telegram.messenger.p10.i(this.f28616a).f24489n;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i7);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j10 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j10 == j3 || this.V1.h(j10) >= 0 || this.W1.contains(Long.valueOf(j10))) {
                    arrayList2.remove(i7);
                    i7--;
                    size--;
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new jg.d(org.telegram.messenger.qp.s1(this.f28616a), ConnectionsManager.getInstance(this.f28616a).getCurrentTime(), 2));
    }

    public final void S0() {
        a0.h hVar;
        TLRPC.Chat chat = this.M1;
        boolean T = org.telegram.messenger.t3.T(chat);
        TLRPC.ChatFull chatFull = this.N1;
        if (!T) {
            this.T1 = false;
            ArrayList arrayList = this.O1;
            arrayList.clear();
            this.P1.clear();
            a0.h hVar2 = this.R1;
            hVar2.b();
            this.S1.b();
            if (chatFull != null) {
                long j3 = org.telegram.messenger.p10.i(this.f28616a).f24489n;
                int size = chatFull.participants.participants.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i7);
                    long j10 = chatParticipant.user_id;
                    if (j10 != j3 && ((hVar = this.V1) == null || hVar.h(j10) < 0)) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(this.f28616a).a2(Long.valueOf(chatParticipant.user_id));
                        if (!org.telegram.messenger.t10.x(a22) && !a22.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.Y1 = true;
                    R0();
                }
            }
            T0();
            oj0 oj0Var = this.f32044m1;
            if (oj0Var != null) {
                oj0Var.f();
                return;
            }
            return;
        }
        this.T1 = true;
        av0 av0Var = this.f32047q1;
        if (av0Var != null) {
            av0Var.e(true, false);
        }
        oj0 oj0Var2 = this.f32044m1;
        if (oj0Var2 != null) {
            oj0Var2.f();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.qp.i1(chat);
        if (chatFull != null && chatFull.participants_count <= 200) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        } else if (!this.Q1) {
            this.L1 = 2;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
            this.Q1 = true;
            S0();
        } else {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        }
        tL_channels_getParticipants.filter.f26955q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.f28616a).sendRequest(tL_channels_getParticipants, new org.telegram.ui.ld(16, this, tL_channels_getParticipants));
    }

    public final void T0() {
        this.Z1 = -1;
        this.f34095b2 = -1;
        this.f34096c2 = -1;
        this.d2 = -1;
        this.f34097e2 = -1;
        this.f34098f2 = -1;
        this.f34099g2 = -1;
        this.f34094a2 = -1;
        boolean z9 = true;
        this.f34101i2 = 1;
        TLRPC.Chat chat = this.M1;
        if (org.telegram.messenger.t3.t0(chat) || org.telegram.messenger.t3.y(3, chat)) {
            int i7 = this.f34101i2;
            this.f34101i2 = i7 + 1;
            this.Z1 = i7;
        }
        if (!this.T1 || this.U1) {
            ArrayList arrayList = this.P1;
            if (!arrayList.isEmpty()) {
                int i10 = this.f34101i2;
                int i11 = i10 + 1;
                this.f34101i2 = i11;
                this.d2 = i10;
                this.f34097e2 = i11;
                int size = arrayList.size() + i11;
                this.f34101i2 = size;
                this.f34098f2 = size;
            } else {
                z9 = false;
            }
            ArrayList arrayList2 = this.O1;
            if (!arrayList2.isEmpty()) {
                if (z9) {
                    int i12 = this.f34101i2;
                    this.f34101i2 = i12 + 1;
                    this.f34099g2 = i12;
                }
                int i13 = this.f34101i2;
                this.f34095b2 = i13;
                int size2 = arrayList2.size() + i13;
                this.f34101i2 = size2;
                this.f34096c2 = size2;
            }
        }
        if (this.T1) {
            int i14 = this.f34101i2;
            this.f34101i2 = i14 + 1;
            this.f34100h2 = i14;
        }
        int i15 = this.f34101i2;
        this.f34101i2 = i15 + 1;
        this.f34094a2 = i15;
    }
}
