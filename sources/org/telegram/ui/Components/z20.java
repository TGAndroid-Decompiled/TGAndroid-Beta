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
public final class z20 extends f61 {
    public final y20 K1;
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
    public org.telegram.ui.g20 X1;
    public boolean Y1;
    public int Z1;
    public int a2;
    public int f32974b2;
    public int f32975c2;
    public int f32976d2;
    public int f32977e2;
    public int f32978f2;
    public int f32979g2;
    public int f32980h2;
    public int f32981i2;

    public z20(Context context, int i10, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(i10, context, null);
        this.O1 = new ArrayList();
        this.P1 = new ArrayList();
        this.R1 = new a0.h();
        this.S1 = new a0.h();
        this.f21610p0 = 75;
        this.M1 = chat;
        this.N1 = chatFull;
        this.V1 = hVar;
        this.W1 = hashSet;
        this.f26088k1.setOnItemClickListener(new k(this, 9));
        y20 y20Var = new y20(this, context);
        this.K1 = y20Var;
        this.l1 = y20Var;
        ag.b1 b1Var = this.f26088k1;
        v20 v20Var = new v20(this, context);
        this.f26089m1 = v20Var;
        b1Var.setAdapter(v20Var);
        if (!this.T1) {
            this.Q1 = false;
            S0();
        }
        T0();
        M0(0.0f);
    }

    @Override
    public final void J0(MotionEvent motionEvent, org.telegram.ui.ActionBar.n0 n0Var) {
        org.telegram.ui.a50 a50Var = this.X1.f37278a;
        if (!a50Var.f35634n2) {
            if (motionEvent.getX() > n0Var.getLeft() && motionEvent.getX() < n0Var.getRight() && motionEvent.getY() > n0Var.getTop() && motionEvent.getY() < n0Var.getBottom()) {
                a50Var.u1(a50Var.f35673v3, null, n0Var, true);
            } else {
                a50Var.u1(a50Var.f35673v3, null, n0Var, false);
            }
        }
    }

    @Override
    public final void L0(String str) {
        y20 y20Var = this.K1;
        zf.m1 m1Var = y20Var.d;
        z20 z20Var = y20Var.f32707x;
        w20 w20Var = y20Var.e;
        if (w20Var != null) {
            org.telegram.messenger.i0.r(w20Var);
            y20Var.e = null;
        }
        m1Var.f(null, null);
        TLRPC.Chat chat = z20Var.M1;
        ag.b1 b1Var = z20Var.f26088k1;
        m1Var.g(null, true, false, true, false, chat.f19794id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            z20Var.f26093q1.e(true, true);
            b1Var.W1 = false;
            b1Var.X1 = 0;
            y20Var.f();
            b1Var.W1 = true;
            b1Var.X1 = 0;
            y20Var.h = true;
            int i10 = y20Var.f32703n + 1;
            y20Var.f32703n = i10;
            w20 w20Var2 = new w20(y20Var, str, i10, 0);
            y20Var.e = w20Var2;
            org.telegram.messenger.i0.h3(w20Var2, 300L);
            s4.g0 adapter = b1Var.getAdapter();
            tk0 tk0Var = z20Var.l1;
            if (adapter != tk0Var) {
                b1Var.setAdapter(tk0Var);
                return;
            }
            return;
        }
        y20Var.f32703n = -1;
    }

    @Override
    public final void P0() {
        this.f26102z1 = org.telegram.ui.ActionBar.t6.Dh;
        this.A1 = org.telegram.ui.ActionBar.t6.Sg;
        int i10 = org.telegram.ui.ActionBar.t6.f20866a;
        this.B1 = org.telegram.ui.ActionBar.t6.Tg;
        this.C1 = org.telegram.ui.ActionBar.t6.f21012hh;
        this.D1 = org.telegram.ui.ActionBar.t6.f20902bh;
        this.E1 = org.telegram.ui.ActionBar.t6.f20922ch;
        this.F1 = org.telegram.ui.ActionBar.t6.Zg;
        this.G1 = org.telegram.ui.ActionBar.t6.f20977fh;
        this.H1 = org.telegram.ui.ActionBar.t6.f20883ah;
    }

    public final void R0() {
        if (!this.Y1) {
            return;
        }
        ArrayList arrayList = org.telegram.messenger.i5.r(this.f21584a).f16218e0;
        ArrayList arrayList2 = this.P1;
        arrayList2.addAll(arrayList);
        long j10 = org.telegram.messenger.e20.i(this.f21584a).f15524n;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i10);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j11 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j11 == j10 || this.V1.h(j11) >= 0 || this.W1.contains(Long.valueOf(j11))) {
                    arrayList2.remove(i10);
                    i10--;
                    size--;
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new u20(org.telegram.messenger.wp.r1(this.f21584a), ConnectionsManager.getInstance(this.f21584a).getCurrentTime(), 0));
    }

    public final void S0() {
        a0.h hVar;
        TLRPC.Chat chat = this.M1;
        boolean T = org.telegram.messenger.w3.T(chat);
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
                long j10 = org.telegram.messenger.e20.i(this.f21584a).f15524n;
                int size = chatFull.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i10);
                    long j11 = chatParticipant.user_id;
                    if (j11 != j10 && ((hVar = this.V1) == null || hVar.h(j11) < 0)) {
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(this.f21584a).Z1(Long.valueOf(chatParticipant.user_id));
                        if (!org.telegram.messenger.i20.x(Z1) && !Z1.bot) {
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
            tk0 tk0Var = this.f26089m1;
            if (tk0Var != null) {
                tk0Var.f();
                return;
            }
            return;
        }
        this.T1 = true;
        ew0 ew0Var = this.f26093q1;
        if (ew0Var != null) {
            ew0Var.e(true, false);
        }
        tk0 tk0Var2 = this.f26089m1;
        if (tk0Var2 != null) {
            tk0Var2.f();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.wp.h1(chat);
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
        tL_channels_getParticipants.filter.f19793q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.f21584a).sendRequest(tL_channels_getParticipants, new t20(0, this, tL_channels_getParticipants));
    }

    public final void T0() {
        this.Z1 = -1;
        this.f32974b2 = -1;
        this.f32975c2 = -1;
        this.f32976d2 = -1;
        this.f32977e2 = -1;
        this.f32978f2 = -1;
        this.f32979g2 = -1;
        this.a2 = -1;
        boolean z10 = true;
        this.f32981i2 = 1;
        TLRPC.Chat chat = this.M1;
        if (org.telegram.messenger.w3.t0(chat) || org.telegram.messenger.w3.y(3, chat)) {
            int i10 = this.f32981i2;
            this.f32981i2 = i10 + 1;
            this.Z1 = i10;
        }
        if (!this.T1 || this.U1) {
            ArrayList arrayList = this.P1;
            if (!arrayList.isEmpty()) {
                int i11 = this.f32981i2;
                int i12 = i11 + 1;
                this.f32981i2 = i12;
                this.f32976d2 = i11;
                this.f32977e2 = i12;
                int size = arrayList.size() + i12;
                this.f32981i2 = size;
                this.f32978f2 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.O1;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i13 = this.f32981i2;
                    this.f32981i2 = i13 + 1;
                    this.f32979g2 = i13;
                }
                int i14 = this.f32981i2;
                this.f32974b2 = i14;
                int size2 = arrayList2.size() + i14;
                this.f32981i2 = size2;
                this.f32975c2 = size2;
            }
        }
        if (this.T1) {
            int i15 = this.f32981i2;
            this.f32981i2 = i15 + 1;
            this.f32980h2 = i15;
        }
        int i16 = this.f32981i2;
        this.f32981i2 = i16 + 1;
        this.a2 = i16;
    }
}
