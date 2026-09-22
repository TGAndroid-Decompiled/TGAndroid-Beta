package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class g8 implements View.OnClickListener {
    public final int f20137a;
    public final m8 f20138b;

    public g8(m8 m8Var, int i10) {
        this.f20137a = i10;
        this.f20138b = m8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20137a) {
            case 0:
                this.f20138b.getClass();
                return;
            default:
                m8 m8Var = this.f20138b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.f20429y;
                rg.p0 p0Var = m8Var.F;
                if (p0Var.getVisibility() == 0 && p0Var.f42422r.isEnabled()) {
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
