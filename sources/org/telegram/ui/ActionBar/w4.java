package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
public final class w4 implements View.OnClickListener {
    public final int f30276a;
    public final z4 f30277b;

    public w4(z4 z4Var, int i7) {
        this.f30276a = i7;
        this.f30277b = z4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30276a) {
            case 0:
                z4 z4Var = this.f30277b;
                if (!z4Var.H && z4Var.G) {
                    z4Var.o(true);
                    return;
                }
                j jVar = z4Var.W;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
            default:
                z4 z4Var2 = this.f30277b;
                if (z4Var2.f30403s.length() != 0) {
                    z4Var2.f30403s.setText("");
                } else {
                    TextView textView = z4Var2.f30409x;
                    if (textView != null && textView.getVisibility() == 0) {
                        z4Var2.n();
                    }
                }
                z4Var2.f30403s.requestFocus();
                org.telegram.messenger.g0.I3(z4Var2.f30403s);
                return;
        }
    }
}
