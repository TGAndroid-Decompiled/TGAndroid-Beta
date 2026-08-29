package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class h3 implements Runnable {
    public final int f33743a;
    public final m3 f33744b;
    public final int f33745c;

    public h3(m3 m3Var, int i10, int i11) {
        this.f33743a = i11;
        this.f33744b = m3Var;
        this.f33745c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33743a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h3(this.f33744b, this.f33745c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new h3(this.f33744b, this.f33745c, 3));
                return;
            case 2:
                this.f33744b.c(this.f33745c);
                return;
            default:
                this.f33744b.a(this.f33745c);
                return;
        }
    }
}
