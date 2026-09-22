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
        if (e51Var.f23543n.getAdapter() == e51Var.v) {
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
        e51 e51Var = this.Y;
        if (e51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (e51Var.L != null) {
            return 0;
        }
        if (e51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                u41 u41Var = e51Var.f23543n;
                View q6 = q(i12);
                u41Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = e51Var.f23544r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
