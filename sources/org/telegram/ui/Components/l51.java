package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class l51 extends oz {
    public final u51 Y;

    public l51(u51 u51Var, int i10, k51 k51Var) {
        super(5, i10, k51Var);
        this.Y = u51Var;
    }

    @Override
    public final boolean D1() {
        u51 u51Var = this.Y;
        if (u51Var.f28671n.getAdapter() == u51Var.v) {
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
        u51 u51Var = this.Y;
        if (u51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (u51Var.L != null) {
            return 0;
        }
        if (u51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                k51 k51Var = u51Var.f28671n;
                View q6 = q(i12);
                k51Var.getClass();
                int S = RecyclerView.S(q6);
                if (S < 1) {
                    i11 = S;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = u51Var.f28672r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
