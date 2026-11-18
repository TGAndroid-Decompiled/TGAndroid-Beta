package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class b8 implements View.OnClickListener {
    public final int f30454a;
    public final h8 f30455b;

    public b8(h8 h8Var, int i7) {
        this.f30454a = i7;
        this.f30455b = h8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30454a) {
            case 0:
                this.f30455b.getClass();
                return;
            default:
                h8 h8Var = this.f30455b;
                TextView textView = h8Var.F;
                TextView textView2 = h8Var.E;
                ug.s0 s0Var = h8Var.G;
                if (s0Var.getVisibility() == 0 && s0Var.f58868w.isEnabled()) {
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
