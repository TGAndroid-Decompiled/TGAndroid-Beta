package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31535a;
    public final i3 f31536b;
    public final int f31537c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31535a = i11;
        this.f31536b = i3Var;
        this.f31537c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31535a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31536b, this.f31537c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31536b, this.f31537c, 3));
                return;
            case 2:
                this.f31536b.c(this.f31537c);
                return;
            default:
                this.f31536b.a(this.f31537c);
                return;
        }
    }
}
