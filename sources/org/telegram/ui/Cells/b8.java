package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;

public final class b8 implements View.OnClickListener {

    public final int f24126a;

    public final h8 f24127b;

    public b8(h8 h8Var, int i10) {
        this.f24126a = i10;
        this.f24127b = h8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24126a) {
            case 0:
                this.f24127b.getClass();
                break;
            default:
                h8 h8Var = this.f24127b;
                TextView textView = h8Var.A;
                TextView textView2 = h8Var.f24462y;
                ag.s1 s1Var = h8Var.B;
                if (s1Var.getVisibility() != 0 || !s1Var.f647r.isEnabled()) {
                    if (textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                        if (textView.getVisibility() == 0 && textView.isEnabled()) {
                            textView.performClick();
                            break;
                        }
                    } else {
                        textView2.performClick();
                        break;
                    }
                } else {
                    s1Var.performClick();
                    break;
                }
                break;
        }
    }
}
