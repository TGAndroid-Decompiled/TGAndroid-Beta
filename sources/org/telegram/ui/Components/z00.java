package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class z00 extends yl0 {
    public final f10 f33331c;

    public z00(f10 f10Var) {
        this.f33331c = f10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46535f == 2) {
            int b10 = c1Var.b();
            f10 f10Var = this.f33331c;
            if (b10 >= f10Var.f26225r0 && c1Var.b() <= f10Var.f26226s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f33331c.f26222o0;
    }

    @Override
    public final int j(int i10) {
        f10 f10Var = this.f33331c;
        f10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != f10Var.f26223p0 && i10 != f10Var.f26227t0 && i10 != f10Var.f26231x0) {
            if (i10 != f10Var.f26224q0 && i10 != f10Var.f26228u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z00.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        e10 e10Var;
        e10 e10Var2;
        f10 f10Var = this.f33331c;
        if (i10 == 0) {
            boolean z10 = false;
            e10Var = new e10(f10Var, f10Var.getContext(), ((f10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || f10Var.f26209a0 != null) ? true : true, f10Var.f26214f0, f10Var.f26212d0, f10Var.f26213e0);
            f10Var.f26221n0 = e10Var;
        } else {
            e10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(f10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false));
                e10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(f10Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
                e10Var = g4Var;
            } else if (i10 == 3) {
                ?? c10Var = new c10(f10Var.getContext());
                c10Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
                e10Var2 = c10Var;
            }
            e10Var = e10Var2;
        }
        return new s4.c1(e10Var);
    }
}
