package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class k31 extends ly {
    public final u31 Y;

    public k31(u31 u31Var, int i7, j31 j31Var) {
        super(5, i7, j31Var);
        this.Y = u31Var;
    }

    @Override
    public final boolean D1() {
        u31 u31Var = this.Y;
        if (u31Var.f38583n.getAdapter() == u31Var.f38586w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.id.f23157a0;
    }

    @Override
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int i10;
        View m10;
        u31 u31Var = this.Y;
        if (u31Var.N) {
            return super.o0(i7, v0Var, a1Var);
        }
        int i11 = 0;
        if (u31Var.L != null) {
            return 0;
        }
        if (u31Var.M) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                j31 j31Var = u31Var.f38583n;
                View q10 = q(i11);
                j31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = u31Var.f38584r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
                i7 = m10.getTop() - org.telegram.messenger.g0.L(58.0f);
            }
        }
        return super.o0(i7, v0Var, a1Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
