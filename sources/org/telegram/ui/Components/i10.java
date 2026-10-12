package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class i10 extends lm0 {
    public final o10 f25793c;

    public i10(o10 o10Var) {
        this.f25793c = o10Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 2) {
            int b10 = b1Var.b();
            o10 o10Var = this.f25793c;
            if (b10 >= o10Var.f27784r0 && b1Var.b() <= o10Var.f27785s0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f25793c.f27781o0;
    }

    @Override
    public final int j(int i10) {
        o10 o10Var = this.f25793c;
        o10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != o10Var.f27782p0 && i10 != o10Var.f27786t0 && i10 != o10Var.f27790x0) {
            if (i10 != o10Var.f27783q0 && i10 != o10Var.f27787u0) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i10.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        n10 n10Var;
        n10 n10Var2;
        o10 o10Var = this.f25793c;
        if (i10 == 0) {
            boolean z10 = false;
            Context context = o10Var.getContext();
            if ((o10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || o10Var.f27768a0 != null) {
                z10 = true;
            }
            n10Var = new n10(o10Var, context, z10, o10Var.f27773f0, o10Var.f27771d0, o10Var.f27772e0);
            o10Var.f27780n0 = n10Var;
        } else {
            n10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(o10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
                n10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(1, 0, o10Var.getContext(), false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                n10Var = g4Var;
            } else if (i10 == 3) {
                ?? l10Var = new l10(o10Var.getContext());
                l10Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                n10Var2 = l10Var;
            }
            n10Var = n10Var2;
        }
        return new s4.b1(n10Var);
    }
}
