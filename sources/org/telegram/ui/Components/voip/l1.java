package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hk0;
public final class l1 implements Runnable {
    public final int f32087a;
    public final p1 f32088b;
    public final hk0 f32089c;

    public l1(p1 p1Var, hk0 hk0Var, int i10) {
        this.f32087a = i10;
        this.f32088b = p1Var;
        this.f32089c = hk0Var;
    }

    @Override
    public final void run() {
        switch (this.f32087a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f32088b, this.f32089c, 1));
                return;
            default:
                this.f32088b.removeView(this.f32089c);
                return;
        }
    }
}
