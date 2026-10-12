package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29339a;
    public final EditTextBoldCursor f29340b;
    public final org.telegram.ui.ActionBar.a2 f29341c;
    public final org.telegram.ui.ActionBar.m2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.a2 a2Var, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f29339a = i10;
        this.f29340b = editTextBoldCursor;
        this.f29341c = a2Var;
        this.d = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f29339a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29340b, this.f29341c, this.d, 1));
                return;
            default:
                g5.d0(this.f29340b, this.f29341c, this.d);
                return;
        }
    }
}
