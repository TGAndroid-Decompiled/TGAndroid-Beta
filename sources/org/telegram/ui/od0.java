package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class od0 implements Runnable {
    public final int f36287a;
    public final bf0 f36288b;

    public od0(bf0 bf0Var, int i10) {
        this.f36287a = i10;
        this.f36288b = bf0Var;
    }

    @Override
    public final void run() {
        switch (this.f36287a) {
            case 0:
                this.f36288b.L.n();
                return;
            case 1:
                bf0 bf0Var = this.f36288b;
                bf0Var.M = null;
                bf0Var.N = null;
                bf0Var.p(true);
                bf0Var.e.h(null, null, bf0Var.f32483f, null);
                id idVar = bf0Var.f32484n;
                org.telegram.ui.Components.lj0 lj0Var = bf0Var.I;
                idVar.setAnimation(lj0Var);
                lj0Var.M(0);
                bf0Var.K = true;
                return;
            case 2:
                this.f36288b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f36288b.f32482c;
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
