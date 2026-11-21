package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
public final class w4 implements View.OnClickListener {
    public final int f30223a;
    public final z4 f30224b;

    public w4(z4 z4Var, int i7) {
        this.f30223a = i7;
        this.f30224b = z4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30223a) {
            case 0:
                z4 z4Var = this.f30224b;
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
                z4 z4Var2 = this.f30224b;
                if (z4Var2.f30343s.length() != 0) {
                    z4Var2.f30343s.setText("");
                } else {
                    TextView textView = z4Var2.f30349x;
                    if (textView != null && textView.getVisibility() == 0) {
                        z4Var2.n();
                    }
                }
                z4Var2.f30343s.requestFocus();
                org.telegram.messenger.g0.I3(z4Var2.f30343s);
                return;
        }
    }
}
