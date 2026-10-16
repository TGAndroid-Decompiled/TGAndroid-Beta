package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class g8 implements View.OnClickListener {
    public final int f20935a;
    public final m8 f20936b;

    public g8(m8 m8Var, int i10) {
        this.f20935a = i10;
        this.f20936b = m8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20935a) {
            case 0:
                this.f20936b.getClass();
                return;
            default:
                m8 m8Var = this.f20936b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.f21227y;
                sg.q0 q0Var = m8Var.F;
                if (q0Var.getVisibility() == 0 && q0Var.f45314r.isEnabled()) {
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
