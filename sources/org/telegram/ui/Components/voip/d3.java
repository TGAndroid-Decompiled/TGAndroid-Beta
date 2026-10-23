package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31384a;
    public final i3 f31385b;
    public final int f31386c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31384a = i11;
        this.f31385b = i3Var;
        this.f31386c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31384a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31385b, this.f31386c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31385b, this.f31386c, 3));
                return;
            case 2:
                this.f31385b.c(this.f31386c);
                return;
            default:
                this.f31385b.a(this.f31386c);
                return;
        }
    }
}
