package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class c10 extends km0 {
    public final i10 f25152c;

    public c10(i10 i10Var) {
        this.f25152c = i10Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 2) {
            int b10 = b1Var.b();
            i10 i10Var = this.f25152c;
            if (b10 >= i10Var.f27238r0 && b1Var.b() <= i10Var.f27239s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f25152c.f27235o0;
    }

    @Override
    public final int j(int i10) {
        i10 i10Var = this.f25152c;
        i10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != i10Var.f27236p0 && i10 != i10Var.f27240t0 && i10 != i10Var.f27244x0) {
            if (i10 != i10Var.f27237q0 && i10 != i10Var.f27241u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c10.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        h10 h10Var;
        h10 h10Var2;
        boolean z10;
        i10 i10Var = this.f25152c;
        if (i10 == 0) {
            Context context = i10Var.getContext();
            if (!(i10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && i10Var.f27222a0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            h10Var = new h10(i10Var, context, z10, i10Var.f27227f0, i10Var.f27225d0, i10Var.f27226e0);
            i10Var.f27234n0 = h10Var;
        } else {
            h10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(i10Var.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, e9Var, null);
                h10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? f4Var = new org.telegram.ui.Cells.f4(i10Var.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, f4Var, null);
                h10Var = f4Var;
            } else if (i10 == 3) {
                ?? f10Var = new f10(i10Var.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, f10Var, null);
                h10Var2 = f10Var;
            }
            h10Var = h10Var2;
        }
        return new s4.b1(h10Var);
    }
}
