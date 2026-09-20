package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class x implements View.OnClickListener {
    public final int f19887a;
    public final KeyEvent.Callback f19888b;

    public x(KeyEvent.Callback callback, int i10) {
        this.f19887a = i10;
        this.f19888b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19887a) {
            case 0:
                z zVar = (z) this.f19888b;
                k kVar = zVar.f19955b;
                v0 v0Var = (v0) view;
                if (v0Var.q()) {
                    if (kVar.f19553u0.a()) {
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
                ((f2) this.f19888b).dismiss();
                return;
            default:
                f3 f3Var = (f3) this.f19888b;
                f3Var.getClass();
                f3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
