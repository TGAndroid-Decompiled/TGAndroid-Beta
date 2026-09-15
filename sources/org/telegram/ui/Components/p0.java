package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f26916a;
    public final EditTextBoldCursor f26917b;
    public final org.telegram.ui.ActionBar.b2 f26918c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f26916a = i10;
        this.f26917b = editTextBoldCursor;
        this.f26918c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f26916a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f26917b, this.f26918c, this.d, 1));
                return;
            default:
                c5.e0(this.f26917b, this.f26918c, this.d);
                return;
        }
    }
}
