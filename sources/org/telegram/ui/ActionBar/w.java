package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class w implements View.OnClickListener {
    public final int f21827a;
    public final KeyEvent.Callback f21828b;

    public w(KeyEvent.Callback callback, int i10) {
        this.f21827a = i10;
        this.f21828b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21827a) {
            case 0:
                y yVar = (y) this.f21828b;
                k kVar = yVar.f21893b;
                u0 u0Var = (u0) view;
                if (u0Var.q()) {
                    if (kVar.f21513u0.a()) {
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
                ((f2) this.f21828b).dismiss();
                return;
            default:
                f3 f3Var = (f3) this.f21828b;
                f3Var.getClass();
                f3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
