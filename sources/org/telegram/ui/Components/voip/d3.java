package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31380a;
    public final i3 f31381b;
    public final int f31382c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31380a = i11;
        this.f31381b = i3Var;
        this.f31382c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31380a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31381b, this.f31382c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31381b, this.f31382c, 3));
                return;
            case 2:
                this.f31381b.c(this.f31382c);
                return;
            default:
                this.f31381b.a(this.f31382c);
                return;
        }
    }
}
