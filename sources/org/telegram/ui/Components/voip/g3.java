package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f32048a;
    public final l3 f32049b;
    public final int f32050c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f32048a = i11;
        this.f32049b = l3Var;
        this.f32050c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32048a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f32049b, this.f32050c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f32049b, this.f32050c, 3));
                return;
            case 2:
                this.f32049b.c(this.f32050c);
                return;
            default:
                this.f32049b.a(this.f32050c);
                return;
        }
    }
}
