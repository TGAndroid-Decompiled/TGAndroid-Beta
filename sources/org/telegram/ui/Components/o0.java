package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class o0 implements Runnable {
    public final int f31241a;
    public final EditTextBoldCursor f31242b;
    public final org.telegram.ui.ActionBar.c2 f31243c;
    public final org.telegram.ui.ActionBar.o2 d;

    public o0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var, int i9) {
        this.f31241a = i9;
        this.f31242b = editTextBoldCursor;
        this.f31243c = c2Var;
        this.d = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f31241a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o0(this.f31242b, this.f31243c, this.d, 1));
                return;
            default:
                y4.e0(this.f31242b, this.f31243c, this.d);
                return;
        }
    }
}
