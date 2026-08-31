package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class e8 implements View.OnClickListener {
    public final int f22772a;
    public final k8 f22773b;

    public e8(k8 k8Var, int i10) {
        this.f22772a = i10;
        this.f22773b = k8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22772a) {
            case 0:
                this.f22773b.getClass();
                return;
            default:
                k8 k8Var = this.f22773b;
                TextView textView = k8Var.B;
                TextView textView2 = k8Var.f23081y;
                fg.b1 b1Var = k8Var.C;
                if (b1Var.getVisibility() == 0 && b1Var.f6250r.isEnabled()) {
                    b1Var.performClick();
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
