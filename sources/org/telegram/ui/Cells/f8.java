package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class f8 implements View.OnClickListener {
    public final int f22255a;
    public final l8 f22256b;

    public f8(l8 l8Var, int i10) {
        this.f22255a = i10;
        this.f22256b = l8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22255a) {
            case 0:
                this.f22256b.getClass();
                return;
            default:
                l8 l8Var = this.f22256b;
                TextView textView = l8Var.E;
                TextView textView2 = l8Var.f22544y;
                sg.q0 q0Var = l8Var.F;
                if (q0Var.getVisibility() == 0 && q0Var.f46381r.isEnabled()) {
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
