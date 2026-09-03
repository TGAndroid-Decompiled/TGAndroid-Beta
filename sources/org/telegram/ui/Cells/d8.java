package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class d8 implements View.OnClickListener {
    public final int f20947a;
    public final j8 f20948b;

    public d8(j8 j8Var, int i10) {
        this.f20947a = i10;
        this.f20948b = j8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20947a) {
            case 0:
                this.f20948b.getClass();
                return;
            default:
                j8 j8Var = this.f20948b;
                TextView textView = j8Var.B;
                TextView textView2 = j8Var.f21245y;
                eg.c1 c1Var = j8Var.C;
                if (c1Var.getVisibility() == 0 && c1Var.f5221r.isEnabled()) {
                    c1Var.performClick();
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
