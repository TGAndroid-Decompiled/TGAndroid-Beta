package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f28117a;
    public final EditTextBoldCursor f28118b;
    public final org.telegram.ui.ActionBar.a2 f28119c;
    public final org.telegram.ui.ActionBar.m2 d;

    public p0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.a2 a2Var, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f28117a = i10;
        this.f28118b = editTextBoldCursor;
        this.f28119c = a2Var;
        this.d = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f28117a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f28118b, this.f28119c, this.d, 1));
                return;
            default:
                g5.d0(this.f28118b, this.f28119c, this.d);
                return;
        }
    }
}
