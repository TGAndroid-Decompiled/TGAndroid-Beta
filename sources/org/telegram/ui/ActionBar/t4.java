package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
public final class t4 implements View.OnClickListener {
    public final int f29669a;
    public final w4 f29670b;

    public t4(w4 w4Var, int i7) {
        this.f29669a = i7;
        this.f29670b = w4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29669a) {
            case 0:
                w4 w4Var = this.f29670b;
                if (!w4Var.H && w4Var.G) {
                    w4Var.m(true);
                    return;
                }
                j jVar = w4Var.W;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
            default:
                w4 w4Var2 = this.f29670b;
                if (w4Var2.f29830s.length() != 0) {
                    w4Var2.f29830s.setText("");
                } else {
                    TextView textView = w4Var2.f29834x;
                    if (textView != null && textView.getVisibility() == 0) {
                        w4Var2.l();
                    }
                }
                w4Var2.f29830s.requestFocus();
                org.telegram.messenger.g0.J3(w4Var2.f29830s);
                return;
        }
    }
}
