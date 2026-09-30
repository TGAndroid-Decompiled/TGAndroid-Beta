package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class g8 implements View.OnClickListener {
    public final int f20366a;
    public final m8 f20367b;

    public g8(m8 m8Var, int i10) {
        this.f20366a = i10;
        this.f20367b = m8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20366a) {
            case 0:
                this.f20367b.getClass();
                return;
            default:
                m8 m8Var = this.f20367b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.f20655y;
                rg.p0 p0Var = m8Var.F;
                if (p0Var.getVisibility() == 0 && p0Var.f42712r.isEnabled()) {
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
