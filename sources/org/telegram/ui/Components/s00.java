package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class s00 extends il0 {
    public final y00 f32432c;

    public s00(y00 y00Var) {
        this.f32432c = y00Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 2) {
            int b10 = n1Var.b();
            y00 y00Var = this.f32432c;
            if (b10 >= y00Var.f34876n0 && n1Var.b() <= y00Var.f34877o0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f32432c.f34874k0;
    }

    @Override
    public final int j(int i10) {
        y00 y00Var = this.f32432c;
        y00Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != y00Var.f34875l0 && i10 != y00Var.f34878p0 && i10 != y00Var.f34882t0) {
            if (i10 != y00Var.m0 && i10 != y00Var.f34879q0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s00.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        x00 x00Var;
        x00 x00Var2;
        y00 y00Var = this.f32432c;
        if (i10 == 0) {
            boolean z10 = false;
            x00Var = new x00(y00Var, y00Var.getContext(), ((y00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || y00Var.W != null) ? true : true, y00Var.f34865b0, y00Var.Z, y00Var.f34864a0);
            y00Var.f34873j0 = x00Var;
        } else {
            x00Var = null;
            if (i10 == 1) {
                ?? y8Var = new org.telegram.ui.Cells.y8(y00Var.getContext());
                y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
                x00Var2 = y8Var;
            } else if (i10 == 2) {
                ?? e4Var = new org.telegram.ui.Cells.e4(y00Var.getContext(), 1, 0, false);
                e4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                x00Var = e4Var;
            } else if (i10 == 3) {
                ?? v00Var = new v00(y00Var.getContext());
                v00Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                x00Var2 = v00Var;
            }
            x00Var = x00Var2;
        }
        return new f2.n1(x00Var);
    }
}
