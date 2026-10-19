package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class t51 extends xz {
    public final c61 Y;

    public t51(c61 c61Var, int i10, s51 s51Var) {
        super(5, i10, s51Var);
        this.Y = c61Var;
    }

    @Override
    public final boolean D1() {
        c61 c61Var = this.Y;
        if (c61Var.f25094n.getAdapter() == c61Var.v) {
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
        c61 c61Var = this.Y;
        if (c61Var.N) {
            return super.o0(i10, eVar, y0Var);
        }
        int i12 = 0;
        if (c61Var.L != null) {
            return 0;
        }
        if (c61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                s51 s51Var = c61Var.f25094n;
                View q6 = q(i12);
                s51Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = c61Var.f25095r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
