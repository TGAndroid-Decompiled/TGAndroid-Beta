package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class z7 implements View.OnClickListener {
    public final int f32127a;
    public final f8 f32128b;

    public z7(f8 f8Var, int i7) {
        this.f32127a = i7;
        this.f32128b = f8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32127a) {
            case 0:
                this.f32128b.getClass();
                return;
            default:
                f8 f8Var = this.f32128b;
                TextView textView = f8Var.F;
                TextView textView2 = f8Var.E;
                ug.q0 q0Var = f8Var.G;
                if (q0Var.getVisibility() == 0 && q0Var.f58271w.isEnabled()) {
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
