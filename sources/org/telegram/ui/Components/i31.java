package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class i31 extends ky {
    public final s31 Y;

    public i31(s31 s31Var, int i7, h31 h31Var) {
        super(5, i7, h31Var);
        this.Y = s31Var;
    }

    @Override
    public final boolean D1() {
        s31 s31Var = this.Y;
        if (s31Var.f37872n.getAdapter() == s31Var.f37875w) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.hd.f22871a0;
    }

    @Override
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int i10;
        View m10;
        s31 s31Var = this.Y;
        if (s31Var.N) {
            return super.o0(i7, v0Var, a1Var);
        }
        int i11 = 0;
        if (s31Var.L != null) {
            return 0;
        }
        if (s31Var.M) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                h31 h31Var = s31Var.f37872n;
                View q10 = q(i11);
                h31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = s31Var.f37873r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
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
