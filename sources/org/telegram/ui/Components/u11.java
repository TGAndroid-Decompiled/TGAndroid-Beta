package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class u11 implements Runnable {
    public final int f29567a;
    public final Runnable f29568b;
    public final Runnable f29569c;

    public u11(Runnable runnable, Runnable runnable2, int i10) {
        this.f29567a = i10;
        this.f29568b = runnable;
        this.f29569c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f29567a) {
            case 0:
                y11.b(this.f29568b);
                Runnable runnable = this.f29569c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f29568b.run();
                this.f29569c.run();
                return;
        }
    }
}
