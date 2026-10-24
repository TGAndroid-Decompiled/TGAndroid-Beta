package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class g1 implements Runnable {
    public final int f26514a;
    public final c5 f26515b;
    public final org.telegram.ui.ActionBar.c2 f26516c;
    public final org.telegram.ui.ActionBar.o2 d;

    public g1(c5 c5Var, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f26514a = i10;
        this.f26515b = c5Var;
        this.f26516c = c2Var;
        this.d = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f26514a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g1(this.f26515b, this.f26516c, this.d, 1));
                return;
            default:
                d5.d0(this.f26515b, this.f26516c, this.d);
                return;
        }
    }
}
