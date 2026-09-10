package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class i51 extends vz {
    public final r51 Y;

    public i51(r51 r51Var, int i10, h51 h51Var) {
        super(5, i10, h51Var);
        this.Y = r51Var;
    }

    @Override
    public final boolean D1() {
        r51 r51Var = this.Y;
        if (r51Var.f26593n.getAdapter() == r51Var.v) {
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
        r51 r51Var = this.Y;
        if (r51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (r51Var.L != null) {
            return 0;
        }
        if (r51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                h51 h51Var = r51Var.f26593n;
                View q6 = q(i12);
                h51Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = r51Var.f26594r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
