package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f32053a;
    public final l3 f32054b;
    public final int f32055c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f32053a = i11;
        this.f32054b = l3Var;
        this.f32055c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32053a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f32054b, this.f32055c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f32054b, this.f32055c, 3));
                return;
            case 2:
                this.f32054b.c(this.f32055c);
                return;
            default:
                this.f32054b.a(this.f32055c);
                return;
        }
    }
}
