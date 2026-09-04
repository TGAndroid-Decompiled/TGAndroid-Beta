package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31451a;
    public final i3 f31452b;
    public final int f31453c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31451a = i11;
        this.f31452b = i3Var;
        this.f31453c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31451a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31452b, this.f31453c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31452b, this.f31453c, 3));
                return;
            case 2:
                this.f31452b.c(this.f31453c);
                return;
            default:
                this.f31452b.a(this.f31453c);
                return;
        }
    }
}
