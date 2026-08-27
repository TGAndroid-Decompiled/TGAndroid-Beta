package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class o0 implements Runnable {

    public final int f31122a;

    public final EditTextBoldCursor f31123b;

    public final org.telegram.ui.ActionBar.b2 f31124c;
    public final org.telegram.ui.ActionBar.n2 d;

    public o0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f31122a = i10;
        this.f31123b = editTextBoldCursor;
        this.f31124c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f31122a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o0(this.f31123b, this.f31124c, this.d, 1));
                break;
            default:
                y4.e0(this.f31123b, this.f31124c, this.d);
                break;
        }
    }
}
