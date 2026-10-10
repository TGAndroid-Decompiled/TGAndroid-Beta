package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class n10 extends qm0 {
    public final t10 f28947c;

    public n10(t10 t10Var) {
        this.f28947c = t10Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47706f == 2) {
            int b10 = d1Var.b();
            t10 t10Var = this.f28947c;
            if (b10 >= t10Var.f30931r0 && d1Var.b() <= t10Var.f30932s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f28947c.f30928o0;
    }

    @Override
    public final int j(int i10) {
        t10 t10Var = this.f28947c;
        t10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != t10Var.f30929p0 && i10 != t10Var.f30933t0 && i10 != t10Var.f30937x0) {
            if (i10 != t10Var.f30930q0 && i10 != t10Var.f30934u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n10.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        s10 s10Var;
        s10 s10Var2;
        t10 t10Var = this.f28947c;
        if (i10 == 0) {
            boolean z10 = false;
            Context context = t10Var.getContext();
            if ((t10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || t10Var.f30915a0 != null) {
                z10 = true;
            }
            s10Var = new s10(t10Var, context, z10, t10Var.f30920f0, t10Var.f30918d0, t10Var.f30919e0);
            t10Var.f30927n0 = s10Var;
        } else {
            s10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(t10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20745a7, false));
                s10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(1, 0, t10Var.getContext(), false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                s10Var = g4Var;
            } else if (i10 == 3) {
                ?? q10Var = new q10(t10Var.getContext());
                q10Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                s10Var2 = q10Var;
            }
            s10Var = s10Var2;
        }
        return new s4.d1(s10Var);
    }
}
