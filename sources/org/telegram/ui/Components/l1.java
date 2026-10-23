package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l1 implements Runnable {
    public final int f28194a;
    public final e5 f28195b;
    public final org.telegram.ui.ActionBar.c2 f28196c;
    public final org.telegram.ui.ActionBar.o2 d;

    public l1(e5 e5Var, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f28194a = i10;
        this.f28195b = e5Var;
        this.f28196c = c2Var;
        this.d = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f28194a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f28195b, this.f28196c, this.d, 1));
                return;
            default:
                f5.e0(this.f28195b, this.f28196c, this.d);
                return;
        }
    }
}
