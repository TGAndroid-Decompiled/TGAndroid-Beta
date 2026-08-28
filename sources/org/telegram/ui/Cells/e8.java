package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class e8 implements View.OnClickListener {
    public final int f24319a;
    public final k8 f24320b;

    public e8(k8 k8Var, int i9) {
        this.f24319a = i9;
        this.f24320b = k8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24319a) {
            case 0:
                this.f24320b.getClass();
                return;
            default:
                k8 k8Var = this.f24320b;
                TextView textView = k8Var.A;
                TextView textView2 = k8Var.f24626y;
                zf.p0 p0Var = k8Var.B;
                if (p0Var.getVisibility() == 0 && p0Var.f50651r.isEnabled()) {
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
