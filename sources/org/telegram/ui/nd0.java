package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nd0 implements Runnable {
    public final int f39327a;
    public final af0 f39328b;

    public nd0(af0 af0Var, int i10) {
        this.f39327a = i10;
        this.f39328b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f39327a) {
            case 0:
                this.f39328b.I.n();
                return;
            case 1:
                af0 af0Var = this.f39328b;
                af0Var.J = null;
                af0Var.K = null;
                af0Var.p(true);
                af0Var.f35160e.h(null, null, af0Var.f35161f, null);
                kd kdVar = af0Var.f35162n;
                org.telegram.ui.Components.hj0 hj0Var = af0Var.F;
                kdVar.setAnimation(hj0Var);
                hj0Var.K(0);
                af0Var.H = true;
                return;
            case 2:
                this.f39328b.H = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f39328b.f35159c;
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
