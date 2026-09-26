package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class y00 extends wl0 {
    public final e10 f30522c;

    public y00(e10 e10Var) {
        this.f30522c = e10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f == 2) {
            int b10 = c1Var.b();
            e10 e10Var = this.f30522c;
            if (b10 >= e10Var.f23822r0 && c1Var.b() <= e10Var.f23823s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f30522c.f23819o0;
    }

    @Override
    public final int j(int i10) {
        e10 e10Var = this.f30522c;
        e10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != e10Var.f23820p0 && i10 != e10Var.f23824t0 && i10 != e10Var.f23828x0) {
            if (i10 != e10Var.f23821q0 && i10 != e10Var.f23825u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y00.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d10 d10Var;
        d10 d10Var2;
        e10 e10Var = this.f30522c;
        if (i10 == 0) {
            boolean z10 = false;
            d10Var = new d10(e10Var, e10Var.getContext(), ((e10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || e10Var.f23806a0 != null) ? true : true, e10Var.f23811f0, e10Var.f23809d0, e10Var.f23810e0);
            e10Var.f23818n0 = d10Var;
        } else {
            d10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(e10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19003a7, false));
                d10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(e10Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
                d10Var = g4Var;
            } else if (i10 == 3) {
                ?? b10Var = new b10(e10Var.getContext());
                b10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
                d10Var2 = b10Var;
            }
            d10Var = d10Var2;
        }
        return new s4.c1(d10Var);
    }
}
