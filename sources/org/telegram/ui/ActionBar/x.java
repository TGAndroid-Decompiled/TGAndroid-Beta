package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;

public final class x implements View.OnClickListener {

    public final int f23938a;

    public final KeyEvent.Callback f23939b;

    public x(KeyEvent.Callback callback, int i10) {
        this.f23938a = i10;
        this.f23939b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23938a) {
            case 0:
                z zVar = (z) this.f23939b;
                k kVar = zVar.f23984b;
                v0 v0Var = (v0) view;
                if (!v0Var.q()) {
                    if (!v0Var.C) {
                        zVar.o(((Integer) view.getTag()).intValue());
                    } else {
                        kVar.w(v0Var.L(true));
                    }
                } else if (kVar.f23590q0.a()) {
                    v0Var.M(null, null);
                }
                break;
            case 1:
                ((f2) this.f23939b).dismiss();
                break;
            default:
                e3 e3Var = (e3) this.f23939b;
                e3Var.getClass();
                e3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                break;
        }
    }
}
