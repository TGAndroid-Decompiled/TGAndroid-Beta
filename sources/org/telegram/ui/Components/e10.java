package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class e10 extends im0 {
    public final k10 f25693c;

    public e10(k10 k10Var) {
        this.f25693c = k10Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45920f == 2) {
            int b10 = b1Var.b();
            k10 k10Var = this.f25693c;
            if (b10 >= k10Var.f27711r0 && b1Var.b() <= k10Var.f27712s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f25693c.f27708o0;
    }

    @Override
    public final int j(int i10) {
        k10 k10Var = this.f25693c;
        k10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != k10Var.f27709p0 && i10 != k10Var.f27713t0 && i10 != k10Var.f27717x0) {
            if (i10 != k10Var.f27710q0 && i10 != k10Var.f27714u0) {
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
        k10 k10Var = this.f25693c;
        if (i10 == 0) {
            boolean z10 = false;
            Context context = k10Var.getContext();
            if ((k10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || k10Var.f27695a0 != null) {
                z10 = true;
            }
            j10Var = new j10(k10Var, context, z10, k10Var.f27700f0, k10Var.f27698d0, k10Var.f27699e0);
            k10Var.f27707n0 = j10Var;
        } else {
            j10Var = null;
            if (i10 == 1) {
                ?? d9Var = new org.telegram.ui.Cells.d9(k10Var.getContext());
                d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
                j10Var2 = d9Var;
            } else if (i10 == 2) {
                ?? f4Var = new org.telegram.ui.Cells.f4(k10Var.getContext(), 1, 0, false);
                f4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                j10Var = f4Var;
            } else if (i10 == 3) {
                ?? h10Var = new h10(k10Var.getContext());
                h10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                j10Var2 = h10Var;
            }
            j10Var = j10Var2;
        }
        return new s4.b1(j10Var);
    }
}
