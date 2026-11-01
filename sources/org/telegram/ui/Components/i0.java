package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i0 extends ha {
    public q51 P1;
    public TLRPC.TL_channelAdminLogEventsFilter Q1;
    public ArrayList R1;
    public a0.h S1;
    public final boolean T1;
    public final org.telegram.ui.l10 U1;
    public boolean V1;
    public boolean W1;
    public boolean X1;
    public org.telegram.ui.va Y1;
    public int Z1;

    public i0(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(k2Var.getContext(), k2Var, false, true, 2, k2Var.getResourceProvider());
        this.Q1 = new TLRPC.TL_channelAdminLogEventsFilter();
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.f26730r1 = 0.35f;
        O();
        int i10 = org.telegram.ui.ActionBar.t6.f21020i5;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, this.I0);
        this.Z1 = w02;
        v0(w02);
        Y0();
        this.f26733u1 = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Q1;
            tL_channelAdminLogEventsFilter2.join = tL_channelAdminLogEventsFilter.join;
            tL_channelAdminLogEventsFilter2.leave = tL_channelAdminLogEventsFilter.leave;
            tL_channelAdminLogEventsFilter2.edit_rank = tL_channelAdminLogEventsFilter.edit_rank;
            tL_channelAdminLogEventsFilter2.invite = tL_channelAdminLogEventsFilter.invite;
            tL_channelAdminLogEventsFilter2.ban = tL_channelAdminLogEventsFilter.ban;
            tL_channelAdminLogEventsFilter2.unban = tL_channelAdminLogEventsFilter.unban;
            tL_channelAdminLogEventsFilter2.kick = tL_channelAdminLogEventsFilter.kick;
            tL_channelAdminLogEventsFilter2.unkick = tL_channelAdminLogEventsFilter.unkick;
            tL_channelAdminLogEventsFilter2.promote = tL_channelAdminLogEventsFilter.promote;
            tL_channelAdminLogEventsFilter2.demote = tL_channelAdminLogEventsFilter.demote;
            tL_channelAdminLogEventsFilter2.info = tL_channelAdminLogEventsFilter.info;
            tL_channelAdminLogEventsFilter2.settings = tL_channelAdminLogEventsFilter.settings;
            tL_channelAdminLogEventsFilter2.pinned = tL_channelAdminLogEventsFilter.pinned;
            tL_channelAdminLogEventsFilter2.edit = tL_channelAdminLogEventsFilter.edit;
            tL_channelAdminLogEventsFilter2.delete = tL_channelAdminLogEventsFilter.delete;
            tL_channelAdminLogEventsFilter2.group_call = tL_channelAdminLogEventsFilter.group_call;
            tL_channelAdminLogEventsFilter2.invites = tL_channelAdminLogEventsFilter.invites;
        } else {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Q1;
            tL_channelAdminLogEventsFilter3.join = true;
            tL_channelAdminLogEventsFilter3.leave = true;
            tL_channelAdminLogEventsFilter3.edit_rank = true;
            tL_channelAdminLogEventsFilter3.invite = true;
            tL_channelAdminLogEventsFilter3.ban = true;
            tL_channelAdminLogEventsFilter3.unban = true;
            tL_channelAdminLogEventsFilter3.kick = true;
            tL_channelAdminLogEventsFilter3.unkick = true;
            tL_channelAdminLogEventsFilter3.promote = true;
            tL_channelAdminLogEventsFilter3.demote = true;
            tL_channelAdminLogEventsFilter3.info = true;
            tL_channelAdminLogEventsFilter3.settings = true;
            tL_channelAdminLogEventsFilter3.pinned = true;
            tL_channelAdminLogEventsFilter3.edit = true;
            tL_channelAdminLogEventsFilter3.delete = true;
            tL_channelAdminLogEventsFilter3.group_call = true;
            tL_channelAdminLogEventsFilter3.invites = true;
        }
        if (hVar != null) {
            this.S1 = hVar.clone();
        }
        this.T1 = z10;
        this.P1.O(false);
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.f26724k1.setItemAnimator(jVar);
        this.f26724k1.setOnItemClickListener(new t(this, 1));
        org.telegram.ui.l10 l10Var = new org.telegram.ui.l10(getContext(), this.I0, (uk0) null);
        this.U1 = l10Var;
        l10Var.setClickable(true);
        l10Var.setOrientation(1);
        l10Var.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
        org.telegram.ui.ActionBar.a7.i(i10, l10Var, this.I0);
        vh.d dVar = new vh.d(getContext(), this.I0, true);
        dVar.f();
        dVar.i(org.telegram.messenger.dd.L0(2131751004, null), false, true);
        dVar.setOnClickListener(new h0(this, 0));
        l10Var.addView(dVar, w7.b6.r(-1, 48, 87));
        ViewGroup viewGroup = this.f21587b;
        int i11 = this.f21616t0;
        viewGroup.addView(l10Var, w7.b6.f(-2.0f, -1, 87, i11, 0, i11, 0));
        uk0 uk0Var = this.f26724k1;
        int i12 = this.f21616t0;
        uk0Var.setPadding(i12, 0, i12, org.telegram.messenger.i0.L(68.0f));
        this.f26724k1.r1();
    }

    @Override
    public final boolean H() {
        return !this.f26724k1.canScrollVertically(-1);
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(uk0Var, getContext(), this.f21584a, 0, true, new d(this, 3), this.I0);
        this.P1 = q51Var;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.dd.L0(2131751080, null);
    }

    public final String d1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                StringBuilder sb2 = new StringBuilder();
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.Q1;
                sb2.append((tL_channelAdminLogEventsFilter.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter.pinned ? 1 : 0));
                sb2.append("/3");
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Q1;
            if (tL_channelAdminLogEventsFilter2.info || tL_channelAdminLogEventsFilter2.settings) {
                i14 = 1;
            }
            sb3.append(i14 + (tL_channelAdminLogEventsFilter2.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter2.group_call ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Q1;
        if (!tL_channelAdminLogEventsFilter3.promote && !tL_channelAdminLogEventsFilter3.demote) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        boolean z10 = this.T1;
        if (z10 && (tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban)) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i15 = i11 + i12;
        if (tL_channelAdminLogEventsFilter3.invite || tL_channelAdminLogEventsFilter3.join) {
            i14 = 1;
        }
        sb4.append(i15 + i14 + (tL_channelAdminLogEventsFilter3.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter3.edit_rank ? 1 : 0));
        sb4.append("/");
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        sb4.append(i13);
        return sb4.toString();
    }

    public final void e1(ArrayList arrayList) {
        this.R1 = arrayList;
        if (arrayList != null && this.S1 == null) {
            this.S1 = new a0.h();
            ArrayList arrayList2 = this.R1;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                long o10 = org.telegram.messenger.o5.o(((TLRPC.ChannelParticipant) obj).peer);
                this.S1.k(org.telegram.messenger.wp.r1(this.f21584a).Z1(Long.valueOf(o10)), o10);
            }
        }
        q51 q51Var = this.P1;
        if (q51Var != null) {
            q51Var.O(true);
        }
    }

    @Override
    public final void q0(float f7) {
        super.q0(f7);
        this.U1.setTranslationY(-f7);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21020i5, this.I0);
            if (w02 != this.Z1) {
                this.Z1 = w02;
                v0(w02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
