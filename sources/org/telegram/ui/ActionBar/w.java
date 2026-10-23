package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class w implements View.OnClickListener {
    public final int f21831a;
    public final KeyEvent.Callback f21832b;

    public w(KeyEvent.Callback callback, int i10) {
        this.f21831a = i10;
        this.f21832b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21831a) {
            case 0:
                y yVar = (y) this.f21832b;
                k kVar = yVar.f21897b;
                u0 u0Var = (u0) view;
                if (u0Var.q()) {
                    if (kVar.f21517u0.a()) {
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
                ((f2) this.f21832b).dismiss();
                return;
            default:
                f3 f3Var = (f3) this.f21832b;
                f3Var.getClass();
                f3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
