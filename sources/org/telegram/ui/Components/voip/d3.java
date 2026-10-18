package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31419a;
    public final i3 f31420b;
    public final int f31421c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31419a = i11;
        this.f31420b = i3Var;
        this.f31421c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31419a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31420b, this.f31421c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31420b, this.f31421c, 3));
                return;
            case 2:
                this.f31420b.c(this.f31421c);
                return;
            default:
                this.f31420b.a(this.f31421c);
                return;
        }
    }
}
