package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31478a;
    public final i3 f31479b;
    public final int f31480c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31478a = i11;
        this.f31479b = i3Var;
        this.f31480c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31478a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31479b, this.f31480c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31479b, this.f31480c, 3));
                return;
            case 2:
                this.f31479b.c(this.f31480c);
                return;
            default:
                this.f31479b.a(this.f31480c);
                return;
        }
    }
}
