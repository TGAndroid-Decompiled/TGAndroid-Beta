package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31426a;
    public final i3 f31427b;
    public final int f31428c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31426a = i11;
        this.f31427b = i3Var;
        this.f31428c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31426a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31427b, this.f31428c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31427b, this.f31428c, 3));
                return;
            case 2:
                this.f31427b.c(this.f31428c);
                return;
            default:
                this.f31427b.a(this.f31428c);
                return;
        }
    }
}
