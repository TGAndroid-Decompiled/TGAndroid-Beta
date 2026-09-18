package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class u01 implements Runnable {
    public final int f28239a;
    public final Runnable f28240b;
    public final Runnable f28241c;

    public u01(Runnable runnable, Runnable runnable2, int i10) {
        this.f28239a = i10;
        this.f28240b = runnable;
        this.f28241c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f28239a) {
            case 0:
                y01.b(this.f28240b);
                Runnable runnable = this.f28241c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f28240b.run();
                this.f28241c.run();
                return;
        }
    }
}
