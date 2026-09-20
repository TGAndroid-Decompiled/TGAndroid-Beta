package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class h8 implements View.OnClickListener {
    public final int f20407a;
    public final n8 f20408b;

    public h8(n8 n8Var, int i10) {
        this.f20407a = i10;
        this.f20408b = n8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20407a) {
            case 0:
                this.f20408b.getClass();
                return;
            default:
                n8 n8Var = this.f20408b;
                TextView textView = n8Var.E;
                TextView textView2 = n8Var.f20708y;
                rg.p0 p0Var = n8Var.F;
                if (p0Var.getVisibility() == 0 && p0Var.f42724r.isEnabled()) {
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
