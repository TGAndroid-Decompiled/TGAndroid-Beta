package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class h61 extends xz {
    public final q61 Y;

    public h61(q61 q61Var, int i10, g61 g61Var) {
        super(5, i10, g61Var);
        this.Y = q61Var;
    }

    @Override
    public final boolean E1() {
        q61 q61Var = this.Y;
        if (q61Var.f31807n.getAdapter() == q61Var.v) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override
    public final int o0(int i10, rf.e eVar, s4.b1 b1Var) {
        int i11;
        View m10;
        q61 q61Var = this.Y;
        if (q61Var.N) {
            return super.o0(i10, eVar, b1Var);
        }
        int i12 = 0;
        if (q61Var.L != null) {
            return 0;
        }
        if (q61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                g61 g61Var = q61Var.f31807n;
                View q5 = q(i12);
                g61Var.getClass();
                int R = RecyclerView.R(q5);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = q61Var.f31808r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, eVar, b1Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
