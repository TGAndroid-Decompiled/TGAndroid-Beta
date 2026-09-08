package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s01 implements Runnable {
    public final int f30175a;
    public final Runnable f30176b;
    public final Runnable f30177c;

    public s01(Runnable runnable, Runnable runnable2, int i10) {
        this.f30175a = i10;
        this.f30176b = runnable;
        this.f30177c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f30175a) {
            case 0:
                w01.b(this.f30176b);
                Runnable runnable = this.f30177c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f30176b.run();
                this.f30177c.run();
                return;
        }
    }
}
