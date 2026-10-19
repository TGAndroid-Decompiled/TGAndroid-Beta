package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31430a;
    public final i3 f31431b;
    public final int f31432c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31430a = i11;
        this.f31431b = i3Var;
        this.f31432c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31430a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31431b, this.f31432c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31431b, this.f31432c, 3));
                return;
            case 2:
                this.f31431b.c(this.f31432c);
                return;
            default:
                this.f31431b.a(this.f31432c);
                return;
        }
    }
}
