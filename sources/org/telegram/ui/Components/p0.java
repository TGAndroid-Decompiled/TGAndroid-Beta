package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f27228a;
    public final EditTextBoldCursor f27229b;
    public final org.telegram.ui.ActionBar.c2 f27230c;
    public final org.telegram.ui.ActionBar.o2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f27228a = i10;
        this.f27229b = editTextBoldCursor;
        this.f27230c = c2Var;
        this.d = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f27228a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f27229b, this.f27230c, this.d, 1));
                return;
            default:
                e5.e0(this.f27229b, this.f27230c, this.d);
                return;
        }
    }
}
