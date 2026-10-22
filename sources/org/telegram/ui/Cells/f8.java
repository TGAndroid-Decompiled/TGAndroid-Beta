package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class f8 implements View.OnClickListener {
    public final int f22262a;
    public final l8 f22263b;

    public f8(l8 l8Var, int i10) {
        this.f22262a = i10;
        this.f22263b = l8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22262a) {
            case 0:
                this.f22263b.getClass();
                return;
            default:
                l8 l8Var = this.f22263b;
                TextView textView = l8Var.E;
                TextView textView2 = l8Var.f22551y;
                sg.q0 q0Var = l8Var.F;
                if (q0Var.getVisibility() == 0 && q0Var.f46391r.isEnabled()) {
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
