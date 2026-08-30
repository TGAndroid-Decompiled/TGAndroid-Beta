package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f27700a;
    public final EditTextBoldCursor f27701b;
    public final org.telegram.ui.ActionBar.d2 f27702c;
    public final org.telegram.ui.ActionBar.p2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f27700a = i10;
        this.f27701b = editTextBoldCursor;
        this.f27702c = d2Var;
        this.d = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f27700a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f27701b, this.f27702c, this.d, 1));
                return;
            default:
                z4.e0(this.f27701b, this.f27702c, this.d);
                return;
        }
    }
}
