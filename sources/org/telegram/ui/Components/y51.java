package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class y51 extends a00 {
    public final h61 Y;

    public y51(h61 h61Var, int i10, x51 x51Var) {
        super(5, i10, x51Var);
        this.Y = h61Var;
    }

    @Override
    public final boolean D1() {
        h61 h61Var = this.Y;
        if (h61Var.f25522n.getAdapter() == h61Var.v) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int i11;
        View m10;
        h61 h61Var = this.Y;
        if (h61Var.N) {
            return super.o0(i10, eVar, y0Var);
        }
        int i12 = 0;
        if (h61Var.L != null) {
            return 0;
        }
        if (h61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                x51 x51Var = h61Var.f25522n;
                View q6 = q(i12);
                x51Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = h61Var.f25523r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, eVar, y0Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
