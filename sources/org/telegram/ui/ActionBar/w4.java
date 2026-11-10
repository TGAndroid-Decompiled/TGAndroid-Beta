package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
public final class w4 implements View.OnClickListener {
    public final int f28721a;
    public final z4 f28722b;

    public w4(z4 z4Var, int i7) {
        this.f28721a = i7;
        this.f28722b = z4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28721a) {
            case 0:
                z4 z4Var = this.f28722b;
                if (!z4Var.G && z4Var.F) {
                    z4Var.l(true);
                    return;
                }
                k kVar = z4Var.V;
                if (kVar != null) {
                    kVar.b(-1);
                    return;
                }
                return;
            default:
                z4 z4Var2 = this.f28722b;
                if (z4Var2.f28843s.length() != 0) {
                    z4Var2.f28843s.setText("");
                } else {
                    TextView textView = z4Var2.f28846x;
                    if (textView != null && textView.getVisibility() == 0) {
                        z4Var2.k();
                    }
                }
                z4Var2.f28843s.requestFocus();
                org.telegram.messenger.g0.K3(z4Var2.f28843s);
                return;
        }
    }
}
