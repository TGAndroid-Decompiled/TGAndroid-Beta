package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f28918a;
    public final k3 f28919b;
    public final int f28920c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f28918a = i11;
        this.f28919b = k3Var;
        this.f28920c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28918a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f28919b, this.f28920c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f28919b, this.f28920c, 3));
                return;
            case 2:
                this.f28919b.c(this.f28920c);
                return;
            default:
                this.f28919b.a(this.f28920c);
                return;
        }
    }
}
