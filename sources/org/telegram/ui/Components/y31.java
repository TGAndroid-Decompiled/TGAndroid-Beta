package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class y31 extends az {
    public final h41 Y;

    public y31(h41 h41Var, int i9, x31 x31Var) {
        super(5, i9, x31Var);
        this.Y = h41Var;
    }

    @Override
    public final boolean D1() {
        h41 h41Var = this.Y;
        if (h41Var.f28972n.getAdapter() == h41Var.v) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override
    public final int o0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        int i10;
        View m10;
        h41 h41Var = this.Y;
        if (h41Var.J) {
            return super.o0(i9, g1Var, n1Var);
        }
        int i11 = 0;
        if (h41Var.H != null) {
            return 0;
        }
        if (h41Var.I) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                x31 x31Var = h41Var.f28972n;
                View q10 = q(i11);
                x31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = h41Var.f28973r.m(i10)) != null && m10.getTop() - i9 > AndroidUtilities.dp(58.0f)) {
                i9 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i9, g1Var, n1Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
