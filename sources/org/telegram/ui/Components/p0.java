package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29116a;
    public final EditTextBoldCursor f29117b;
    public final org.telegram.ui.ActionBar.b2 f29118c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29116a = i10;
        this.f29117b = editTextBoldCursor;
        this.f29118c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29116a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29117b, this.f29118c, this.d, 1));
                return;
            default:
                f5.d0(this.f29117b, this.f29118c, this.d);
                return;
        }
    }
}
