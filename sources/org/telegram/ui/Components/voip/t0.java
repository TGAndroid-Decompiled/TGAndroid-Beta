package org.telegram.ui.Components.voip;

import org.telegram.ui.Components.ei0;
public final class t0 implements Runnable {
    public final int f31663a;
    public final jg.b1 f31664b;
    public final ei0 f31665c;

    public t0(jg.b1 b1Var, ei0 ei0Var, int i10) {
        this.f31663a = i10;
        this.f31664b = b1Var;
        this.f31665c = ei0Var;
    }

    @Override
    public final void run() {
        switch (this.f31663a) {
            case 0:
                org.telegram.messenger.i0.g3(new t0(this.f31664b, this.f31665c, 1));
                return;
            default:
                this.f31664b.removeView(this.f31665c);
                return;
        }
    }
}
