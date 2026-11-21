package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class b8 implements View.OnClickListener {
    public final int f30482a;
    public final h8 f30483b;

    public b8(h8 h8Var, int i7) {
        this.f30482a = i7;
        this.f30483b = h8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30482a) {
            case 0:
                this.f30483b.getClass();
                return;
            default:
                h8 h8Var = this.f30483b;
                TextView textView = h8Var.F;
                TextView textView2 = h8Var.E;
                ug.r0 r0Var = h8Var.G;
                if (r0Var.getVisibility() == 0 && r0Var.f58904w.isEnabled()) {
                    r0Var.performClick();
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
