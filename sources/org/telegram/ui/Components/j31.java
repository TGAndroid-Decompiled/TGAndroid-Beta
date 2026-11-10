package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class j31 extends ky {
    public final t31 Y;

    public j31(t31 t31Var, int i7, i31 i31Var) {
        super(5, i7, i31Var);
        this.Y = t31Var;
    }

    @Override
    public final boolean D1() {
        t31 t31Var = this.Y;
        if (t31Var.f38155n.getAdapter() == t31Var.f38158w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.id.f23161a0;
    }

    @Override
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int i10;
        View m10;
        t31 t31Var = this.Y;
        if (t31Var.N) {
            return super.o0(i7, v0Var, a1Var);
        }
        int i11 = 0;
        if (t31Var.L != null) {
            return 0;
        }
        if (t31Var.M) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                i31 i31Var = t31Var.f38155n;
                View q10 = q(i11);
                i31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = t31Var.f38156r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
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
