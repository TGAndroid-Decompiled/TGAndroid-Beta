package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class u41 extends qz {
    public final d51 Y;

    public u41(d51 d51Var, int i10, t41 t41Var) {
        super(5, i10, t41Var);
        this.Y = d51Var;
    }

    @Override
    public final boolean D1() {
        d51 d51Var = this.Y;
        if (d51Var.f26191n.getAdapter() == d51Var.v) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override
    public final int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        int i11;
        View m9;
        d51 d51Var = this.Y;
        if (d51Var.K) {
            return super.o0(i10, fVar, j1Var);
        }
        int i12 = 0;
        if (d51Var.I != null) {
            return 0;
        }
        if (d51Var.J) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                t41 t41Var = d51Var.f26191n;
                View q10 = q(i12);
                t41Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m9 = d51Var.f26192r.m(i11)) != null && m9.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m9.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, fVar, j1Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
