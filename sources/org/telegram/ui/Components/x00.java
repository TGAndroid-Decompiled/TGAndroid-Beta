package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class x00 extends ll0 {
    public final d10 f29849c;

    public x00(d10 d10Var) {
        this.f29849c = d10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f == 2) {
            int b10 = c1Var.b();
            d10 d10Var = this.f29849c;
            if (b10 >= d10Var.f23195r0 && c1Var.b() <= d10Var.f23196s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f29849c.f23192o0;
    }

    @Override
    public final int j(int i10) {
        d10 d10Var = this.f29849c;
        d10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != d10Var.f23193p0 && i10 != d10Var.f23197t0 && i10 != d10Var.f23201x0) {
            if (i10 != d10Var.f23194q0 && i10 != d10Var.f23198u0) {
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
        d10 d10Var = this.f29849c;
        if (i10 == 0) {
            boolean z10 = false;
            c10Var = new c10(d10Var, d10Var.getContext(), ((d10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || d10Var.f23179a0 != null) ? true : true, d10Var.f23184f0, d10Var.f23182d0, d10Var.f23183e0);
            d10Var.f23191n0 = c10Var;
        } else {
            c10Var = null;
            if (i10 == 1) {
                ?? f9Var = new org.telegram.ui.Cells.f9(d10Var.getContext());
                f9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
                c10Var2 = f9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(d10Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                c10Var = g4Var;
            } else if (i10 == 3) {
                ?? a10Var = new a10(d10Var.getContext());
                a10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                c10Var2 = a10Var;
            }
            c10Var = c10Var2;
        }
        return new s4.c1(c10Var);
    }
}
