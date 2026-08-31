package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lj0;
public final class i1 implements Runnable {
    public final int f32089a;
    public final m1 f32090b;
    public final lj0 f32091c;

    public i1(m1 m1Var, lj0 lj0Var, int i10) {
        this.f32089a = i10;
        this.f32090b = m1Var;
        this.f32091c = lj0Var;
    }

    @Override
    public final void run() {
        switch (this.f32089a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f32090b, this.f32091c, 1));
                return;
            default:
                this.f32090b.removeView(this.f32091c);
                return;
        }
    }
}
