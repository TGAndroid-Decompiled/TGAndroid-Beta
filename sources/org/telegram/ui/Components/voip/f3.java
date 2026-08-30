package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f29629a;
    public final k3 f29630b;
    public final int f29631c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f29629a = i11;
        this.f29630b = k3Var;
        this.f29631c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29629a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f29630b, this.f29631c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f29630b, this.f29631c, 3));
                return;
            case 2:
                this.f29630b.c(this.f29631c);
                return;
            default:
                this.f29630b.a(this.f29631c);
                return;
        }
    }
}
