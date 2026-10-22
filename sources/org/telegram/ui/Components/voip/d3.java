package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31383a;
    public final i3 f31384b;
    public final int f31385c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31383a = i11;
        this.f31384b = i3Var;
        this.f31385c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31383a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31384b, this.f31385c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31384b, this.f31385c, 3));
                return;
            case 2:
                this.f31384b.c(this.f31385c);
                return;
            default:
                this.f31384b.a(this.f31385c);
                return;
        }
    }
}
