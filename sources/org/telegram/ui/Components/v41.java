package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class v41 extends oz {
    public final e51 Y;

    public v41(e51 e51Var, int i10, u41 u41Var) {
        super(5, i10, u41Var);
        this.Y = e51Var;
    }

    @Override
    public final boolean D1() {
        e51 e51Var = this.Y;
        if (e51Var.f24483n.getAdapter() == e51Var.v) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override
    public final int o0(int i10, af.h hVar, f2.i1 i1Var) {
        int i11;
        View m9;
        e51 e51Var = this.Y;
        if (e51Var.K) {
            return super.o0(i10, hVar, i1Var);
        }
        int i12 = 0;
        if (e51Var.I != null) {
            return 0;
        }
        if (e51Var.J) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                u41 u41Var = e51Var.f24483n;
                View q10 = q(i12);
                u41Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m9 = e51Var.f24484r.m(i11)) != null && m9.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m9.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, hVar, i1Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
