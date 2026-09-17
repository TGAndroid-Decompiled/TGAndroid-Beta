package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class q0 implements Runnable {
    public final int f29555a;
    public final EditTextBoldCursor f29556b;
    public final org.telegram.ui.ActionBar.b2 f29557c;
    public final org.telegram.ui.ActionBar.n2 d;

    public q0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f29555a = i10;
        this.f29556b = editTextBoldCursor;
        this.f29557c = b2Var;
        this.d = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f29555a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0(this.f29556b, this.f29557c, this.d, 1));
                return;
            default:
                e5.e0(this.f29556b, this.f29557c, this.d);
                return;
        }
    }
}
