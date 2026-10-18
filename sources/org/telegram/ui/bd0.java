package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bd0 implements Runnable {
    public final int f35678a;
    public final pe0 f35679b;

    public bd0(pe0 pe0Var, int i10) {
        this.f35678a = i10;
        this.f35679b = pe0Var;
    }

    @Override
    public final void run() {
        switch (this.f35678a) {
            case 0:
                this.f35679b.L.m();
                return;
            case 1:
                pe0 pe0Var = this.f35679b;
                pe0Var.M = null;
                pe0Var.N = null;
                pe0Var.p(true);
                pe0Var.e.h(null, null, pe0Var.f40114f, null);
                ld ldVar = pe0Var.f40115n;
                org.telegram.ui.Components.uj0 uj0Var = pe0Var.I;
                ldVar.setAnimation(uj0Var);
                uj0Var.M(0);
                pe0Var.K = true;
                return;
            case 2:
                this.f35679b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f35679b.f40113c;
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
