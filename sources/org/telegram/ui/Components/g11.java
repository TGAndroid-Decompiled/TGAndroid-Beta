package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class g11 implements Runnable {
    public final int f24312a;
    public final Runnable f24313b;
    public final Runnable f24314c;

    public g11(Runnable runnable, Runnable runnable2, int i10) {
        this.f24312a = i10;
        this.f24313b = runnable;
        this.f24314c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f24312a) {
            case 0:
                k11.b(this.f24313b);
                Runnable runnable = this.f24314c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f24313b.run();
                this.f24314c.run();
                return;
        }
    }
}
