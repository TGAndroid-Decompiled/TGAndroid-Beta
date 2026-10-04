package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f29475a;
    public final EditTextBoldCursor f29476b;
    public final org.telegram.ui.ActionBar.b2 f29477c;
    public final org.telegram.ui.ActionBar.n2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29475a = i10;
        this.f29476b = editTextBoldCursor;
        this.f29477c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29475a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f29476b, this.f29477c, this.d, 1));
                return;
            default:
                e5.e0(this.f29476b, this.f29477c, this.d);
                return;
        }
    }
}
