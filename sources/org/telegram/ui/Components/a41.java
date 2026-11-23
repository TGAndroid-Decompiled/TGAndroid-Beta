package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class a41 extends uy {
    public final j41 Y;

    public a41(j41 j41Var, int i7, z31 z31Var) {
        super(5, i7, z31Var);
        this.Y = j41Var;
    }

    @Override
    public final boolean D1() {
        j41 j41Var = this.Y;
        if (j41Var.f36265n.getAdapter() == j41Var.f36268w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.gd.f24314a0;
    }

    @Override
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int i10;
        View m10;
        j41 j41Var = this.Y;
        if (j41Var.O) {
            return super.o0(i7, x0Var, c1Var);
        }
        int i11 = 0;
        if (j41Var.M != null) {
            return 0;
        }
        if (j41Var.N) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                z31 z31Var = j41Var.f36265n;
                View q10 = q(i11);
                z31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = j41Var.f36266r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
                i7 = m10.getTop() - org.telegram.messenger.g0.L(58.0f);
            }
        }
        return super.o0(i7, x0Var, c1Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
