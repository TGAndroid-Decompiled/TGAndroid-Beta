package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class c61 extends e00 {
    public final l61 Y;

    public c61(l61 l61Var, int i10, b61 b61Var) {
        super(5, i10, b61Var);
        this.Y = l61Var;
    }

    @Override
    public final boolean D1() {
        l61 l61Var = this.Y;
        if (l61Var.f28308n.getAdapter() == l61Var.v) {
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
        l61 l61Var = this.Y;
        if (l61Var.N) {
            return super.o0(i10, eVar, a1Var);
        }
        int i12 = 0;
        if (l61Var.L != null) {
            return 0;
        }
        if (l61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                b61 b61Var = l61Var.f28308n;
                View q6 = q(i12);
                b61Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = l61Var.f28309r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
