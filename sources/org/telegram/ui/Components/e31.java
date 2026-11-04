package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class e31 extends iy {
    public final n31 Y;

    public e31(n31 n31Var, int i3, d31 d31Var) {
        super(5, i3, d31Var);
        this.Y = n31Var;
    }

    @Override
    public final boolean D1() {
        n31 n31Var = this.Y;
        if (n31Var.f36359n.getAdapter() == n31Var.f36362w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.bd.f21784a0;
    }

    @Override
    public final int o0(int i3, tf.e eVar, u4.a1 a1Var) {
        int i10;
        View m10;
        n31 n31Var = this.Y;
        if (n31Var.O) {
            return super.o0(i3, eVar, a1Var);
        }
        int i11 = 0;
        if (n31Var.M != null) {
            return 0;
        }
        if (n31Var.N) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                d31 d31Var = n31Var.f36359n;
                View q10 = q(i11);
                d31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = n31Var.f36360r.m(i10)) != null && m10.getTop() - i3 > org.telegram.messenger.g0.L(58.0f)) {
                i3 = m10.getTop() - org.telegram.messenger.g0.L(58.0f);
            }
        }
        return super.o0(i3, eVar, a1Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
