package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
public final class v4 implements View.OnClickListener {
    public final int f28661a;
    public final y4 f28662b;

    public v4(y4 y4Var, int i7) {
        this.f28661a = i7;
        this.f28662b = y4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28661a) {
            case 0:
                y4 y4Var = this.f28662b;
                if (!y4Var.G && y4Var.F) {
                    y4Var.j(true);
                    return;
                }
                j jVar = y4Var.V;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
            default:
                y4 y4Var2 = this.f28662b;
                if (y4Var2.f28801s.length() != 0) {
                    y4Var2.f28801s.setText("");
                } else {
                    TextView textView = y4Var2.f28803x;
                    if (textView != null && textView.getVisibility() == 0) {
                        y4Var2.i();
                    }
                }
                y4Var2.f28801s.requestFocus();
                org.telegram.messenger.g0.K3(y4Var2.f28801s);
                return;
        }
    }
}
