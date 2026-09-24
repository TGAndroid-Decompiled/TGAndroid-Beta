package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class w implements View.OnClickListener {
    public final int f19877a;
    public final KeyEvent.Callback f19878b;

    public w(KeyEvent.Callback callback, int i10) {
        this.f19877a = i10;
        this.f19878b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19877a) {
            case 0:
                y yVar = (y) this.f19878b;
                k kVar = yVar.f19914b;
                u0 u0Var = (u0) view;
                if (u0Var.q()) {
                    if (kVar.f19556u0.a()) {
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
                ((e2) this.f19878b).dismiss();
                return;
            default:
                e3 e3Var = (e3) this.f19878b;
                e3Var.getClass();
                e3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
