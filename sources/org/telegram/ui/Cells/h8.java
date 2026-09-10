package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class h8 implements View.OnClickListener {
    public final int f19276a;
    public final n8 f19277b;

    public h8(n8 n8Var, int i10) {
        this.f19276a = i10;
        this.f19277b = n8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19276a) {
            case 0:
                this.f19277b.getClass();
                return;
            default:
                n8 n8Var = this.f19277b;
                TextView textView = n8Var.E;
                TextView textView2 = n8Var.f19581y;
                qg.s0 s0Var = n8Var.F;
                if (s0Var.getVisibility() == 0 && s0Var.f40904r.isEnabled()) {
                    s0Var.performClick();
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
