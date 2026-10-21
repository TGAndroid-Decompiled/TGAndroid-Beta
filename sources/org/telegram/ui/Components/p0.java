package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29173a;
    public final EditTextBoldCursor f29174b;
    public final org.telegram.ui.ActionBar.b2 f29175c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29173a = i10;
        this.f29174b = editTextBoldCursor;
        this.f29175c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29173a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29174b, this.f29175c, this.d, 1));
                return;
            default:
                f5.d0(this.f29174b, this.f29175c, this.d);
                return;
        }
    }
}
