package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gk0;
public final class l1 implements Runnable {
    public final int f32151a;
    public final p1 f32152b;
    public final gk0 f32153c;

    public l1(p1 p1Var, gk0 gk0Var, int i10) {
        this.f32151a = i10;
        this.f32152b = p1Var;
        this.f32153c = gk0Var;
    }

    @Override
    public final void run() {
        switch (this.f32151a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f32152b, this.f32153c, 1));
                return;
            default:
                this.f32152b.removeView(this.f32153c);
                return;
        }
    }
}
