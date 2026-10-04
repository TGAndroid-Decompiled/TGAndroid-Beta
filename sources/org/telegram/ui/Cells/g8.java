package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class g8 implements View.OnClickListener {
    public final int f22173a;
    public final m8 f22174b;

    public g8(m8 m8Var, int i10) {
        this.f22173a = i10;
        this.f22174b = m8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22173a) {
            case 0:
                this.f22174b.getClass();
                return;
            default:
                m8 m8Var = this.f22174b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.f22486y;
                rg.q0 q0Var = m8Var.F;
                if (q0Var.getVisibility() == 0 && q0Var.f46259r.isEnabled()) {
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
