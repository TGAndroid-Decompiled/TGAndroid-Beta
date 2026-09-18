package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class k51 extends oz {
    public final t51 Y;

    public k51(t51 t51Var, int i10, j51 j51Var) {
        super(5, i10, j51Var);
        this.Y = t51Var;
    }

    @Override
    public final boolean D1() {
        t51 t51Var = this.Y;
        if (t51Var.f28327n.getAdapter() == t51Var.v) {
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
        t51 t51Var = this.Y;
        if (t51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (t51Var.L != null) {
            return 0;
        }
        if (t51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                j51 j51Var = t51Var.f28327n;
                View q6 = q(i12);
                j51Var.getClass();
                int S = RecyclerView.S(q6);
                if (S < 1) {
                    i11 = S;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = t51Var.f28328r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
