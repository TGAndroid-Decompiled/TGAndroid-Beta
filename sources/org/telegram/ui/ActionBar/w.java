package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class w implements View.OnClickListener {
    public final int f20778a;
    public final KeyEvent.Callback f20779b;

    public w(KeyEvent.Callback callback, int i10) {
        this.f20778a = i10;
        this.f20779b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20778a) {
            case 0:
                y yVar = (y) this.f20779b;
                k kVar = yVar.f20817b;
                u0 u0Var = (u0) view;
                if (u0Var.q()) {
                    if (kVar.f20458u0.a()) {
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
                ((e2) this.f20779b).dismiss();
                return;
            default:
                e3 e3Var = (e3) this.f20779b;
                e3Var.getClass();
                e3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
