package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class c00 extends sk0 {
    public final j00 f24925c;

    public c00(j00 j00Var) {
        this.f24925c = j00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 2) {
            int b10 = c1Var.b();
            j00 j00Var = this.f24925c;
            if (b10 >= j00Var.f27172j2 && c1Var.b() <= j00Var.f27173k2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f24925c.f27169g2;
    }

    @Override
    public final int d(int i10) {
        j00 j00Var = this.f24925c;
        j00Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 != j00Var.f27170h2 && i10 != j00Var.f27174l2 && i10 != j00Var.f27178p2) {
            if (i10 != j00Var.f27171i2 && i10 != j00Var.f27175m2) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c00.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        i00 i00Var;
        i00 i00Var2;
        boolean z10;
        j00 j00Var = this.f24925c;
        if (i10 == 0) {
            Context context = j00Var.getContext();
            if (!(j00Var.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && j00Var.S1 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            i00Var = new i00(j00Var, context, z10, j00Var.X1, j00Var.V1, j00Var.W1);
            j00Var.f27168f2 = i00Var;
        } else {
            i00Var = null;
            if (i10 == 1) {
                ?? b9Var = new org.telegram.ui.Cells.b9(j00Var.getContext());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, b9Var, null);
                i00Var2 = b9Var;
            } else if (i10 == 2) {
                ?? j4Var = new org.telegram.ui.Cells.j4(j00Var.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, j4Var, null);
                i00Var = j4Var;
            } else if (i10 == 3) {
                ?? g00Var = new g00(j00Var.getContext());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, g00Var, null);
                i00Var2 = g00Var;
            }
            i00Var = i00Var2;
        }
        return new s4.c1(i00Var);
    }
}
