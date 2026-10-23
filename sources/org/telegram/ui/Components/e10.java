package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class e10 extends lm0 {
    public final k10 f25806c;

    public e10(k10 k10Var) {
        this.f25806c = k10Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f == 2) {
            int b10 = b1Var.b();
            k10 k10Var = this.f25806c;
            if (b10 >= k10Var.f27819r0 && b1Var.b() <= k10Var.f27820s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f25806c.f27816o0;
    }

    @Override
    public final int j(int i10) {
        k10 k10Var = this.f25806c;
        k10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != k10Var.f27817p0 && i10 != k10Var.f27821t0 && i10 != k10Var.f27825x0) {
            if (i10 != k10Var.f27818q0 && i10 != k10Var.f27822u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e10.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        j10 j10Var;
        j10 j10Var2;
        boolean z10;
        k10 k10Var = this.f25806c;
        if (i10 == 0) {
            Context context = k10Var.getContext();
            if (!(k10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && k10Var.f27803a0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            j10Var = new j10(k10Var, context, z10, k10Var.f27808f0, k10Var.f27806d0, k10Var.f27807e0);
            k10Var.f27815n0 = j10Var;
        } else {
            j10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(k10Var.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, e9Var, null);
                j10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? f4Var = new org.telegram.ui.Cells.f4(k10Var.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, f4Var, null);
                j10Var = f4Var;
            } else if (i10 == 3) {
                ?? h10Var = new h10(k10Var.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, h10Var, null);
                j10Var2 = h10Var;
            }
            j10Var = j10Var2;
        }
        return new s4.b1(j10Var);
    }
}
