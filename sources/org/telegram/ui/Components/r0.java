package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f32149a;
    public final EditTextBoldCursor f32150b;
    public final org.telegram.ui.ActionBar.c2 f32151c;
    public final org.telegram.ui.ActionBar.o2 d;

    public r0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f32149a = i10;
        this.f32150b = editTextBoldCursor;
        this.f32151c = c2Var;
        this.d = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f32149a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r0(this.f32150b, this.f32151c, this.d, 1));
                return;
            default:
                c5.e0(this.f32150b, this.f32151c, this.d);
                return;
        }
    }
}
