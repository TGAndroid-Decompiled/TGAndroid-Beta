package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class e3 implements Runnable {
    public final int f29835a;
    public final j3 f29836b;
    public final int f29837c;

    public e3(j3 j3Var, int i10, int i11) {
        this.f29835a = i11;
        this.f29836b = j3Var;
        this.f29837c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29835a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e3(this.f29836b, this.f29837c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new e3(this.f29836b, this.f29837c, 3));
                return;
            case 2:
                this.f29836b.c(this.f29837c);
                return;
            default:
                this.f29836b.a(this.f29837c);
                return;
        }
    }
}
