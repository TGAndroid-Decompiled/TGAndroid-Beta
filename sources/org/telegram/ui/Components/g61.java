package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class g61 extends xz {
    public final p61 Y;

    public g61(p61 p61Var, int i10, f61 f61Var) {
        super(5, i10, f61Var);
        this.Y = p61Var;
    }

    @Override
    public final boolean E1() {
        p61 p61Var = this.Y;
        if (p61Var.f31453n.getAdapter() == p61Var.v) {
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
        p61 p61Var = this.Y;
        if (p61Var.N) {
            return super.o0(i10, eVar, b1Var);
        }
        int i12 = 0;
        if (p61Var.L != null) {
            return 0;
        }
        if (p61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                f61 f61Var = p61Var.f31453n;
                View q5 = q(i12);
                f61Var.getClass();
                int R = RecyclerView.R(q5);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = p61Var.f31454r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
