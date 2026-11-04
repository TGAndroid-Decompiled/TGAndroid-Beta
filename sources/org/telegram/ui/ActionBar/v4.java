package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
public final class v4 implements View.OnClickListener {
    public final int f28742a;
    public final y4 f28743b;

    public v4(y4 y4Var, int i3) {
        this.f28742a = i3;
        this.f28743b = y4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28742a) {
            case 0:
                y4 y4Var = this.f28743b;
                if (!y4Var.H && y4Var.G) {
                    y4Var.j(true);
                    return;
                }
                j jVar = y4Var.W;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
            default:
                y4 y4Var2 = this.f28743b;
                if (y4Var2.f28874s.length() != 0) {
                    y4Var2.f28874s.setText("");
                } else {
                    TextView textView = y4Var2.f28877x;
                    if (textView != null && textView.getVisibility() == 0) {
                        y4Var2.i();
                    }
                }
                y4Var2.f28874s.requestFocus();
                org.telegram.messenger.g0.K3(y4Var2.f28874s);
                return;
        }
    }
}
