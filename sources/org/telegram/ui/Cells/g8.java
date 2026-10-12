package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class g8 implements View.OnClickListener {
    public final int f21922a;
    public final m8 f21923b;

    public g8(m8 m8Var, int i10) {
        this.f21922a = i10;
        this.f21923b = m8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21922a) {
            case 0:
                this.f21923b.getClass();
                return;
            default:
                m8 m8Var = this.f21923b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.f22237y;
                rg.q0 q0Var = m8Var.F;
                if (q0Var.getVisibility() == 0 && q0Var.f47623r.isEnabled()) {
                    q0Var.performClick();
                    return;
                } else if (textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else {
                    return;
                }
        }
    }
}
