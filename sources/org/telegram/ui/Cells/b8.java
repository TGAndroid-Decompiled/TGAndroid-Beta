package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class b8 implements View.OnClickListener {
    public final int f30485a;
    public final h8 f30486b;

    public b8(h8 h8Var, int i7) {
        this.f30485a = i7;
        this.f30486b = h8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30485a) {
            case 0:
                this.f30486b.getClass();
                return;
            default:
                h8 h8Var = this.f30486b;
                TextView textView = h8Var.F;
                TextView textView2 = h8Var.E;
                ug.r0 r0Var = h8Var.G;
                if (r0Var.getVisibility() == 0 && r0Var.f58908w.isEnabled()) {
                    r0Var.performClick();
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
