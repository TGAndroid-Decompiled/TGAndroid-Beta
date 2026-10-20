package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29172a;
    public final EditTextBoldCursor f29173b;
    public final org.telegram.ui.ActionBar.b2 f29174c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29172a = i10;
        this.f29173b = editTextBoldCursor;
        this.f29174c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29172a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29173b, this.f29174c, this.d, 1));
                return;
            default:
                f5.d0(this.f29173b, this.f29174c, this.d);
                return;
        }
    }
}
