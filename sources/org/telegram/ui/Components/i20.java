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
public final class i20 extends c51 {
    public final h20 K1;
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
    public org.telegram.ui.j10 X1;
    public boolean Y1;
    public int Z1;
    public int f34533a2;
    public int f34534b2;
    public int f34535c2;
    public int d2;
    public int f34536e2;
    public int f34537f2;
    public int f34538g2;
    public int f34539h2;
    public int f34540i2;

    public i20(Context context, int i7, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(i7, context, null);
        this.O1 = new ArrayList();
        this.P1 = new ArrayList();
        this.R1 = new a0.h();
        this.S1 = new a0.h();
        this.f28648p0 = 75;
        this.M1 = chat;
        this.N1 = chatFull;
        this.V1 = hVar;
        this.W1 = hashSet;
        this.f32530k1.setOnItemClickListener(new k(this, 9));
        h20 h20Var = new h20(this, context);
        this.K1 = h20Var;
        this.l1 = h20Var;
        bi.q1 q1Var = this.f32530k1;
        e20 e20Var = new e20(this, context);
        this.f32531m1 = e20Var;
        q1Var.setAdapter(e20Var);
        if (!this.T1) {
            this.Q1 = false;
            S0();
        }
        T0();
        M0(0.0f);
    }

    @Override
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        org.telegram.ui.e40 e40Var = this.X1.f46814a;
        if (!e40Var.f45242n2) {
            if (motionEvent.getX() > iVar.getLeft() && motionEvent.getX() < iVar.getRight() && motionEvent.getY() > iVar.getTop() && motionEvent.getY() < iVar.getBottom()) {
                e40Var.v1(e40Var.f45280v3, null, iVar, true);
            } else {
                e40Var.v1(e40Var.f45280v3, null, iVar, false);
            }
        }
    }

    @Override
    public final void L0(String str) {
        h20 h20Var = this.K1;
        jg.z1 z1Var = h20Var.d;
        i20 i20Var = h20Var.f34160x;
        f20 f20Var = h20Var.f34154e;
        if (f20Var != null) {
            org.telegram.messenger.g0.r(f20Var);
            h20Var.f34154e = null;
        }
        z1Var.f(null, null);
        TLRPC.Chat chat = i20Var.M1;
        bi.q1 q1Var = i20Var.f32530k1;
        z1Var.g(null, true, false, true, false, chat.f26956id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            i20Var.f32534q1.e(true, true);
            q1Var.W1 = false;
            q1Var.X1 = 0;
            h20Var.f();
            q1Var.W1 = true;
            q1Var.X1 = 0;
            h20Var.h = true;
            int i7 = h20Var.f34156n + 1;
            h20Var.f34156n = i7;
            f20 f20Var2 = new f20(h20Var, str, i7, 0);
            h20Var.f34154e = f20Var2;
            org.telegram.messenger.g0.i3(f20Var2, 300L);
            v4.g0 adapter = q1Var.getAdapter();
            pj0 pj0Var = i20Var.l1;
            if (adapter != pj0Var) {
                q1Var.setAdapter(pj0Var);
                return;
            }
            return;
        }
        h20Var.f34156n = -1;
    }

    @Override
    public final void P0() {
        this.f32543z1 = org.telegram.ui.ActionBar.l6.Dh;
        this.A1 = org.telegram.ui.ActionBar.l6.Sg;
        int i7 = org.telegram.ui.ActionBar.l6.f27801a;
        this.B1 = org.telegram.ui.ActionBar.l6.Tg;
        this.C1 = org.telegram.ui.ActionBar.l6.f27948hh;
        this.D1 = org.telegram.ui.ActionBar.l6.f27838bh;
        this.E1 = org.telegram.ui.ActionBar.l6.f27858ch;
        this.F1 = org.telegram.ui.ActionBar.l6.Zg;
        this.G1 = org.telegram.ui.ActionBar.l6.f27911fh;
        this.H1 = org.telegram.ui.ActionBar.l6.f27819ah;
    }

    public final void R0() {
        if (!this.Y1) {
            return;
        }
        ArrayList arrayList = org.telegram.messenger.g5.r(this.f28621a).f22608e0;
        ArrayList arrayList2 = this.P1;
        arrayList2.addAll(arrayList);
        long j3 = org.telegram.messenger.p10.i(this.f28621a).f24489n;
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
        Collections.sort(arrayList2, new jg.d(org.telegram.messenger.qp.s1(this.f28621a), ConnectionsManager.getInstance(this.f28621a).getCurrentTime(), 2));
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
                long j3 = org.telegram.messenger.p10.i(this.f28621a).f24489n;
                int size = chatFull.participants.participants.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i7);
                    long j10 = chatParticipant.user_id;
                    if (j10 != j3 && ((hVar = this.V1) == null || hVar.h(j10) < 0)) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(this.f28621a).a2(Long.valueOf(chatParticipant.user_id));
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
            pj0 pj0Var = this.f32531m1;
            if (pj0Var != null) {
                pj0Var.f();
                return;
            }
            return;
        }
        this.T1 = true;
        cv0 cv0Var = this.f32534q1;
        if (cv0Var != null) {
            cv0Var.e(true, false);
        }
        pj0 pj0Var2 = this.f32531m1;
        if (pj0Var2 != null) {
            pj0Var2.f();
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
        ConnectionsManager.getInstance(this.f28621a).sendRequest(tL_channels_getParticipants, new org.telegram.ui.ld(16, this, tL_channels_getParticipants));
    }

    public final void T0() {
        this.Z1 = -1;
        this.f34534b2 = -1;
        this.f34535c2 = -1;
        this.d2 = -1;
        this.f34536e2 = -1;
        this.f34537f2 = -1;
        this.f34538g2 = -1;
        this.f34533a2 = -1;
        boolean z9 = true;
        this.f34540i2 = 1;
        TLRPC.Chat chat = this.M1;
        if (org.telegram.messenger.t3.t0(chat) || org.telegram.messenger.t3.y(3, chat)) {
            int i7 = this.f34540i2;
            this.f34540i2 = i7 + 1;
            this.Z1 = i7;
        }
        if (!this.T1 || this.U1) {
            ArrayList arrayList = this.P1;
            if (!arrayList.isEmpty()) {
                int i10 = this.f34540i2;
                int i11 = i10 + 1;
                this.f34540i2 = i11;
                this.d2 = i10;
                this.f34536e2 = i11;
                int size = arrayList.size() + i11;
                this.f34540i2 = size;
                this.f34537f2 = size;
            } else {
                z9 = false;
            }
            ArrayList arrayList2 = this.O1;
            if (!arrayList2.isEmpty()) {
                if (z9) {
                    int i12 = this.f34540i2;
                    this.f34540i2 = i12 + 1;
                    this.f34538g2 = i12;
                }
                int i13 = this.f34540i2;
                this.f34534b2 = i13;
                int size2 = arrayList2.size() + i13;
                this.f34540i2 = size2;
                this.f34535c2 = size2;
            }
        }
        if (this.T1) {
            int i14 = this.f34540i2;
            this.f34540i2 = i14 + 1;
            this.f34539h2 = i14;
        }
        int i15 = this.f34540i2;
        this.f34540i2 = i15 + 1;
        this.f34533a2 = i15;
    }
}
