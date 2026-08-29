package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dd0 implements Runnable {
    public final int f37500a;
    public final pe0 f37501b;

    public dd0(pe0 pe0Var, int i10) {
        this.f37500a = i10;
        this.f37501b = pe0Var;
    }

    @Override
    public final void run() {
        switch (this.f37500a) {
            case 0:
                this.f37501b.H.n();
                return;
            case 1:
                pe0 pe0Var = this.f37501b;
                pe0Var.I = null;
                pe0Var.J = null;
                pe0Var.p(true);
                pe0Var.f41388e.h(null, null, pe0Var.f41389f, null);
                ed edVar = pe0Var.f41390n;
                org.telegram.ui.Components.xi0 xi0Var = pe0Var.E;
                edVar.setAnimation(xi0Var);
                xi0Var.K(0);
                pe0Var.G = true;
                return;
            case 2:
                this.f37501b.G = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f37501b.f41387c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
