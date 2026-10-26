package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x implements View.OnClickListener {
    public final int f23237a;
    public final KeyEvent.Callback f23238b;

    public x(KeyEvent.Callback callback, int i10) {
        this.f23237a = i10;
        this.f23238b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23237a) {
            case 0:
                z zVar = (z) this.f23238b;
                k kVar = zVar.f23778b;
                w0 w0Var = (w0) view;
                if (w0Var.s()) {
                    if (kVar.f22790u0.a()) {
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
                ((i2) this.f23238b).dismiss();
                return;
            case 2:
                k3 k3Var = (k3) this.f23238b;
                k3Var.getClass();
                k3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
            default:
                u5 u5Var = (u5) this.f23238b;
                if (!u5Var.f23139x.f19327f) {
                    if (u5Var.f23138w.f19327f) {
                        r5 r5Var = u5Var.f23131a;
                        int i10 = u5Var.f23132b;
                        j jVar = r5Var.T;
                        if (jVar != null) {
                            jVar.b(i10);
                            return;
                        }
                        return;
                    } else if (u5Var.f23133c == t5.f23103b) {
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
