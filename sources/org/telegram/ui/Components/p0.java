package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29480a;
    public final EditTextBoldCursor f29481b;
    public final org.telegram.ui.ActionBar.b2 f29482c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29480a = i10;
        this.f29481b = editTextBoldCursor;
        this.f29482c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29480a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29481b, this.f29482c, this.d, 1));
                return;
            default:
                e5.e0(this.f29481b, this.f29482c, this.d);
                return;
        }
    }
}
