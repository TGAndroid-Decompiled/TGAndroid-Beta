package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class d10 extends ul0 {
    public final k10 f22272c;

    public d10(k10 k10Var) {
        this.f22272c = k10Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 2) {
            int b10 = c1Var.b();
            k10 k10Var = this.f22272c;
            if (b10 >= k10Var.f24552r0 && c1Var.b() <= k10Var.f24553s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f22272c.f24549o0;
    }

    @Override
    public final int j(int i10) {
        k10 k10Var = this.f22272c;
        k10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != k10Var.f24550p0 && i10 != k10Var.f24554t0 && i10 != k10Var.f24558x0) {
            if (i10 != k10Var.f24551q0 && i10 != k10Var.f24555u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d10.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        j10 j10Var;
        j10 j10Var2;
        k10 k10Var = this.f22272c;
        if (i10 == 0) {
            boolean z10 = false;
            j10Var = new j10(k10Var, k10Var.getContext(), ((k10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || k10Var.f24536a0 != null) ? true : true, k10Var.f24541f0, k10Var.f24539d0, k10Var.f24540e0);
            k10Var.f24548n0 = j10Var;
        } else {
            j10Var = null;
            if (i10 == 1) {
                ?? f9Var = new org.telegram.ui.Cells.f9(k10Var.getContext());
                f9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
                j10Var2 = f9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(k10Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                j10Var = g4Var;
            } else if (i10 == 3) {
                ?? h10Var = new h10(k10Var.getContext());
                h10Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                j10Var2 = h10Var;
            }
            j10Var = j10Var2;
        }
        return new s4.c1(j10Var);
    }
}
