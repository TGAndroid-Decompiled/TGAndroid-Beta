package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nd0 implements Runnable {
    public final int f39413a;
    public final af0 f39414b;

    public nd0(af0 af0Var, int i10) {
        this.f39413a = i10;
        this.f39414b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f39413a) {
            case 0:
                this.f39414b.I.n();
                return;
            case 1:
                af0 af0Var = this.f39414b;
                af0Var.J = null;
                af0Var.K = null;
                af0Var.p(true);
                af0Var.f35153e.h(null, null, af0Var.f35154f, null);
                kd kdVar = af0Var.f35155n;
                org.telegram.ui.Components.ij0 ij0Var = af0Var.F;
                kdVar.setAnimation(ij0Var);
                ij0Var.K(0);
                af0Var.H = true;
                return;
            case 2:
                this.f39414b.H = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f39414b.f35152c;
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
