package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f28924a;
    public final k3 f28925b;
    public final int f28926c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f28924a = i11;
        this.f28925b = k3Var;
        this.f28926c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28924a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f28925b, this.f28926c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f28925b, this.f28926c, 3));
                return;
            case 2:
                this.f28925b.c(this.f28926c);
                return;
            default:
                this.f28925b.a(this.f28926c);
                return;
        }
    }
}
