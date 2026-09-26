package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class j51 extends qz {
    public final s51 Y;

    public j51(s51 s51Var, int i10, i51 i51Var) {
        super(5, i10, i51Var);
        this.Y = s51Var;
    }

    @Override
    public final boolean D1() {
        s51 s51Var = this.Y;
        if (s51Var.f28164n.getAdapter() == s51Var.v) {
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
        s51 s51Var = this.Y;
        if (s51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (s51Var.L != null) {
            return 0;
        }
        if (s51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                i51 i51Var = s51Var.f28164n;
                View q6 = q(i12);
                i51Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = s51Var.f28165r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
