package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class d3 implements Runnable {
    public final int f31452a;
    public final i3 f31453b;
    public final int f31454c;

    public d3(i3 i3Var, int i10, int i11) {
        this.f31452a = i11;
        this.f31453b = i3Var;
        this.f31454c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31452a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d3(this.f31453b, this.f31454c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d3(this.f31453b, this.f31454c, 3));
                return;
            case 2:
                this.f31453b.c(this.f31454c);
                return;
            default:
                this.f31453b.a(this.f31454c);
                return;
        }
    }
}
