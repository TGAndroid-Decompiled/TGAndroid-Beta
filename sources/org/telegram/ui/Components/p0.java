package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f27696a;
    public final EditTextBoldCursor f27697b;
    public final org.telegram.ui.ActionBar.d2 f27698c;
    public final org.telegram.ui.ActionBar.p2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f27696a = i10;
        this.f27697b = editTextBoldCursor;
        this.f27698c = d2Var;
        this.d = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f27696a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f27697b, this.f27698c, this.d, 1));
                return;
            default:
                z4.e0(this.f27697b, this.f27698c, this.d);
                return;
        }
    }
}
