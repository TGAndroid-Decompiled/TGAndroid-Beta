package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class m41 extends zy {
    public final w41 Y;

    public m41(w41 w41Var, int i10, l41 l41Var) {
        super(5, i10, l41Var);
        this.Y = w41Var;
    }

    @Override
    public final boolean D1() {
        w41 w41Var = this.Y;
        if (w41Var.f31999n.getAdapter() == w41Var.f32002w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.cd.X;
    }

    @Override
    public final int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        w41 w41Var = this.Y;
        if (w41Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (w41Var.L != null) {
            return 0;
        }
        if (w41Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                l41 l41Var = w41Var.f31999n;
                View q6 = q(i12);
                l41Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = w41Var.f32000r.m(i11)) != null && m10.getTop() - i10 > org.telegram.messenger.i0.L(58.0f)) {
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
