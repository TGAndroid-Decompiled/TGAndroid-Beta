package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
public final class e5 implements View.OnClickListener {
    public final int f20287a;
    public final i5 f20288b;

    public e5(i5 i5Var, int i10) {
        this.f20287a = i10;
        this.f20288b = i5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20287a) {
            case 0:
                i5 i5Var = this.f20288b;
                if (!i5Var.G && i5Var.F) {
                    i5Var.j(true);
                    return;
                }
                k kVar = i5Var.V;
                if (kVar != null) {
                    kVar.b(-1);
                    return;
                }
                return;
            default:
                i5 i5Var2 = this.f20288b;
                if (i5Var2.f20428s.length() != 0) {
                    i5Var2.f20428s.setText("");
                } else {
                    TextView textView = i5Var2.f20430x;
                    if (textView != null && textView.getVisibility() == 0) {
                        i5Var2.i();
                    }
                }
                i5Var2.f20428s.requestFocus();
                org.telegram.messenger.i0.J3(i5Var2.f20428s);
                return;
        }
    }
}
