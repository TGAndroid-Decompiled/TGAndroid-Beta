package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class e8 implements View.OnClickListener {
    public final int f21030a;
    public final k8 f21031b;

    public e8(k8 k8Var, int i10) {
        this.f21030a = i10;
        this.f21031b = k8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21030a) {
            case 0:
                this.f21031b.getClass();
                return;
            default:
                k8 k8Var = this.f21031b;
                TextView textView = k8Var.B;
                TextView textView2 = k8Var.f21315y;
                eg.c1 c1Var = k8Var.C;
                if (c1Var.getVisibility() == 0 && c1Var.f5232r.isEnabled()) {
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
