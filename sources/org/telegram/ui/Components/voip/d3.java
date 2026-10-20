package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31379a;
    public final i3 f31380b;
    public final int f31381c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31379a = i11;
        this.f31380b = i3Var;
        this.f31381c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31379a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31380b, this.f31381c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31380b, this.f31381c, 3));
                return;
            case 2:
                this.f31380b.c(this.f31381c);
                return;
            default:
                this.f31380b.a(this.f31381c);
                return;
        }
    }
}
