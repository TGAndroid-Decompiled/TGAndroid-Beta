package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class c8 implements View.OnClickListener {
    public final int f24183a;
    public final i8 f24184b;

    public c8(i8 i8Var, int i10) {
        this.f24183a = i10;
        this.f24184b = i8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24183a) {
            case 0:
                this.f24184b.getClass();
                return;
            default:
                i8 i8Var = this.f24184b;
                TextView textView = i8Var.A;
                TextView textView2 = i8Var.f24512y;
                cg.d1 d1Var = i8Var.B;
                if (d1Var.getVisibility() == 0 && d1Var.f3095r.isEnabled()) {
                    d1Var.performClick();
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
