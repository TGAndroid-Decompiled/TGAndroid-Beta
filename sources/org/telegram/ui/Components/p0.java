package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f27206a;
    public final EditTextBoldCursor f27207b;
    public final org.telegram.ui.ActionBar.a2 f27208c;
    public final org.telegram.ui.ActionBar.m2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.a2 a2Var, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f27206a = i10;
        this.f27207b = editTextBoldCursor;
        this.f27208c = a2Var;
        this.d = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f27206a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f27207b, this.f27208c, this.d, 1));
                return;
            default:
                e5.e0(this.f27207b, this.f27208c, this.d);
                return;
        }
    }
}
