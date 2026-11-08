package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i0 extends na {
    public l41 P1;
    public TLRPC.TL_channelAdminLogEventsFilter Q1;
    public ArrayList R1;
    public a0.h S1;
    public final boolean T1;
    public final ah.a U1;
    public boolean V1;
    public boolean W1;
    public boolean X1;
    public org.telegram.ui.ra Y1;
    public int Z1;

    public i0(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z9) {
        super(f2Var.getContext(), f2Var, false, true, 2, f2Var.getResourceProvider());
        this.Q1 = new TLRPC.TL_channelAdminLogEventsFilter();
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.f36282r1 = 0.35f;
        N();
        int i7 = org.telegram.ui.ActionBar.k6.f27943i5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, this.I0);
        this.Z1 = w02;
        v0(w02);
        Y0();
        this.f36285u1 = true;
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
        this.T1 = z9;
        this.P1.O(false);
        v4.k kVar = new v4.k();
        kVar.f57071m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36277k1.setItemAnimator(kVar);
        this.f36277k1.setOnItemClickListener(new u(this, 1));
        ah.a aVar = new ah.a(getContext(), this.I0, (pj0) null);
        this.U1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.r6.i(i7, aVar, this.I0);
        fi.d dVar = new fi.d(getContext(), this.I0, true);
        dVar.f();
        dVar.i(org.telegram.messenger.id.M0(2131751004, null), false, true);
        dVar.setOnClickListener(new h0(this, 0));
        aVar.addView(dVar, c8.ha.r(-1, 48, 87));
        ViewGroup viewGroup = this.f28619b;
        int i10 = this.f28649t0;
        viewGroup.addView(aVar, c8.ha.f(-2.0f, -1, 87, i10, 0, i10, 0));
        pj0 pj0Var = this.f36277k1;
        int i11 = this.f28649t0;
        pj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(68.0f));
        this.f36277k1.r1();
    }

    @Override
    public final boolean G() {
        return !this.f36277k1.canScrollVertically(-1);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.f28616a, 0, true, new d(this, 3), this.I0);
        this.P1 = l41Var;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131751080, null);
    }

    public final String d1(int i7) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (i7 != 0) {
            if (i7 != 1) {
                StringBuilder sb2 = new StringBuilder();
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.Q1;
                sb2.append((tL_channelAdminLogEventsFilter.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter.pinned ? 1 : 0));
                sb2.append("/3");
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.Q1;
            if (tL_channelAdminLogEventsFilter2.info || tL_channelAdminLogEventsFilter2.settings) {
                i13 = 1;
            }
            sb3.append(i13 + (tL_channelAdminLogEventsFilter2.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter2.group_call ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.Q1;
        if (!tL_channelAdminLogEventsFilter3.promote && !tL_channelAdminLogEventsFilter3.demote) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        boolean z9 = this.T1;
        if (z9 && (tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban)) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i14 = i10 + i11;
        if (tL_channelAdminLogEventsFilter3.invite || tL_channelAdminLogEventsFilter3.join) {
            i13 = 1;
        }
        sb4.append(i14 + i13 + (tL_channelAdminLogEventsFilter3.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter3.edit_rank ? 1 : 0));
        sb4.append("/");
        if (z9) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        sb4.append(i12);
        return sb4.toString();
    }

    public final void e1(ArrayList arrayList) {
        this.R1 = arrayList;
        if (arrayList != null && this.S1 == null) {
            this.S1 = new a0.h();
            ArrayList arrayList2 = this.R1;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                long o4 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) obj).peer);
                this.S1.k(org.telegram.messenger.qp.s1(this.f28616a).a2(Long.valueOf(o4)), o4);
            }
        }
        l41 l41Var = this.P1;
        if (l41Var != null) {
            l41Var.O(true);
        }
    }

    @Override
    public final void q0(float f10) {
        super.q0(f10);
        this.U1.setTranslationY(-f10);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27943i5, this.I0);
            if (w02 != this.Z1) {
                this.Z1 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
