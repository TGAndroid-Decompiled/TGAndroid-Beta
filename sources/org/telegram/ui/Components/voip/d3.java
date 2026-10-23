package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31565a;
    public final i3 f31566b;
    public final int f31567c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31565a = i11;
        this.f31566b = i3Var;
        this.f31567c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31565a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31566b, this.f31567c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31566b, this.f31567c, 3));
                return;
            case 2:
                this.f31566b.c(this.f31567c);
                return;
            default:
                this.f31566b.a(this.f31567c);
                return;
        }
    }
}
