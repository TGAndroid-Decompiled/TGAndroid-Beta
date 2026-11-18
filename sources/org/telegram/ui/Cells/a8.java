package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class a8 implements View.OnClickListener {
    public final int f30395a;
    public final g8 f30396b;

    public a8(g8 g8Var, int i7) {
        this.f30395a = i7;
        this.f30396b = g8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30395a) {
            case 0:
                this.f30396b.getClass();
                return;
            default:
                g8 g8Var = this.f30396b;
                TextView textView = g8Var.F;
                TextView textView2 = g8Var.E;
                ug.s0 s0Var = g8Var.G;
                if (s0Var.getVisibility() == 0 && s0Var.f58867w.isEnabled()) {
                    s0Var.performClick();
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
