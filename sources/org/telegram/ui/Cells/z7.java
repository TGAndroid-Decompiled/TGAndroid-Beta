package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class z7 implements View.OnClickListener {
    public final int f31057a;
    public final f8 f31058b;

    public z7(f8 f8Var, int i3) {
        this.f31057a = i3;
        this.f31058b = f8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31057a) {
            case 0:
                this.f31058b.getClass();
                return;
            default:
                f8 f8Var = this.f31058b;
                TextView textView = f8Var.F;
                TextView textView2 = f8Var.E;
                vg.o0 o0Var = f8Var.G;
                if (o0Var.getVisibility() == 0 && o0Var.f56767w.isEnabled()) {
                    o0Var.performClick();
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
