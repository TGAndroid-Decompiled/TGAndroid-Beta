package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class g10 extends mm0 {
    public final n10 f28353c;

    public g10(n10 n10Var) {
        this.f28353c = n10Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 2) {
            int b10 = e1Var.b();
            n10 n10Var = this.f28353c;
            if (b10 >= n10Var.f30714r0 && e1Var.b() <= n10Var.f30715s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f28353c.f30711o0;
    }

    @Override
    public final int j(int i10) {
        n10 n10Var = this.f28353c;
        n10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != n10Var.f30712p0 && i10 != n10Var.f30716t0 && i10 != n10Var.f30720x0) {
            if (i10 != n10Var.f30713q0 && i10 != n10Var.f30717u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g10.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        m10 m10Var;
        m10 m10Var2;
        boolean z10;
        n10 n10Var = this.f28353c;
        if (i10 == 0) {
            Context context = n10Var.getContext();
            if (!(n10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && n10Var.f30698a0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            m10Var = new m10(n10Var, context, z10, n10Var.f30703f0, n10Var.f30701d0, n10Var.f30702e0);
            n10Var.f30710n0 = m10Var;
        } else {
            m10Var = null;
            if (i10 == 1) {
                ?? i9Var = new org.telegram.ui.Cells.i9(n10Var.getContext());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23300a7, i9Var, null);
                m10Var2 = i9Var;
            } else if (i10 == 2) {
                ?? k4Var = new org.telegram.ui.Cells.k4(n10Var.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, k4Var, null);
                m10Var = k4Var;
            } else if (i10 == 3) {
                ?? k10Var = new k10(n10Var.getContext());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, k10Var, null);
                m10Var2 = k10Var;
            }
            m10Var = m10Var2;
        }
        return new s4.e1(m10Var);
    }
}
