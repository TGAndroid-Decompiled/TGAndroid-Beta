package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
public final class w4 implements View.OnClickListener {
    public final int f30226a;
    public final z4 f30227b;

    public w4(z4 z4Var, int i7) {
        this.f30226a = i7;
        this.f30227b = z4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30226a) {
            case 0:
                z4 z4Var = this.f30227b;
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
                z4 z4Var2 = this.f30227b;
                if (z4Var2.f30346s.length() != 0) {
                    z4Var2.f30346s.setText("");
                } else {
                    TextView textView = z4Var2.f30352x;
                    if (textView != null && textView.getVisibility() == 0) {
                        z4Var2.n();
                    }
                }
                z4Var2.f30346s.requestFocus();
                org.telegram.messenger.g0.I3(z4Var2.f30346s);
                return;
        }
    }
}
