package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31479a;
    public final i3 f31480b;
    public final int f31481c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31479a = i11;
        this.f31480b = i3Var;
        this.f31481c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31479a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31480b, this.f31481c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31480b, this.f31481c, 3));
                return;
            case 2:
                this.f31480b.c(this.f31481c);
                return;
            default:
                this.f31480b.a(this.f31481c);
                return;
        }
    }
}
