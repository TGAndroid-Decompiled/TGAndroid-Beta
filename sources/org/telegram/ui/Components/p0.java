package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29616a;
    public final EditTextBoldCursor f29617b;
    public final org.telegram.ui.ActionBar.b2 f29618c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29616a = i10;
        this.f29617b = editTextBoldCursor;
        this.f29618c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29616a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29617b, this.f29618c, this.d, 1));
                return;
            default:
                g5.d0(this.f29617b, this.f29618c, this.d);
                return;
        }
    }
}
