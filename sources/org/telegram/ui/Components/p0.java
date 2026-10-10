package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29631a;
    public final EditTextBoldCursor f29632b;
    public final org.telegram.ui.ActionBar.b2 f29633c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29631a = i10;
        this.f29632b = editTextBoldCursor;
        this.f29633c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29631a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29632b, this.f29633c, this.d, 1));
                return;
            default:
                g5.d0(this.f29632b, this.f29633c, this.d);
                return;
        }
    }
}
