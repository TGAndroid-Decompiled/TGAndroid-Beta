package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29556a;
    public final EditTextBoldCursor f29557b;
    public final org.telegram.ui.ActionBar.a2 f29558c;
    public final org.telegram.ui.ActionBar.m2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.a2 a2Var, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f29556a = i10;
        this.f29557b = editTextBoldCursor;
        this.f29558c = a2Var;
        this.d = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f29556a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29557b, this.f29558c, this.d, 1));
                return;
            default:
                g5.d0(this.f29557b, this.f29558c, this.d);
                return;
        }
    }
}
