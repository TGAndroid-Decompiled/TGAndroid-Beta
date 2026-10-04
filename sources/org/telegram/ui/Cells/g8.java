package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class g8 implements View.OnClickListener {
    public final int f22168a;
    public final m8 f22169b;

    public g8(m8 m8Var, int i10) {
        this.f22168a = i10;
        this.f22169b = m8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22168a) {
            case 0:
                this.f22169b.getClass();
                return;
            default:
                m8 m8Var = this.f22169b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.f22481y;
                rg.q0 q0Var = m8Var.F;
                if (q0Var.getVisibility() == 0 && q0Var.f46251r.isEnabled()) {
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
