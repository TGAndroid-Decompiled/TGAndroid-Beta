package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class g8 implements View.OnClickListener {
    public final int f22016a;
    public final m8 f22017b;

    public g8(m8 m8Var, int i10) {
        this.f22016a = i10;
        this.f22017b = m8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22016a) {
            case 0:
                this.f22017b.getClass();
                return;
            default:
                m8 m8Var = this.f22017b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.f22331y;
                sg.r0 r0Var = m8Var.F;
                if (r0Var.getVisibility() == 0 && r0Var.f46269r.isEnabled()) {
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
