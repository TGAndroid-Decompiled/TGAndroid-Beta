package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f29243a;
    public final k3 f29244b;
    public final int f29245c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f29243a = i11;
        this.f29244b = k3Var;
        this.f29245c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29243a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f29244b, this.f29245c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f29244b, this.f29245c, 3));
                return;
            case 2:
                this.f29244b.c(this.f29245c);
                return;
            default:
                this.f29244b.a(this.f29245c);
                return;
        }
    }
}
