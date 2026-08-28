package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class e3 implements Runnable {
    public final int f33499a;
    public final j3 f33500b;
    public final int f33501c;

    public e3(j3 j3Var, int i9, int i10) {
        this.f33499a = i10;
        this.f33500b = j3Var;
        this.f33501c = i9;
    }

    @Override
    public final void run() {
        switch (this.f33499a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e3(this.f33500b, this.f33501c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new e3(this.f33500b, this.f33501c, 3));
                return;
            case 2:
                this.f33500b.c(this.f33501c);
                return;
            default:
                this.f33500b.a(this.f33501c);
                return;
        }
    }
}
