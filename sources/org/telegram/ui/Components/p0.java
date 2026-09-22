package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f27211a;
    public final EditTextBoldCursor f27212b;
    public final org.telegram.ui.ActionBar.b2 f27213c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f27211a = i10;
        this.f27212b = editTextBoldCursor;
        this.f27213c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f27211a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f27212b, this.f27213c, this.d, 1));
                return;
            default:
                d5.e0(this.f27212b, this.f27213c, this.d);
                return;
        }
    }
}
