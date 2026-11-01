package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
public final class e5 implements View.OnClickListener {
    public final int f20288a;
    public final i5 f20289b;

    public e5(i5 i5Var, int i10) {
        this.f20288a = i10;
        this.f20289b = i5Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20288a) {
            case 0:
                i5 i5Var = this.f20289b;
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
                i5 i5Var2 = this.f20289b;
                if (i5Var2.f20429s.length() != 0) {
                    i5Var2.f20429s.setText("");
                } else {
                    TextView textView = i5Var2.f20431x;
                    if (textView != null && textView.getVisibility() == 0) {
                        i5Var2.i();
                    }
                }
                i5Var2.f20429s.requestFocus();
                org.telegram.messenger.i0.J3(i5Var2.f20429s);
                return;
        }
    }
}
