package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f29350a;
    public final k3 f29351b;
    public final int f29352c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f29350a = i11;
        this.f29351b = k3Var;
        this.f29352c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29350a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f29351b, this.f29352c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f29351b, this.f29352c, 3));
                return;
            case 2:
                this.f29351b.c(this.f29352c);
                return;
            default:
                this.f29351b.a(this.f29352c);
                return;
        }
    }
}
