package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x implements View.OnClickListener {
    public final int f23238a;
    public final KeyEvent.Callback f23239b;

    public x(KeyEvent.Callback callback, int i10) {
        this.f23238a = i10;
        this.f23239b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23238a) {
            case 0:
                z zVar = (z) this.f23239b;
                k kVar = zVar.f23779b;
                w0 w0Var = (w0) view;
                if (w0Var.s()) {
                    if (kVar.f22791u0.a()) {
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
                ((i2) this.f23239b).dismiss();
                return;
            case 2:
                k3 k3Var = (k3) this.f23239b;
                k3Var.getClass();
                k3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
            default:
                u5 u5Var = (u5) this.f23239b;
                if (!u5Var.f23140x.f19326f) {
                    if (u5Var.f23139w.f19326f) {
                        r5 r5Var = u5Var.f23132a;
                        int i10 = u5Var.f23133b;
                        j jVar = r5Var.T;
                        if (jVar != null) {
                            jVar.b(i10);
                            return;
                        }
                        return;
                    } else if (u5Var.f23134c == t5.f23104b) {
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
