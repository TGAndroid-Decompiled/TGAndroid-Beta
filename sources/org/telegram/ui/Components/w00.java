package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class w00 extends kl0 {
    public final c10 f32051c;

    public w00(c10 c10Var) {
        this.f32051c = c10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45743f == 2) {
            int b10 = c1Var.b();
            c10 c10Var = this.f32051c;
            if (b10 >= c10Var.f24858r0 && c1Var.b() <= c10Var.f24859s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f32051c.f24855o0;
    }

    @Override
    public final int j(int i10) {
        c10 c10Var = this.f32051c;
        c10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != c10Var.f24856p0 && i10 != c10Var.f24860t0 && i10 != c10Var.f24864x0) {
            if (i10 != c10Var.f24857q0 && i10 != c10Var.f24861u0) {
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
        c10 c10Var = this.f32051c;
        if (i10 == 0) {
            boolean z10 = false;
            b10Var = new b10(c10Var, c10Var.getContext(), ((c10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || c10Var.f24842a0 != null) ? true : true, c10Var.f24847f0, c10Var.f24845d0, c10Var.f24846e0);
            c10Var.f24854n0 = b10Var;
        } else {
            b10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(c10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20608a7, false));
                b10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? f4Var = new org.telegram.ui.Cells.f4(c10Var.getContext(), 1, 0, false);
                f4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
                b10Var = f4Var;
            } else if (i10 == 3) {
                ?? z00Var = new z00(c10Var.getContext());
                z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
                b10Var2 = z00Var;
            }
            b10Var = b10Var2;
        }
        return new s4.c1(b10Var);
    }
}
