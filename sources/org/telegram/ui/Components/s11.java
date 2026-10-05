package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s11 implements Runnable {
    public final int f30650a;
    public final Runnable f30651b;
    public final Runnable f30652c;

    public s11(Runnable runnable, Runnable runnable2, int i10) {
        this.f30650a = i10;
        this.f30651b = runnable;
        this.f30652c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f30650a) {
            case 0:
                w11.b(this.f30651b);
                Runnable runnable = this.f30652c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f30651b.run();
                this.f30652c.run();
                return;
        }
    }
}
