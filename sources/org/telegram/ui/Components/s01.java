package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s01 implements Runnable {
    public final int f30149a;
    public final Runnable f30150b;
    public final Runnable f30151c;

    public s01(Runnable runnable, Runnable runnable2, int i10) {
        this.f30149a = i10;
        this.f30150b = runnable;
        this.f30151c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f30149a) {
            case 0:
                w01.b(this.f30150b);
                Runnable runnable = this.f30151c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f30150b.run();
                this.f30151c.run();
                return;
        }
    }
}
