package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class x implements View.OnClickListener {
    public final int f19664a;
    public final KeyEvent.Callback f19665b;

    public x(KeyEvent.Callback callback, int i10) {
        this.f19664a = i10;
        this.f19665b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19664a) {
            case 0:
                z zVar = (z) this.f19665b;
                k kVar = zVar.f19701b;
                v0 v0Var = (v0) view;
                if (v0Var.q()) {
                    if (kVar.f19311u0.a()) {
                        v0Var.M(null, null);
                        return;
                    }
                    return;
                } else if (v0Var.G) {
                    kVar.v(v0Var.L(true));
                    return;
                } else {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((f2) this.f19665b).dismiss();
                return;
            default:
                f3 f3Var = (f3) this.f19665b;
                f3Var.getClass();
                f3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
