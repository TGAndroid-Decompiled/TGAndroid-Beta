package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class od0 implements Runnable {
    public final int f36150a;
    public final bf0 f36151b;

    public od0(bf0 bf0Var, int i10) {
        this.f36150a = i10;
        this.f36151b = bf0Var;
    }

    @Override
    public final void run() {
        switch (this.f36150a) {
            case 0:
                this.f36151b.L.n();
                return;
            case 1:
                bf0 bf0Var = this.f36151b;
                bf0Var.M = null;
                bf0Var.N = null;
                bf0Var.p(true);
                bf0Var.e.h(null, null, bf0Var.f32408f, null);
                id idVar = bf0Var.f32409n;
                org.telegram.ui.Components.ij0 ij0Var = bf0Var.I;
                idVar.setAnimation(ij0Var);
                ij0Var.M(0);
                bf0Var.K = true;
                return;
            case 2:
                this.f36151b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f36151b.f32407c;
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
