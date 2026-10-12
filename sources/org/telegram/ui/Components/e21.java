package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e21 implements Runnable {
    public final int f25550a;
    public final Runnable f25551b;
    public final Runnable f25552c;

    public e21(Runnable runnable, Runnable runnable2, int i10) {
        this.f25550a = i10;
        this.f25551b = runnable;
        this.f25552c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f25550a) {
            case 0:
                i21.b(this.f25551b);
                Runnable runnable = this.f25552c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f25551b.run();
                this.f25552c.run();
                return;
        }
    }
}
