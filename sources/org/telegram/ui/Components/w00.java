package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class w00 extends rl0 {
    public final c10 f30132c;

    public w00(c10 c10Var) {
        this.f30132c = c10Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 2) {
            int b10 = l1Var.b();
            c10 c10Var = this.f30132c;
            if (b10 >= c10Var.f23795o0 && l1Var.b() <= c10Var.f23796p0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f30132c.f23793l0;
    }

    @Override
    public final int j(int i10) {
        c10 c10Var = this.f30132c;
        c10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != c10Var.m0 && i10 != c10Var.f23797q0 && i10 != c10Var.f23801u0) {
            if (i10 != c10Var.f23794n0 && i10 != c10Var.f23798r0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w00.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        b10 b10Var;
        b10 b10Var2;
        c10 c10Var = this.f30132c;
        if (i10 == 0) {
            boolean z4 = false;
            b10Var = new b10(c10Var, c10Var.getContext(), ((c10Var.W instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || c10Var.X != null) ? true : true, c10Var.f23784c0, c10Var.f23782a0, c10Var.f23783b0);
            c10Var.f23792k0 = b10Var;
        } else {
            b10Var = null;
            if (i10 == 1) {
                ?? a9Var = new org.telegram.ui.Cells.a9(c10Var.getContext());
                a9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
                b10Var2 = a9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(c10Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                b10Var = g4Var;
            } else if (i10 == 3) {
                ?? z00Var = new z00(c10Var.getContext());
                z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                b10Var2 = z00Var;
            }
            b10Var = b10Var2;
        }
        return new f2.l1(b10Var);
    }
}
