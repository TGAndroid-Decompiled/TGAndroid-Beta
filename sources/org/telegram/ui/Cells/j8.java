package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class j8 implements View.OnClickListener {
    public final int f24295a;
    public final p8 f24296b;

    public j8(p8 p8Var, int i10) {
        this.f24295a = i10;
        this.f24296b = p8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24295a) {
            case 0:
                this.f24296b.getClass();
                return;
            default:
                p8 p8Var = this.f24296b;
                TextView textView = p8Var.E;
                TextView textView2 = p8Var.f24777y;
                tg.p0 p0Var = p8Var.F;
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
