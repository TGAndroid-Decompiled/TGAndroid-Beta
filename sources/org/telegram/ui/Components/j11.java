package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j11 implements Runnable {
    public final int f25261a;
    public final Runnable f25262b;
    public final Runnable f25263c;

    public j11(Runnable runnable, Runnable runnable2, int i10) {
        this.f25261a = i10;
        this.f25262b = runnable;
        this.f25263c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f25261a) {
            case 0:
                n11.b(this.f25262b);
                Runnable runnable = this.f25263c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f25262b.run();
                this.f25263c.run();
                return;
        }
    }
}
