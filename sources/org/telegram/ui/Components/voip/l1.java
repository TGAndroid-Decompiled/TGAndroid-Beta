package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nj0;
public final class l1 implements Runnable {
    public final int f29392a;
    public final p1 f29393b;
    public final nj0 f29394c;

    public l1(p1 p1Var, nj0 nj0Var, int i10) {
        this.f29392a = i10;
        this.f29393b = p1Var;
        this.f29394c = nj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29392a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f29393b, this.f29394c, 1));
                return;
            default:
                this.f29393b.removeView(this.f29394c);
                return;
        }
    }
}
