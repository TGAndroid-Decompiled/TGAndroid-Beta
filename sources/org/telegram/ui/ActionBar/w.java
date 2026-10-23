package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class w implements View.OnClickListener {
    public final int f21931a;
    public final KeyEvent.Callback f21932b;

    public w(KeyEvent.Callback callback, int i10) {
        this.f21931a = i10;
        this.f21932b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21931a) {
            case 0:
                y yVar = (y) this.f21932b;
                k kVar = yVar.f21964b;
                u0 u0Var = (u0) view;
                if (u0Var.q()) {
                    if (kVar.f21084u0.a()) {
                        u0Var.M(null, null);
                        return;
                    }
                    return;
                } else if (u0Var.G) {
                    kVar.v(u0Var.L(true));
                    return;
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((g2) this.f21932b).dismiss();
                return;
            default:
                h3 h3Var = (h3) this.f21932b;
                h3Var.getClass();
                h3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
