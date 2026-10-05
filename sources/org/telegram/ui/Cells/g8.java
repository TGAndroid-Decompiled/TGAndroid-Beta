package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
public final class g8 implements View.OnClickListener {
    public final int f22177a;
    public final m8 f22178b;

    public g8(m8 m8Var, int i10) {
        this.f22177a = i10;
        this.f22178b = m8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22177a) {
            case 0:
                this.f22178b.getClass();
                return;
            default:
                m8 m8Var = this.f22178b;
                TextView textView = m8Var.E;
                TextView textView2 = m8Var.f22489y;
                rg.q0 q0Var = m8Var.F;
                if (q0Var.getVisibility() == 0 && q0Var.f46266r.isEnabled()) {
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
