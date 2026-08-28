package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class x implements View.OnClickListener {
    public final int f23931a;
    public final KeyEvent.Callback f23932b;

    public x(KeyEvent.Callback callback, int i9) {
        this.f23931a = i9;
        this.f23932b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23931a) {
            case 0:
                z zVar = (z) this.f23932b;
                k kVar = zVar.f23999b;
                w0 w0Var = (w0) view;
                if (w0Var.q()) {
                    if (kVar.f23589q0.a()) {
                        w0Var.M(null, null);
                        return;
                    }
                    return;
                } else if (w0Var.C) {
                    kVar.v(w0Var.L(true));
                    return;
                } else {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((g2) this.f23932b).dismiss();
                return;
            default:
                f3 f3Var = (f3) this.f23932b;
                f3Var.getClass();
                f3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
