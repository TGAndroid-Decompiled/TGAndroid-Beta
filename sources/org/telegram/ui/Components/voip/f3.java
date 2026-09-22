package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f28944a;
    public final k3 f28945b;
    public final int f28946c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f28944a = i11;
        this.f28945b = k3Var;
        this.f28946c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28944a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f28945b, this.f28946c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f28945b, this.f28946c, 3));
                return;
            case 2:
                this.f28945b.c(this.f28946c);
                return;
            default:
                this.f28945b.a(this.f28946c);
                return;
        }
    }
}
