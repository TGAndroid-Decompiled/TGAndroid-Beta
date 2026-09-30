package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class g8 implements View.OnClickListener {
    public final int f20381a;
    public final m8 f20382b;

    public g8(m8 m8Var, int i10) {
        this.f20381a = i10;
        this.f20382b = m8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20381a) {
            case 0:
                this.f20382b.getClass();
                return;
            default:
                m8 m8Var = this.f20382b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.f20670y;
                rg.p0 p0Var = m8Var.F;
                if (p0Var.getVisibility() == 0 && p0Var.f42818r.isEnabled()) {
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
