package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bd0 implements Runnable {
    public final int f36829a;
    public final qe0 f36830b;

    public bd0(qe0 qe0Var, int i9) {
        this.f36829a = i9;
        this.f36830b = qe0Var;
    }

    @Override
    public final void run() {
        switch (this.f36829a) {
            case 0:
                this.f36830b.H.n();
                return;
            case 1:
                qe0 qe0Var = this.f36830b;
                qe0Var.I = null;
                qe0Var.J = null;
                qe0Var.p(true);
                qe0Var.f41774e.h(null, null, qe0Var.f41775f, null);
                fd fdVar = qe0Var.f41776n;
                org.telegram.ui.Components.mi0 mi0Var = qe0Var.E;
                fdVar.setAnimation(mi0Var);
                mi0Var.K(0);
                qe0Var.G = true;
                return;
            case 2:
                this.f36830b.G = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f36830b.f41773c;
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
