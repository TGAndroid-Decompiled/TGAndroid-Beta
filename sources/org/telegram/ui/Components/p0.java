package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29123a;
    public final EditTextBoldCursor f29124b;
    public final org.telegram.ui.ActionBar.b2 f29125c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29123a = i10;
        this.f29124b = editTextBoldCursor;
        this.f29125c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29123a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29124b, this.f29125c, this.d, 1));
                return;
            default:
                f5.d0(this.f29124b, this.f29125c, this.d);
                return;
        }
    }
}
