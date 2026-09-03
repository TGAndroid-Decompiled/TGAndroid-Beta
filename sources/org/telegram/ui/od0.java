package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class od0 implements Runnable {
    public final int f36753a;
    public final bf0 f36754b;

    public od0(bf0 bf0Var, int i10) {
        this.f36753a = i10;
        this.f36754b = bf0Var;
    }

    @Override
    public final void run() {
        switch (this.f36753a) {
            case 0:
                this.f36754b.I.n();
                return;
            case 1:
                bf0 bf0Var = this.f36754b;
                bf0Var.J = null;
                bf0Var.K = null;
                bf0Var.p(true);
                bf0Var.e.h(null, null, bf0Var.f32866f, null);
                md mdVar = bf0Var.f32867n;
                org.telegram.ui.Components.gj0 gj0Var = bf0Var.F;
                mdVar.setAnimation(gj0Var);
                gj0Var.K(0);
                bf0Var.H = true;
                return;
            case 2:
                this.f36754b.H = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f36754b.f32865c;
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
