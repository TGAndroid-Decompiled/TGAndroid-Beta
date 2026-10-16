package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class w implements View.OnClickListener {
    public final int f20478a;
    public final KeyEvent.Callback f20479b;

    public w(KeyEvent.Callback callback, int i10) {
        this.f20478a = i10;
        this.f20479b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20478a) {
            case 0:
                y yVar = (y) this.f20479b;
                k kVar = yVar.f20517b;
                u0 u0Var = (u0) view;
                if (u0Var.q()) {
                    if (kVar.f20158u0.a()) {
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
                ((e2) this.f20479b).dismiss();
                return;
            default:
                e3 e3Var = (e3) this.f20479b;
                e3Var.getClass();
                e3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
