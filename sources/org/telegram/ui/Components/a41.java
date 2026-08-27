package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class a41 extends cz {
    public final j41 Y;

    public a41(j41 j41Var, int i10, z31 z31Var) {
        super(5, i10, z31Var);
        this.Y = j41Var;
    }

    @Override
    public final boolean D1() {
        j41 j41Var = this.Y;
        return j41Var.f29585n.getAdapter() == j41Var.v;
    }

    @Override
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override
    public final int o0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
        int i11;
        View viewM;
        j41 j41Var = this.Y;
        if (j41Var.J) {
            return super.o0(i10, e1Var, l1Var);
        }
        int i12 = 0;
        if (j41Var.H != null) {
            return 0;
        }
        if (j41Var.I) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                z31 z31Var = j41Var.f29585n;
                View viewQ = q(i12);
                z31Var.getClass();
                int iR = RecyclerView.R(viewQ);
                if (iR < 1) {
                    i11 = iR;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (viewM = j41Var.f29586r.m(i11)) != null && viewM.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = viewM.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, e1Var, l1Var);
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
