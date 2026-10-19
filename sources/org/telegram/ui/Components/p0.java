package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29125a;
    public final EditTextBoldCursor f29126b;
    public final org.telegram.ui.ActionBar.b2 f29127c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29125a = i10;
        this.f29126b = editTextBoldCursor;
        this.f29127c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29125a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29126b, this.f29127c, this.d, 1));
                return;
            default:
                f5.d0(this.f29126b, this.f29127c, this.d);
                return;
        }
    }
}
