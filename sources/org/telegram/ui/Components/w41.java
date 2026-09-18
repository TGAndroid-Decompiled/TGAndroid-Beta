package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class w41 extends oz {
    public final f51 Y;

    public w41(f51 f51Var, int i10, v41 v41Var) {
        super(5, i10, v41Var);
        this.Y = f51Var;
    }

    @Override
    public final boolean D1() {
        f51 f51Var = this.Y;
        if (f51Var.f23785n.getAdapter() == f51Var.v) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        f51 f51Var = this.Y;
        if (f51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (f51Var.L != null) {
            return 0;
        }
        if (f51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                v41 v41Var = f51Var.f23785n;
                View q6 = q(i12);
                v41Var.getClass();
                int S = RecyclerView.S(q6);
                if (S < 1) {
                    i11 = S;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = f51Var.f23786r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, eVar, z0Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
