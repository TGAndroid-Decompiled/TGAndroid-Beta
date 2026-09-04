package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class q0 implements Runnable {
    public final int f29527a;
    public final EditTextBoldCursor f29528b;
    public final org.telegram.ui.ActionBar.b2 f29529c;
    public final org.telegram.ui.ActionBar.n2 d;

    public q0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29527a = i10;
        this.f29528b = editTextBoldCursor;
        this.f29529c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29527a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0(this.f29528b, this.f29529c, this.d, 1));
                return;
            default:
                e5.e0(this.f29528b, this.f29529c, this.d);
                return;
        }
    }
}
