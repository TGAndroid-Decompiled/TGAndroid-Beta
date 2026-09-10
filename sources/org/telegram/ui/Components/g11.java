package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class g11 implements Runnable {
    public final int f23205a;
    public final Runnable f23206b;
    public final Runnable f23207c;

    public g11(Runnable runnable, Runnable runnable2, int i10) {
        this.f23205a = i10;
        this.f23206b = runnable;
        this.f23207c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f23205a) {
            case 0:
                k11.b(this.f23206b);
                Runnable runnable = this.f23207c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f23206b.run();
                this.f23207c.run();
                return;
        }
    }
}
