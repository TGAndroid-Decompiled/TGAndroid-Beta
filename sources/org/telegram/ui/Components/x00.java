package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class x00 extends sl0 {
    public final d10 f32878c;

    public x00(d10 d10Var) {
        this.f32878c = d10Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 2) {
            int b10 = m1Var.b();
            d10 d10Var = this.f32878c;
            if (b10 >= d10Var.f26147o0 && m1Var.b() <= d10Var.f26148p0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f32878c.f26145l0;
    }

    @Override
    public final int j(int i10) {
        d10 d10Var = this.f32878c;
        d10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != d10Var.m0 && i10 != d10Var.f26149q0 && i10 != d10Var.f26153u0) {
            if (i10 != d10Var.f26146n0 && i10 != d10Var.f26150r0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(f2.m1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x00.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        c10 c10Var;
        c10 c10Var2;
        d10 d10Var = this.f32878c;
        if (i10 == 0) {
            boolean z4 = false;
            c10Var = new c10(d10Var, d10Var.getContext(), ((d10Var.W instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || d10Var.X != null) ? true : true, d10Var.f26136c0, d10Var.f26134a0, d10Var.f26135b0);
            d10Var.f26144k0 = c10Var;
        } else {
            c10Var = null;
            if (i10 == 1) {
                ?? a9Var = new org.telegram.ui.Cells.a9(d10Var.getContext());
                a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
                c10Var2 = a9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(d10Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                c10Var = g4Var;
            } else if (i10 == 3) {
                ?? a10Var = new a10(d10Var.getContext());
                a10Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                c10Var2 = a10Var;
            }
            c10Var = c10Var2;
        }
        return new f2.m1(c10Var);
    }
}
