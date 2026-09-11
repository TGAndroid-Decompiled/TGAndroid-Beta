package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s01 implements Runnable {
    public final int f30148a;
    public final Runnable f30149b;
    public final Runnable f30150c;

    public s01(Runnable runnable, Runnable runnable2, int i10) {
        this.f30148a = i10;
        this.f30149b = runnable;
        this.f30150c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f30148a) {
            case 0:
                w01.b(this.f30149b);
                Runnable runnable = this.f30150c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f30149b.run();
                this.f30150c.run();
                return;
        }
    }
}
