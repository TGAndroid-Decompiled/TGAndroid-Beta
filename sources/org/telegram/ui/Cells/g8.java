package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class g8 implements View.OnClickListener {
    public final int f21989a;
    public final m8 f21990b;

    public g8(m8 m8Var, int i10) {
        this.f21989a = i10;
        this.f21990b = m8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21989a) {
            case 0:
                this.f21990b.getClass();
                return;
            default:
                m8 m8Var = this.f21990b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.f22304y;
                sg.r0 r0Var = m8Var.F;
                if (r0Var.getVisibility() == 0 && r0Var.f46241r.isEnabled()) {
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
