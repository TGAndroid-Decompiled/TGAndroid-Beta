package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class x00 extends ql0 {
    public final d10 f30397c;

    public x00(d10 d10Var) {
        this.f30397c = d10Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 2) {
            int b10 = l1Var.b();
            d10 d10Var = this.f30397c;
            if (b10 >= d10Var.f24093o0 && l1Var.b() <= d10Var.f24094p0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f30397c.f24091l0;
    }

    @Override
    public final int j(int i10) {
        d10 d10Var = this.f30397c;
        d10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != d10Var.m0 && i10 != d10Var.f24095q0 && i10 != d10Var.f24099u0) {
            if (i10 != d10Var.f24092n0 && i10 != d10Var.f24096r0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x00.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        c10 c10Var;
        c10 c10Var2;
        d10 d10Var = this.f30397c;
        if (i10 == 0) {
            boolean z4 = false;
            c10Var = new c10(d10Var, d10Var.getContext(), ((d10Var.W instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || d10Var.X != null) ? true : true, d10Var.f24082c0, d10Var.f24080a0, d10Var.f24081b0);
            d10Var.f24090k0 = c10Var;
        } else {
            c10Var = null;
            if (i10 == 1) {
                ?? z8Var = new org.telegram.ui.Cells.z8(d10Var.getContext());
                z8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
                c10Var2 = z8Var;
            } else if (i10 == 2) {
                ?? f4Var = new org.telegram.ui.Cells.f4(d10Var.getContext(), 1, 0, false);
                f4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                c10Var = f4Var;
            } else if (i10 == 3) {
                ?? a10Var = new a10(d10Var.getContext());
                a10Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                c10Var2 = a10Var;
            }
            c10Var = c10Var2;
        }
        return new f2.l1(c10Var);
    }
}
