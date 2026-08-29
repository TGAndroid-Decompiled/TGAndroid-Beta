package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class j41 extends jz {
    public final s41 Y;

    public j41(s41 s41Var, int i10, i41 i41Var) {
        super(5, i10, i41Var);
        this.Y = s41Var;
    }

    @Override
    public final boolean D1() {
        s41 s41Var = this.Y;
        if (s41Var.f32485n.getAdapter() == s41Var.v) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override
    public final int o0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        int i11;
        View m10;
        s41 s41Var = this.Y;
        if (s41Var.J) {
            return super.o0(i10, d1Var, k1Var);
        }
        int i12 = 0;
        if (s41Var.H != null) {
            return 0;
        }
        if (s41Var.I) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                i41 i41Var = s41Var.f32485n;
                View q6 = q(i12);
                i41Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = s41Var.f32486r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, d1Var, k1Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
