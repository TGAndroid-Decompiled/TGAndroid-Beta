package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class w implements View.OnClickListener {
    public final int f21680a;
    public final KeyEvent.Callback f21681b;

    public w(KeyEvent.Callback callback, int i10) {
        this.f21680a = i10;
        this.f21681b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21680a) {
            case 0:
                y yVar = (y) this.f21681b;
                k kVar = yVar.f21722b;
                u0 u0Var = (u0) view;
                if (u0Var.q()) {
                    if (kVar.f21338u0.a()) {
                        u0Var.M(null, null);
                        return;
                    }
                    return;
                } else if (u0Var.G) {
                    kVar.w(u0Var.L(true));
                    return;
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((e2) this.f21681b).dismiss();
                return;
            default:
                e3 e3Var = (e3) this.f21681b;
                e3Var.getClass();
                e3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
