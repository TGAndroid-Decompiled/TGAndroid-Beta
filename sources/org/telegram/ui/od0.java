package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class od0 implements Runnable {
    public final int f36149a;
    public final bf0 f36150b;

    public od0(bf0 bf0Var, int i10) {
        this.f36149a = i10;
        this.f36150b = bf0Var;
    }

    @Override
    public final void run() {
        switch (this.f36149a) {
            case 0:
                this.f36150b.L.n();
                return;
            case 1:
                bf0 bf0Var = this.f36150b;
                bf0Var.M = null;
                bf0Var.N = null;
                bf0Var.p(true);
                bf0Var.e.h(null, null, bf0Var.f32407f, null);
                id idVar = bf0Var.f32408n;
                org.telegram.ui.Components.jj0 jj0Var = bf0Var.I;
                idVar.setAnimation(jj0Var);
                jj0Var.M(0);
                bf0Var.K = true;
                return;
            case 2:
                this.f36150b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f36150b.f32406c;
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
