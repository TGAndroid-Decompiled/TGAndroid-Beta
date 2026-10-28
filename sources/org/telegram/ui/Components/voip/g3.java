package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f33919a;
    public final l3 f33920b;
    public final int f33921c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f33919a = i11;
        this.f33920b = l3Var;
        this.f33921c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33919a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f33920b, this.f33921c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f33920b, this.f33921c, 3));
                return;
            case 2:
                this.f33920b.c(this.f33921c);
                return;
            default:
                this.f33920b.a(this.f33921c);
                return;
        }
    }
}
