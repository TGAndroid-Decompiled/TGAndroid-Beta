package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f33814a;
    public final l3 f33815b;
    public final int f33816c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f33814a = i11;
        this.f33815b = l3Var;
        this.f33816c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33814a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f33815b, this.f33816c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f33815b, this.f33816c, 3));
                return;
            case 2:
                this.f33815b.c(this.f33816c);
                return;
            default:
                this.f33815b.a(this.f33816c);
                return;
        }
    }
}
