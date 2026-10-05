package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nj0;
public final class l1 implements Runnable {
    public final int f32036a;
    public final p1 f32037b;
    public final nj0 f32038c;

    public l1(p1 p1Var, nj0 nj0Var, int i10) {
        this.f32036a = i10;
        this.f32037b = p1Var;
        this.f32038c = nj0Var;
    }

    @Override
    public final void run() {
        switch (this.f32036a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f32037b, this.f32038c, 1));
                return;
            default:
                this.f32037b.removeView(this.f32038c);
                return;
        }
    }
}
