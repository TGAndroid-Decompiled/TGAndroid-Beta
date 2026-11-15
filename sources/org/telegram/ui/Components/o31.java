package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class o31 extends py {
    public final x31 Y;

    public o31(x31 x31Var, int i7, n31 n31Var) {
        super(5, i7, n31Var);
        this.Y = x31Var;
    }

    @Override
    public final boolean D1() {
        x31 x31Var = this.Y;
        if (x31Var.f41549n.getAdapter() == x31Var.f41552w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.hd.f24101a0;
    }

    @Override
    public final int o0(int i7, v4.w0 w0Var, v4.b1 b1Var) {
        int i10;
        View m10;
        x31 x31Var = this.Y;
        if (x31Var.O) {
            return super.o0(i7, w0Var, b1Var);
        }
        int i11 = 0;
        if (x31Var.M != null) {
            return 0;
        }
        if (x31Var.N) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                n31 n31Var = x31Var.f41549n;
                View q10 = q(i11);
                n31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = x31Var.f41550r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
                i7 = m10.getTop() - org.telegram.messenger.g0.L(58.0f);
            }
        }
        return super.o0(i7, w0Var, b1Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
