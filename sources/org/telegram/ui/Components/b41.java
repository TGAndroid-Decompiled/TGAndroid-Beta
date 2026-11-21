package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class b41 extends xy {
    public final k41 Y;

    public b41(k41 k41Var, int i7, a41 a41Var) {
        super(5, i7, a41Var);
        this.Y = k41Var;
    }

    @Override
    public final boolean D1() {
        k41 k41Var = this.Y;
        if (k41Var.f36770n.getAdapter() == k41Var.f36773w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.gd.f24241a0;
    }

    @Override
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int i10;
        View m10;
        k41 k41Var = this.Y;
        if (k41Var.O) {
            return super.o0(i7, x0Var, c1Var);
        }
        int i11 = 0;
        if (k41Var.M != null) {
            return 0;
        }
        if (k41Var.N) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                a41 a41Var = k41Var.f36770n;
                View q10 = q(i11);
                a41Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = k41Var.f36771r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
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
