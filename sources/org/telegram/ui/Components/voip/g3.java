package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f29279a;
    public final l3 f29280b;
    public final int f29281c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f29279a = i11;
        this.f29280b = l3Var;
        this.f29281c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29279a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f29280b, this.f29281c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f29280b, this.f29281c, 3));
                return;
            case 2:
                this.f29280b.c(this.f29281c);
                return;
            default:
                this.f29280b.a(this.f29281c);
                return;
        }
    }
}
