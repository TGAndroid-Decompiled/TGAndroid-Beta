package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class od0 implements Runnable {
    public final int f36144a;
    public final bf0 f36145b;

    public od0(bf0 bf0Var, int i10) {
        this.f36144a = i10;
        this.f36145b = bf0Var;
    }

    @Override
    public final void run() {
        switch (this.f36144a) {
            case 0:
                this.f36145b.L.n();
                return;
            case 1:
                bf0 bf0Var = this.f36145b;
                bf0Var.M = null;
                bf0Var.N = null;
                bf0Var.p(true);
                bf0Var.e.h(null, null, bf0Var.f32411f, null);
                id idVar = bf0Var.f32412n;
                org.telegram.ui.Components.kj0 kj0Var = bf0Var.I;
                idVar.setAnimation(kj0Var);
                kj0Var.M(0);
                bf0Var.K = true;
                return;
            case 2:
                this.f36145b.K = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f36145b.f32410c;
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
