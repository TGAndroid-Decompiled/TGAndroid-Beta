package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class n41 extends zy {
    public final x41 Y;

    public n41(x41 x41Var, int i10, m41 m41Var) {
        super(5, i10, m41Var);
        this.Y = x41Var;
    }

    @Override
    public final boolean D1() {
        x41 x41Var = this.Y;
        if (x41Var.f32415n.getAdapter() == x41Var.f32418w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.dd.X;
    }

    @Override
    public final int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        x41 x41Var = this.Y;
        if (x41Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (x41Var.L != null) {
            return 0;
        }
        if (x41Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                m41 m41Var = x41Var.f32415n;
                View q6 = q(i12);
                m41Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = x41Var.f32416r.m(i11)) != null && m10.getTop() - i10 > org.telegram.messenger.i0.L(58.0f)) {
                i10 = m10.getTop() - org.telegram.messenger.i0.L(58.0f);
            }
        }
        return super.o0(i10, eVar, z0Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
