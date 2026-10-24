package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class f8 implements View.OnClickListener {
    public final int f22381a;
    public final l8 f22382b;

    public f8(l8 l8Var, int i10) {
        this.f22381a = i10;
        this.f22382b = l8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22381a) {
            case 0:
                this.f22382b.getClass();
                return;
            default:
                l8 l8Var = this.f22382b;
                TextView textView = l8Var.E;
                TextView textView2 = l8Var.f22694y;
                sg.p0 p0Var = l8Var.F;
                if (p0Var.getVisibility() == 0 && p0Var.v.isEnabled()) {
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
