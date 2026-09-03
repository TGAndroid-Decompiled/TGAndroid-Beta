package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kj0;
public final class i1 implements Runnable {
    public final int f32094a;
    public final m1 f32095b;
    public final kj0 f32096c;

    public i1(m1 m1Var, kj0 kj0Var, int i10) {
        this.f32094a = i10;
        this.f32095b = m1Var;
        this.f32096c = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f32094a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f32095b, this.f32096c, 1));
                return;
            default:
                this.f32095b.removeView(this.f32096c);
                return;
        }
    }
}
