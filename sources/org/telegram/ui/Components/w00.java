package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class w00 extends kl0 {
    public final c10 f29507c;

    public w00(c10 c10Var) {
        this.f29507c = c10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42678f == 2) {
            int b10 = c1Var.b();
            c10 c10Var = this.f29507c;
            if (b10 >= c10Var.f22923r0 && c1Var.b() <= c10Var.f22924s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f29507c.f22920o0;
    }

    @Override
    public final int j(int i10) {
        c10 c10Var = this.f29507c;
        c10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != c10Var.f22921p0 && i10 != c10Var.f22925t0 && i10 != c10Var.f22929x0) {
            if (i10 != c10Var.f22922q0 && i10 != c10Var.f22926u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w00.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        b10 b10Var;
        b10 b10Var2;
        c10 c10Var = this.f29507c;
        if (i10 == 0) {
            boolean z10 = false;
            b10Var = new b10(c10Var, c10Var.getContext(), ((c10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || c10Var.f22907a0 != null) ? true : true, c10Var.f22912f0, c10Var.f22910d0, c10Var.f22911e0);
            c10Var.f22919n0 = b10Var;
        } else {
            b10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(c10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false));
                b10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? f4Var = new org.telegram.ui.Cells.f4(c10Var.getContext(), 1, 0, false);
                f4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
                b10Var = f4Var;
            } else if (i10 == 3) {
                ?? z00Var = new z00(c10Var.getContext());
                z00Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
                b10Var2 = z00Var;
            }
            b10Var = b10Var2;
        }
        return new s4.c1(b10Var);
    }
}
