package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class y implements View.OnClickListener {
    public final int f23971a;
    public final KeyEvent.Callback f23972b;

    public y(KeyEvent.Callback callback, int i10) {
        this.f23971a = i10;
        this.f23972b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23971a) {
            case 0:
                a0 a0Var = (a0) this.f23972b;
                l lVar = a0Var.f22719b;
                w0 w0Var = (w0) view;
                if (w0Var.q()) {
                    if (lVar.f23624q0.a()) {
                        w0Var.M(null, null);
                        return;
                    }
                    return;
                } else if (w0Var.C) {
                    lVar.v(w0Var.L(true));
                    return;
                } else {
                    a0Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((g2) this.f23972b).dismiss();
                return;
            default:
                f3 f3Var = (f3) this.f23972b;
                f3Var.getClass();
                f3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
