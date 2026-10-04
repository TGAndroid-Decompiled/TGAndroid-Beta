package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29474a;
    public final EditTextBoldCursor f29475b;
    public final org.telegram.ui.ActionBar.b2 f29476c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29474a = i10;
        this.f29475b = editTextBoldCursor;
        this.f29476c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29474a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29475b, this.f29476c, this.d, 1));
                return;
            default:
                e5.e0(this.f29475b, this.f29476c, this.d);
                return;
        }
    }
}
