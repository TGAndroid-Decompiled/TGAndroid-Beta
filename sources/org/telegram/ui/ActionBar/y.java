package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class y implements View.OnClickListener {
    public final int f19696a;
    public final KeyEvent.Callback f19697b;

    public y(KeyEvent.Callback callback, int i10) {
        this.f19696a = i10;
        this.f19697b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19696a) {
            case 0:
                a0 a0Var = (a0) this.f19697b;
                k kVar = a0Var.f18452b;
                w0 w0Var = (w0) view;
                if (w0Var.q()) {
                    if (kVar.f19321u0.a()) {
                        w0Var.M(null, null);
                        return;
                    }
                    return;
                } else if (w0Var.G) {
                    kVar.v(w0Var.L(true));
                    return;
                } else {
                    a0Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((g2) this.f19697b).dismiss();
                return;
            default:
                g3 g3Var = (g3) this.f19697b;
                g3Var.getClass();
                g3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
