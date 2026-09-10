package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class x implements View.OnClickListener {
    public final int f18724a;
    public final KeyEvent.Callback f18725b;

    public x(KeyEvent.Callback callback, int i10) {
        this.f18724a = i10;
        this.f18725b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18724a) {
            case 0:
                z zVar = (z) this.f18725b;
                l lVar = zVar.f18793b;
                w0 w0Var = (w0) view;
                if (w0Var.q()) {
                    if (lVar.f18404u0.a()) {
                        w0Var.M(null, null);
                        return;
                    }
                    return;
                } else if (w0Var.G) {
                    lVar.v(w0Var.L(true));
                    return;
                } else {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((h2) this.f18725b).dismiss();
                return;
            default:
                h3 h3Var = (h3) this.f18725b;
                h3Var.getClass();
                h3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
