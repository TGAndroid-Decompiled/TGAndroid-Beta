package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gk0;
public final class k1 implements Runnable {
    public final int f32093a;
    public final o1 f32094b;
    public final gk0 f32095c;

    public k1(o1 o1Var, gk0 gk0Var, int i10) {
        this.f32093a = i10;
        this.f32094b = o1Var;
        this.f32095c = gk0Var;
    }

    @Override
    public final void run() {
        switch (this.f32093a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f32094b, this.f32095c, 1));
                return;
            default:
                this.f32094b.removeView(this.f32095c);
                return;
        }
    }
}
