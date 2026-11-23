package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p0 extends sa {
    public c51 T1;
    public TLRPC.TL_channelAdminLogEventsFilter U1;
    public ArrayList V1;
    public a0.h W1;
    public final boolean X1;
    public final ah.a Y1;
    public boolean Z1;
    public boolean f38385a2;
    public boolean f38386b2;
    public org.telegram.ui.ra f38387c2;
    public int d2;

    public p0(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, a0.h hVar, boolean z10) {
        super(g2Var.getContext(), g2Var, false, true, 2, g2Var.getResourceProvider());
        this.U1 = new TLRPC.TL_channelAdminLogEventsFilter();
        this.Z1 = false;
        this.f38385a2 = false;
        this.f38386b2 = false;
        this.f39494v1 = 0.35f;
        O();
        int i7 = org.telegram.ui.ActionBar.m6.f29438i5;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, this.J0);
        this.d2 = w02;
        v0(w02);
        Z0();
        this.f39497y1 = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U1;
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
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U1;
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
            this.W1 = hVar.clone();
        }
        this.X1 = z10;
        this.T1.O(false);
        v4.k kVar = new v4.k();
        kVar.f59139m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.f39487o1.setItemAnimator(kVar);
        this.f39487o1.setOnItemClickListener(new c0(this, 1));
        ah.a aVar = new ah.a(getContext(), this.J0, (ek0) null);
        this.Y1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.t6.h(i7, aVar, this.J0);
        hi.d dVar = new hi.d(getContext(), this.J0, true);
        dVar.f();
        dVar.i(org.telegram.messenger.hd.N0(2131750991, null), false, true);
        dVar.setOnClickListener(new o0(this, 0));
        aVar.addView(dVar, c8.na.r(-1, 48, 87));
        ViewGroup viewGroup = this.f30142b;
        int i10 = this.f30177u0;
        viewGroup.addView(aVar, c8.na.f(-2.0f, -1, 87, i10, 0, i10, 0));
        ek0 ek0Var = this.f39487o1;
        int i11 = this.f30177u0;
        ek0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(68.0f));
        this.f39487o1.r1();
    }

    @Override
    public final boolean G() {
        return !this.f39487o1.canScrollVertically(-1);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30139a, 0, true, new d(this, 3), this.J0);
        this.T1 = c51Var;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.hd.N0(2131751067, null);
    }

    public final String e1(int i7) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (i7 != 0) {
            if (i7 != 1) {
                StringBuilder sb2 = new StringBuilder();
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.U1;
                sb2.append((tL_channelAdminLogEventsFilter.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter.pinned ? 1 : 0));
                sb2.append("/3");
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.U1;
            if (tL_channelAdminLogEventsFilter2.info || tL_channelAdminLogEventsFilter2.settings) {
                i13 = 1;
            }
            sb3.append(i13 + (tL_channelAdminLogEventsFilter2.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter2.group_call ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.U1;
        if (!tL_channelAdminLogEventsFilter3.promote && !tL_channelAdminLogEventsFilter3.demote) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        boolean z10 = this.X1;
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

    public final void f1(ArrayList arrayList) {
        this.V1 = arrayList;
        if (arrayList != null && this.W1 == null) {
            this.W1 = new a0.h();
            ArrayList arrayList2 = this.V1;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                long o4 = org.telegram.messenger.n5.o(((TLRPC.ChannelParticipant) obj).peer);
                this.W1.k(org.telegram.messenger.np.u1(this.f30139a).c2(Long.valueOf(o4)), o4);
            }
        }
        c51 c51Var = this.T1;
        if (c51Var != null) {
            c51Var.O(true);
        }
    }

    @Override
    public final void q0(float f10) {
        super.q0(f10);
        this.Y1.setTranslationY(-f10);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29438i5, this.J0);
            if (w02 != this.d2) {
                this.d2 = w02;
                v0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
