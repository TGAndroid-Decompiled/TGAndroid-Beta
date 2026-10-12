package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class e3 implements Runnable {
    public final int f30166a;
    public final j3 f30167b;
    public final int f30168c;

    public e3(j3 j3Var, int i10, int i11) {
        this.f30166a = i11;
        this.f30167b = j3Var;
        this.f30168c = i10;
    }

    @Override
    public final void run() {
        switch (this.f30166a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e3(this.f30167b, this.f30168c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new e3(this.f30167b, this.f30168c, 3));
                return;
            case 2:
                this.f30167b.c(this.f30168c);
                return;
            default:
                this.f30167b.a(this.f30168c);
                return;
        }
    }
}
