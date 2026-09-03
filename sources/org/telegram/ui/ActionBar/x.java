package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class x implements View.OnClickListener {
    public final int f22399a;
    public final KeyEvent.Callback f22400b;

    public x(KeyEvent.Callback callback, int i10) {
        this.f22399a = i10;
        this.f22400b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22399a) {
            case 0:
                z zVar = (z) this.f22400b;
                k kVar = zVar.f22475b;
                w0 w0Var = (w0) view;
                if (w0Var.q()) {
                    if (kVar.f21561r0.a()) {
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
                ((h2) this.f22400b).dismiss();
                return;
            default:
                h3 h3Var = (h3) this.f22400b;
                h3Var.getClass();
                h3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
