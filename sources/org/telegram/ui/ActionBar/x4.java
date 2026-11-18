package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
public final class x4 implements View.OnClickListener {
    public final int f30240a;
    public final a5 f30241b;

    public x4(a5 a5Var, int i7) {
        this.f30240a = i7;
        this.f30241b = a5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30240a) {
            case 0:
                a5 a5Var = this.f30241b;
                if (!a5Var.H && a5Var.G) {
                    a5Var.o(true);
                    return;
                }
                j jVar = a5Var.W;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
            default:
                a5 a5Var2 = this.f30241b;
                if (a5Var2.f28782s.length() != 0) {
                    a5Var2.f28782s.setText("");
                } else {
                    TextView textView = a5Var2.f28788x;
                    if (textView != null && textView.getVisibility() == 0) {
                        a5Var2.n();
                    }
                }
                a5Var2.f28782s.requestFocus();
                org.telegram.messenger.g0.I3(a5Var2.f28782s);
                return;
        }
    }
}
