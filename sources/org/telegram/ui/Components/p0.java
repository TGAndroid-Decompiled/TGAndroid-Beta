package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f27075a;
    public final EditTextBoldCursor f27076b;
    public final org.telegram.ui.ActionBar.b2 f27077c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f27075a = i10;
        this.f27076b = editTextBoldCursor;
        this.f27077c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f27075a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f27076b, this.f27077c, this.d, 1));
                return;
            default:
                e5.e0(this.f27076b, this.f27077c, this.d);
                return;
        }
    }
}
