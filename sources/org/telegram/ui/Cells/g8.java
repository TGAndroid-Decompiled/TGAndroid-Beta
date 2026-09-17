package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class g8 implements View.OnClickListener {
    public final int f22017a;
    public final m8 f22018b;

    public g8(m8 m8Var, int i10) {
        this.f22017a = i10;
        this.f22018b = m8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22017a) {
            case 0:
                this.f22018b.getClass();
                return;
            default:
                m8 m8Var = this.f22018b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.f22332y;
                sg.r0 r0Var = m8Var.F;
                if (r0Var.getVisibility() == 0 && r0Var.f46270r.isEnabled()) {
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
