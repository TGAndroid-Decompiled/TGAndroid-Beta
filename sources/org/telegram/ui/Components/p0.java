package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f26899a;
    public final EditTextBoldCursor f26900b;
    public final org.telegram.ui.ActionBar.c2 f26901c;
    public final org.telegram.ui.ActionBar.o2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f26899a = i10;
        this.f26900b = editTextBoldCursor;
        this.f26901c = c2Var;
        this.d = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f26899a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f26900b, this.f26901c, this.d, 1));
                return;
            default:
                c5.e0(this.f26900b, this.f26901c, this.d);
                return;
        }
    }
}
