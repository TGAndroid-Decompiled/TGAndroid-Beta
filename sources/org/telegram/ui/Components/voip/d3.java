package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31428a;
    public final i3 f31429b;
    public final int f31430c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31428a = i11;
        this.f31429b = i3Var;
        this.f31430c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31428a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31429b, this.f31430c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31429b, this.f31430c, 3));
                return;
            case 2:
                this.f31429b.c(this.f31430c);
                return;
            default:
                this.f31429b.a(this.f31430c);
                return;
        }
    }
}
