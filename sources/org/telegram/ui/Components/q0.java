package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class q0 implements Runnable {
    public final int f29528a;
    public final EditTextBoldCursor f29529b;
    public final org.telegram.ui.ActionBar.b2 f29530c;
    public final org.telegram.ui.ActionBar.n2 d;

    public q0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29528a = i10;
        this.f29529b = editTextBoldCursor;
        this.f29530c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29528a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0(this.f29529b, this.f29530c, this.d, 1));
                return;
            default:
                e5.e0(this.f29529b, this.f29530c, this.d);
                return;
        }
    }
}
