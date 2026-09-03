package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class x implements View.OnClickListener {
    public final int f20696a;
    public final KeyEvent.Callback f20697b;

    public x(KeyEvent.Callback callback, int i10) {
        this.f20696a = i10;
        this.f20697b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20696a) {
            case 0:
                z zVar = (z) this.f20697b;
                k kVar = zVar.f20748b;
                w0 w0Var = (w0) view;
                if (w0Var.q()) {
                    if (kVar.f20318r0.a()) {
                        w0Var.M(null, null);
                        return;
                    }
                    return;
                } else if (w0Var.D) {
                    kVar.v(w0Var.L(true));
                    return;
                } else {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((h2) this.f20697b).dismiss();
                return;
            default:
                g3 g3Var = (g3) this.f20697b;
                g3Var.getClass();
                g3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
