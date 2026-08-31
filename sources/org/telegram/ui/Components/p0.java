package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29908a;
    public final EditTextBoldCursor f29909b;
    public final org.telegram.ui.ActionBar.d2 f29910c;
    public final org.telegram.ui.ActionBar.p2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f29908a = i10;
        this.f29909b = editTextBoldCursor;
        this.f29910c = d2Var;
        this.d = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f29908a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29909b, this.f29910c, this.d, 1));
                return;
            default:
                z4.e0(this.f29909b, this.f29910c, this.d);
                return;
        }
    }
}
