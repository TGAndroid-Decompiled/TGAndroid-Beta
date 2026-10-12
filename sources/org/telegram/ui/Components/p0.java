package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29336a;
    public final EditTextBoldCursor f29337b;
    public final org.telegram.ui.ActionBar.a2 f29338c;
    public final org.telegram.ui.ActionBar.m2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.a2 a2Var, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f29336a = i10;
        this.f29337b = editTextBoldCursor;
        this.f29338c = a2Var;
        this.d = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f29336a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29337b, this.f29338c, this.d, 1));
                return;
            default:
                g5.d0(this.f29337b, this.f29338c, this.d);
                return;
        }
    }
}
