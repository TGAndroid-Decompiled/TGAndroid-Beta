package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class u01 implements Runnable {
    public final int f28236a;
    public final Runnable f28237b;
    public final Runnable f28238c;

    public u01(Runnable runnable, Runnable runnable2, int i10) {
        this.f28236a = i10;
        this.f28237b = runnable;
        this.f28238c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f28236a) {
            case 0:
                y01.b(this.f28237b);
                Runnable runnable = this.f28238c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f28237b.run();
                this.f28238c.run();
                return;
        }
    }
}
