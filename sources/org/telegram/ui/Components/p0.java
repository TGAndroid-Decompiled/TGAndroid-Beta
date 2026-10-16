package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f27803a;
    public final EditTextBoldCursor f27804b;
    public final org.telegram.ui.ActionBar.a2 f27805c;
    public final org.telegram.ui.ActionBar.m2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.a2 a2Var, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f27803a = i10;
        this.f27804b = editTextBoldCursor;
        this.f27805c = a2Var;
        this.d = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f27803a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f27804b, this.f27805c, this.d, 1));
                return;
            default:
                g5.d0(this.f27804b, this.f27805c, this.d);
                return;
        }
    }
}
