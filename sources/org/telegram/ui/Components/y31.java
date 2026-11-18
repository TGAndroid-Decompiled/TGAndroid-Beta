package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class y31 extends vy {
    public final h41 Y;

    public y31(h41 h41Var, int i7, x31 x31Var) {
        super(5, i7, x31Var);
        this.Y = h41Var;
    }

    @Override
    public final boolean D1() {
        h41 h41Var = this.Y;
        if (h41Var.f35719n.getAdapter() == h41Var.f35722w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.gd.f24213a0;
    }

    @Override
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int i10;
        View m10;
        h41 h41Var = this.Y;
        if (h41Var.O) {
            return super.o0(i7, x0Var, c1Var);
        }
        int i11 = 0;
        if (h41Var.M != null) {
            return 0;
        }
        if (h41Var.N) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                x31 x31Var = h41Var.f35719n;
                View q10 = q(i11);
                x31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = h41Var.f35720r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
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
