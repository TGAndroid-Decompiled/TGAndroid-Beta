package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class e61 extends f00 {
    public final n61 Y;

    public e61(n61 n61Var, int i10, d61 d61Var) {
        super(5, i10, d61Var);
        this.Y = n61Var;
    }

    @Override
    public final boolean D1() {
        n61 n61Var = this.Y;
        if (n61Var.f28981n.getAdapter() == n61Var.v) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override
    public final int o0(int i10, pf.e eVar, s4.a1 a1Var) {
        int i11;
        View m10;
        n61 n61Var = this.Y;
        if (n61Var.N) {
            return super.o0(i10, eVar, a1Var);
        }
        int i12 = 0;
        if (n61Var.L != null) {
            return 0;
        }
        if (n61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                d61 d61Var = n61Var.f28981n;
                View q6 = q(i12);
                d61Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = n61Var.f28982r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, eVar, a1Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
