package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class q0 implements Runnable {
    public final int f29554a;
    public final EditTextBoldCursor f29555b;
    public final org.telegram.ui.ActionBar.b2 f29556c;
    public final org.telegram.ui.ActionBar.n2 d;

    public q0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29554a = i10;
        this.f29555b = editTextBoldCursor;
        this.f29556c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29554a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0(this.f29555b, this.f29556c, this.d, 1));
                return;
            default:
                e5.e0(this.f29555b, this.f29556c, this.d);
                return;
        }
    }
}
