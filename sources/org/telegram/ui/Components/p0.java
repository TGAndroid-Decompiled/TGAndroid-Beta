package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f26902a;
    public final EditTextBoldCursor f26903b;
    public final org.telegram.ui.ActionBar.c2 f26904c;
    public final org.telegram.ui.ActionBar.o2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f26902a = i10;
        this.f26903b = editTextBoldCursor;
        this.f26904c = c2Var;
        this.d = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f26902a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f26903b, this.f26904c, this.d, 1));
                return;
            default:
                c5.e0(this.f26903b, this.f26904c, this.d);
                return;
        }
    }
}
