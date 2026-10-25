package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x implements View.OnClickListener {
    public final int f23235a;
    public final KeyEvent.Callback f23236b;

    public x(KeyEvent.Callback callback, int i10) {
        this.f23235a = i10;
        this.f23236b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23235a) {
            case 0:
                z zVar = (z) this.f23236b;
                k kVar = zVar.f23776b;
                w0 w0Var = (w0) view;
                if (w0Var.s()) {
                    if (kVar.f22788u0.a()) {
                        w0Var.U(null, null);
                        return;
                    }
                    return;
                } else if (w0Var.u()) {
                    kVar.t(w0Var.T(true));
                    return;
                } else {
                    zVar.n(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((i2) this.f23236b).dismiss();
                return;
            case 2:
                k3 k3Var = (k3) this.f23236b;
                k3Var.getClass();
                k3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
            default:
                u5 u5Var = (u5) this.f23236b;
                if (!u5Var.f23137x.f19327f) {
                    if (u5Var.f23136w.f19327f) {
                        r5 r5Var = u5Var.f23129a;
                        int i10 = u5Var.f23130b;
                        j jVar = r5Var.T;
                        if (jVar != null) {
                            jVar.b(i10);
                            return;
                        }
                        return;
                    } else if (u5Var.f23131c == t5.f23101b) {
                        AndroidUtilities.shakeViewSpring(u5Var, 4.0f);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
