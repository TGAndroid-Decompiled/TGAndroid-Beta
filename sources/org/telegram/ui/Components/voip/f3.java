package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f29601a;
    public final k3 f29602b;
    public final int f29603c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f29601a = i11;
        this.f29602b = k3Var;
        this.f29603c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29601a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f29602b, this.f29603c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f29602b, this.f29603c, 3));
                return;
            case 2:
                this.f29602b.c(this.f29603c);
                return;
            default:
                this.f29602b.a(this.f29603c);
                return;
        }
    }
}
