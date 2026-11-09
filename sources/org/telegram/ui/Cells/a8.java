package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class a8 implements View.OnClickListener {
    public final int f28904a;
    public final g8 f28905b;

    public a8(g8 g8Var, int i7) {
        this.f28904a = i7;
        this.f28905b = g8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28904a) {
            case 0:
                this.f28905b.getClass();
                return;
            default:
                g8 g8Var = this.f28905b;
                TextView textView = g8Var.E;
                TextView textView2 = g8Var.D;
                ug.p0 p0Var = g8Var.F;
                if (p0Var.getVisibility() == 0 && p0Var.f56773w.isEnabled()) {
                    p0Var.performClick();
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
