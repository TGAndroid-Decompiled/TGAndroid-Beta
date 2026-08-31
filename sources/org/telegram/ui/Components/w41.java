package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class w41 extends qz {
    public final f51 Y;

    public w41(f51 f51Var, int i10, v41 v41Var) {
        super(5, i10, v41Var);
        this.Y = f51Var;
    }

    @Override
    public final boolean D1() {
        f51 f51Var = this.Y;
        if (f51Var.f26762n.getAdapter() == f51Var.v) {
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
        f51 f51Var = this.Y;
        if (f51Var.K) {
            return super.o0(i10, fVar, j1Var);
        }
        int i12 = 0;
        if (f51Var.I != null) {
            return 0;
        }
        if (f51Var.J) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                v41 v41Var = f51Var.f26762n;
                View q10 = q(i12);
                v41Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m9 = f51Var.f26763r.m(i11)) != null && m9.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
