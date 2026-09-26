package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class h11 implements Runnable {
    public final int f24637a;
    public final Runnable f24638b;
    public final Runnable f24639c;

    public h11(Runnable runnable, Runnable runnable2, int i10) {
        this.f24637a = i10;
        this.f24638b = runnable;
        this.f24639c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f24637a) {
            case 0:
                l11.b(this.f24638b);
                Runnable runnable = this.f24639c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f24638b.run();
                this.f24639c.run();
                return;
        }
    }
}
