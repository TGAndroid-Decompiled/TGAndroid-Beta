package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class d61 extends f00 {
    public final m61 Y;

    public d61(m61 m61Var, int i10, c61 c61Var) {
        super(5, i10, c61Var);
        this.Y = m61Var;
    }

    @Override
    public final boolean D1() {
        m61 m61Var = this.Y;
        if (m61Var.f28761n.getAdapter() == m61Var.v) {
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
        m61 m61Var = this.Y;
        if (m61Var.N) {
            return super.o0(i10, eVar, a1Var);
        }
        int i12 = 0;
        if (m61Var.L != null) {
            return 0;
        }
        if (m61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                c61 c61Var = m61Var.f28761n;
                View q6 = q(i12);
                c61Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = m61Var.f28762r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
