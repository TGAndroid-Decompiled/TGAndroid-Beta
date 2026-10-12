package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class w implements View.OnClickListener {
    public final int f21418a;
    public final KeyEvent.Callback f21419b;

    public w(KeyEvent.Callback callback, int i10) {
        this.f21418a = i10;
        this.f21419b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21418a) {
            case 0:
                y yVar = (y) this.f21419b;
                k kVar = yVar.f21460b;
                u0 u0Var = (u0) view;
                if (u0Var.q()) {
                    if (kVar.f21076u0.a()) {
                        u0Var.M(null, null);
                        return;
                    }
                    return;
                } else if (u0Var.G) {
                    kVar.x(u0Var.L(true));
                    return;
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((e2) this.f21419b).dismiss();
                return;
            default:
                e3 e3Var = (e3) this.f21419b;
                e3Var.getClass();
                e3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
