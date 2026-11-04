package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g0 extends ma {
    public f41 Q1;
    public TLRPC.TL_channelAdminLogEventsFilter R1;
    public ArrayList S1;
    public a0.h T1;
    public final boolean U1;
    public final bh.a V1;
    public boolean W1;
    public boolean X1;
    public boolean Y1;
    public org.telegram.ui.qa Z1;
    public int f33901a2;

    public g0(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(d2Var.getContext(), d2Var, false, true, 2, d2Var.getResourceProvider());
        this.R1 = new TLRPC.TL_channelAdminLogEventsFilter();
        this.W1 = false;
        this.X1 = false;
        this.Y1 = false;
        this.f36108s1 = 0.35f;
        N();
        int i3 = org.telegram.ui.ActionBar.k6.f27971i5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, this.J0);
        this.f33901a2 = w02;
        v0(w02);
        Y0();
        this.f36111v1 = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.R1;
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
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.R1;
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
            this.T1 = hVar.clone();
        }
        this.U1 = z10;
        this.Q1.O(false);
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36102l1.setItemAnimator(kVar);
        this.f36102l1.setOnItemClickListener(new t(this, 1));
        bh.a aVar = new bh.a(getContext(), this.J0, (tj0) null);
        this.V1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.r6.i(i3, aVar, this.J0);
        gi.d dVar = new gi.d(getContext(), this.J0, true);
        dVar.f();
        dVar.i(org.telegram.messenger.bd.M0(2131751004, null), false, true);
        dVar.setOnClickListener(new f0(this, 0));
        aVar.addView(dVar, b8.mf.r(-1, 48, 87));
        ViewGroup viewGroup = this.f28586b;
        int i10 = this.f28618u0;
        viewGroup.addView(aVar, b8.mf.f(-2.0f, -1, 87, i10, 0, i10, 0));
        tj0 tj0Var = this.f36102l1;
        int i11 = this.f28618u0;
        tj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(68.0f));
        this.f36102l1.r1();
    }

    @Override
    public final boolean G() {
        return !this.f36102l1.canScrollVertically(-1);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, 0, true, new e(this, 3), this.J0);
        this.Q1 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131751080, null);
    }

    public final String d1(int i3) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (i3 != 0) {
            if (i3 != 1) {
                StringBuilder sb2 = new StringBuilder();
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.R1;
                sb2.append((tL_channelAdminLogEventsFilter.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter.pinned ? 1 : 0));
                sb2.append("/3");
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.R1;
            if (tL_channelAdminLogEventsFilter2.info || tL_channelAdminLogEventsFilter2.settings) {
                i13 = 1;
            }
            sb3.append(i13 + (tL_channelAdminLogEventsFilter2.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter2.group_call ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.R1;
        if (!tL_channelAdminLogEventsFilter3.promote && !tL_channelAdminLogEventsFilter3.demote) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        boolean z10 = this.U1;
        if (z10 && (tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban)) {
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
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        sb4.append(i12);
        return sb4.toString();
    }

    public final void e1(ArrayList arrayList) {
        this.S1 = arrayList;
        if (arrayList != null && this.T1 == null) {
            this.T1 = new a0.h();
            ArrayList arrayList2 = this.S1;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                long o10 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) obj).peer);
                this.T1.k(org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(o10)), o10);
            }
        }
        f41 f41Var = this.Q1;
        if (f41Var != null) {
            f41Var.O(true);
        }
    }

    @Override
    public final void q0(float f10) {
        super.q0(f10);
        this.V1.setTranslationY(-f10);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27971i5, this.J0);
            if (w02 != this.f33901a2) {
                this.f33901a2 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
