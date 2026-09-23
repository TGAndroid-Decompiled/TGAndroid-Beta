package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f26891a;
    public final EditTextBoldCursor f26892b;
    public final org.telegram.ui.ActionBar.b2 f26893c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f26891a = i10;
        this.f26892b = editTextBoldCursor;
        this.f26893c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f26891a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f26892b, this.f26893c, this.d, 1));
                return;
            default:
                e5.e0(this.f26892b, this.f26893c, this.d);
                return;
        }
    }
}
