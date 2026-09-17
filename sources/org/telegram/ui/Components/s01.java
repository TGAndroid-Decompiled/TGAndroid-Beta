package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s01 implements Runnable {
    public final int f30176a;
    public final Runnable f30177b;
    public final Runnable f30178c;

    public s01(Runnable runnable, Runnable runnable2, int i10) {
        this.f30176a = i10;
        this.f30177b = runnable;
        this.f30178c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f30176a) {
            case 0:
                w01.b(this.f30177b);
                Runnable runnable = this.f30178c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f30177b.run();
                this.f30178c.run();
                return;
        }
    }
}
