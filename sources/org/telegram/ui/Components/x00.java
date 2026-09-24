package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class x00 extends vl0 {
    public final d10 f30211c;

    public x00(d10 d10Var) {
        this.f30211c = d10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42949f == 2) {
            int b10 = c1Var.b();
            d10 d10Var = this.f30211c;
            if (b10 >= d10Var.f23438r0 && c1Var.b() <= d10Var.f23439s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f30211c.f23435o0;
    }

    @Override
    public final int j(int i10) {
        d10 d10Var = this.f30211c;
        d10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != d10Var.f23436p0 && i10 != d10Var.f23440t0 && i10 != d10Var.f23444x0) {
            if (i10 != d10Var.f23437q0 && i10 != d10Var.f23441u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x00.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        c10 c10Var;
        c10 c10Var2;
        d10 d10Var = this.f30211c;
        if (i10 == 0) {
            boolean z10 = false;
            c10Var = new c10(d10Var, d10Var.getContext(), ((d10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || d10Var.f23422a0 != null) ? true : true, d10Var.f23427f0, d10Var.f23425d0, d10Var.f23426e0);
            d10Var.f23434n0 = c10Var;
        } else {
            c10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(d10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18989a7, false));
                c10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(d10Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                c10Var = g4Var;
            } else if (i10 == 3) {
                ?? a10Var = new a10(d10Var.getContext());
                a10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                c10Var2 = a10Var;
            }
            c10Var = c10Var2;
        }
        return new s4.c1(c10Var);
    }
}
