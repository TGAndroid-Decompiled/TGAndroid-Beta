package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29176a;
    public final EditTextBoldCursor f29177b;
    public final org.telegram.ui.ActionBar.b2 f29178c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29176a = i10;
        this.f29177b = editTextBoldCursor;
        this.f29178c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29176a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29177b, this.f29178c, this.d, 1));
                return;
            default:
                f5.d0(this.f29177b, this.f29178c, this.d);
                return;
        }
    }
}
