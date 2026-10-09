package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f31935a;
    public final k3 f31936b;
    public final int f31937c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f31935a = i11;
        this.f31936b = k3Var;
        this.f31937c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31935a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f31936b, this.f31937c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f31936b, this.f31937c, 3));
                return;
            case 2:
                this.f31936b.c(this.f31937c);
                return;
            default:
                this.f31936b.a(this.f31937c);
                return;
        }
    }
}
