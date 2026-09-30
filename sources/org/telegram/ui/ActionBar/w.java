package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class w implements View.OnClickListener {
    public final int f19908a;
    public final KeyEvent.Callback f19909b;

    public w(KeyEvent.Callback callback, int i10) {
        this.f19908a = i10;
        this.f19909b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19908a) {
            case 0:
                y yVar = (y) this.f19909b;
                k kVar = yVar.f19945b;
                u0 u0Var = (u0) view;
                if (u0Var.q()) {
                    if (kVar.f19587u0.a()) {
                        u0Var.M(null, null);
                        return;
                    }
                    return;
                } else if (u0Var.G) {
                    kVar.v(u0Var.L(true));
                    return;
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((e2) this.f19909b).dismiss();
                return;
            default:
                e3 e3Var = (e3) this.f19909b;
                e3Var.getClass();
                e3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
