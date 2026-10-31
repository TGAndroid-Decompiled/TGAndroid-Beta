package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class e8 implements View.OnClickListener {
    public final int f21869a;
    public final k8 f21870b;

    public e8(k8 k8Var, int i10) {
        this.f21869a = i10;
        this.f21870b = k8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21869a) {
            case 0:
                this.f21870b.getClass();
                return;
            default:
                k8 k8Var = this.f21870b;
                TextView textView = k8Var.E;
                TextView textView2 = k8Var.D;
                kg.x0 x0Var = k8Var.F;
                if (x0Var.getVisibility() == 0 && x0Var.f11331w.isEnabled()) {
                    x0Var.performClick();
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
