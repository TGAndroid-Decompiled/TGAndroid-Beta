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
public final class d20 extends v41 {
    public final c20 L1;
    public int M1;
    public final TLRPC.Chat N1;
    public final TLRPC.ChatFull O1;
    public final ArrayList P1;
    public final ArrayList Q1;
    public boolean R1;
    public final a0.h S1;
    public final a0.h T1;
    public boolean U1;
    public boolean V1;
    public final a0.h W1;
    public final HashSet X1;
    public org.telegram.ui.d10 Y1;
    public boolean Z1;
    public int f32908a2;
    public int f32909b2;
    public int c2;
    public int f32910d2;
    public int f32911e2;
    public int f32912f2;
    public int f32913g2;
    public int f32914h2;
    public int f32915i2;
    public int f32916j2;

    public d20(Context context, int i3, TLRPC.Chat chat, TLRPC.ChatFull chatFull, a0.h hVar, HashSet hashSet) {
        super(i3, context, null);
        this.P1 = new ArrayList();
        this.Q1 = new ArrayList();
        this.S1 = new a0.h();
        this.T1 = new a0.h();
        this.f28612q0 = 75;
        this.N1 = chat;
        this.O1 = chatFull;
        this.W1 = hVar;
        this.X1 = hashSet;
        this.f38994l1.setOnItemClickListener(new k(this, 9));
        c20 c20Var = new c20(this, context);
        this.L1 = c20Var;
        this.m1 = c20Var;
        ci.j1 j1Var = this.f38994l1;
        z10 z10Var = new z10(this, context);
        this.f38995n1 = z10Var;
        j1Var.setAdapter(z10Var);
        if (!this.U1) {
            this.R1 = false;
            S0();
        }
        T0();
        M0(0.0f);
    }

    @Override
    public final void J0(MotionEvent motionEvent, bh.g gVar) {
        org.telegram.ui.x30 x30Var = this.Y1.f44515a;
        if (!x30Var.f51773o2) {
            if (motionEvent.getX() > gVar.getLeft() && motionEvent.getX() < gVar.getRight() && motionEvent.getY() > gVar.getTop() && motionEvent.getY() < gVar.getBottom()) {
                x30Var.u1(x30Var.f51812w3, null, gVar, true);
            } else {
                x30Var.u1(x30Var.f51812w3, null, gVar, false);
            }
        }
    }

    @Override
    public final void L0(String str) {
        c20 c20Var = this.L1;
        kg.v1 v1Var = c20Var.d;
        d20 d20Var = c20Var.f32513x;
        a20 a20Var = c20Var.f32507e;
        if (a20Var != null) {
            org.telegram.messenger.g0.r(a20Var);
            c20Var.f32507e = null;
        }
        v1Var.f(null, null);
        TLRPC.Chat chat = d20Var.N1;
        ci.j1 j1Var = d20Var.f38994l1;
        v1Var.g(null, true, false, true, false, chat.f27001id, false, 2, -1);
        if (!TextUtils.isEmpty(str)) {
            d20Var.f38999r1.e(true, true);
            j1Var.X1 = false;
            j1Var.Y1 = 0;
            c20Var.f();
            j1Var.X1 = true;
            j1Var.Y1 = 0;
            c20Var.h = true;
            int i3 = c20Var.f32509n + 1;
            c20Var.f32509n = i3;
            a20 a20Var2 = new a20(c20Var, str, i3, 0);
            c20Var.f32507e = a20Var2;
            org.telegram.messenger.g0.i3(a20Var2, 300L);
            u4.h0 adapter = j1Var.getAdapter();
            sj0 sj0Var = d20Var.m1;
            if (adapter != sj0Var) {
                j1Var.setAdapter(sj0Var);
                return;
            }
            return;
        }
        c20Var.f32509n = -1;
    }

    @Override
    public final void P0() {
        this.A1 = org.telegram.ui.ActionBar.k6.Dh;
        this.B1 = org.telegram.ui.ActionBar.k6.Sg;
        int i3 = org.telegram.ui.ActionBar.k6.f27816a;
        this.C1 = org.telegram.ui.ActionBar.k6.Tg;
        this.D1 = org.telegram.ui.ActionBar.k6.f27964hh;
        this.E1 = org.telegram.ui.ActionBar.k6.f27853bh;
        this.F1 = org.telegram.ui.ActionBar.k6.f27870ch;
        this.G1 = org.telegram.ui.ActionBar.k6.Zg;
        this.H1 = org.telegram.ui.ActionBar.k6.f27928fh;
        this.I1 = org.telegram.ui.ActionBar.k6.f27833ah;
    }

    public final void R0() {
        if (!this.Z1) {
            return;
        }
        ArrayList arrayList = org.telegram.messenger.g5.r(this.f28583a).f22653f0;
        ArrayList arrayList2 = this.Q1;
        arrayList2.addAll(arrayList);
        long j10 = org.telegram.messenger.h10.i(this.f28583a).f22848n;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i3);
            if (tLObject instanceof TLRPC.TL_contact) {
                long j11 = ((TLRPC.TL_contact) tLObject).user_id;
                if (j11 == j10 || this.W1.h(j11) >= 0 || this.X1.contains(Long.valueOf(j11))) {
                    arrayList2.remove(i3);
                    i3--;
                    size--;
                }
            }
            i3++;
        }
        Collections.sort(arrayList2, new kg.d(org.telegram.messenger.hp.s1(this.f28583a), ConnectionsManager.getInstance(this.f28583a).getCurrentTime(), 2));
    }

    public final void S0() {
        a0.h hVar;
        TLRPC.Chat chat = this.N1;
        boolean T = org.telegram.messenger.t3.T(chat);
        TLRPC.ChatFull chatFull = this.O1;
        if (!T) {
            this.U1 = false;
            ArrayList arrayList = this.P1;
            arrayList.clear();
            this.Q1.clear();
            a0.h hVar2 = this.S1;
            hVar2.b();
            this.T1.b();
            if (chatFull != null) {
                long j10 = org.telegram.messenger.h10.i(this.f28583a).f22848n;
                int size = chatFull.participants.participants.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i3);
                    long j11 = chatParticipant.user_id;
                    if (j11 != j10 && ((hVar = this.W1) == null || hVar.h(j11) < 0)) {
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(chatParticipant.user_id));
                        if (!org.telegram.messenger.l10.x(a22) && !a22.bot) {
                            arrayList.add(chatParticipant);
                            hVar2.k(chatParticipant, chatParticipant.user_id);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.Z1 = true;
                    R0();
                }
            }
            T0();
            sj0 sj0Var = this.f38995n1;
            if (sj0Var != null) {
                sj0Var.f();
                return;
            }
            return;
        }
        this.U1 = true;
        zu0 zu0Var = this.f38999r1;
        if (zu0Var != null) {
            zu0Var.e(true, false);
        }
        sj0 sj0Var2 = this.f38995n1;
        if (sj0Var2 != null) {
            sj0Var2.f();
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = org.telegram.messenger.hp.i1(chat);
        if (chatFull != null && chatFull.participants_count <= 200) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        } else if (!this.R1) {
            this.M1 = 2;
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
            this.R1 = true;
            S0();
        } else {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        }
        tL_channels_getParticipants.filter.f27000q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_channels_getParticipants, new org.telegram.ui.ActionBar.h6(19, this, tL_channels_getParticipants));
    }

    public final void T0() {
        this.f32908a2 = -1;
        this.c2 = -1;
        this.f32910d2 = -1;
        this.f32911e2 = -1;
        this.f32912f2 = -1;
        this.f32913g2 = -1;
        this.f32914h2 = -1;
        this.f32909b2 = -1;
        boolean z10 = true;
        this.f32916j2 = 1;
        TLRPC.Chat chat = this.N1;
        if (org.telegram.messenger.t3.t0(chat) || org.telegram.messenger.t3.y(3, chat)) {
            int i3 = this.f32916j2;
            this.f32916j2 = i3 + 1;
            this.f32908a2 = i3;
        }
        if (!this.U1 || this.V1) {
            ArrayList arrayList = this.Q1;
            if (!arrayList.isEmpty()) {
                int i10 = this.f32916j2;
                int i11 = i10 + 1;
                this.f32916j2 = i11;
                this.f32911e2 = i10;
                this.f32912f2 = i11;
                int size = arrayList.size() + i11;
                this.f32916j2 = size;
                this.f32913g2 = size;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = this.P1;
            if (!arrayList2.isEmpty()) {
                if (z10) {
                    int i12 = this.f32916j2;
                    this.f32916j2 = i12 + 1;
                    this.f32914h2 = i12;
                }
                int i13 = this.f32916j2;
                this.c2 = i13;
                int size2 = arrayList2.size() + i13;
                this.f32916j2 = size2;
                this.f32910d2 = size2;
            }
        }
        if (this.U1) {
            int i14 = this.f32916j2;
            this.f32916j2 = i14 + 1;
            this.f32915i2 = i14;
        }
        int i15 = this.f32916j2;
        this.f32916j2 = i15 + 1;
        this.f32909b2 = i15;
    }
}
