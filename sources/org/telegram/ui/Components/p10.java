package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class p10 extends vm0 {
    public final v10 f29349c;

    public p10(v10 v10Var) {
        this.f29349c = v10Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47893f == 2) {
            int b10 = d1Var.b();
            v10 v10Var = this.f29349c;
            if (b10 >= v10Var.f31340r0 && d1Var.b() <= v10Var.f31341s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f29349c.f31337o0;
    }

    @Override
    public final int j(int i10) {
        v10 v10Var = this.f29349c;
        v10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != v10Var.f31338p0 && i10 != v10Var.f31342t0 && i10 != v10Var.f31346x0) {
            if (i10 != v10Var.f31339q0 && i10 != v10Var.f31343u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p10.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        u10 u10Var;
        u10 u10Var2;
        v10 v10Var = this.f29349c;
        if (i10 == 0) {
            boolean z10 = false;
            Context context = v10Var.getContext();
            if ((v10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || v10Var.f31324a0 != null) {
                z10 = true;
            }
            u10Var = new u10(v10Var, context, z10, v10Var.f31329f0, v10Var.f31327d0, v10Var.f31328e0);
            v10Var.f31336n0 = u10Var;
        } else {
            u10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(v10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20503a7, false));
                u10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(1, 0, v10Var.getContext(), false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                u10Var = g4Var;
            } else if (i10 == 3) {
                ?? s10Var = new s10(v10Var.getContext());
                s10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                u10Var2 = s10Var;
            }
            u10Var = u10Var2;
        }
        return new s4.d1(u10Var);
    }
}
