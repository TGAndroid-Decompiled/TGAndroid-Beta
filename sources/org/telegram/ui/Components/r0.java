package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f26509a;
    public final EditTextBoldCursor f26510b;
    public final org.telegram.ui.ActionBar.d2 f26511c;
    public final org.telegram.ui.ActionBar.p2 d;

    public r0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f26509a = i10;
        this.f26510b = editTextBoldCursor;
        this.f26511c = d2Var;
        this.d = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f26509a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r0(this.f26510b, this.f26511c, this.d, 1));
                return;
            default:
                d5.e0(this.f26510b, this.f26511c, this.d);
                return;
        }
    }
}
