package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j11 implements Runnable {
    public final int f25235a;
    public final Runnable f25236b;
    public final Runnable f25237c;

    public j11(Runnable runnable, Runnable runnable2, int i10) {
        this.f25235a = i10;
        this.f25236b = runnable;
        this.f25237c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f25235a) {
            case 0:
                n11.b(this.f25236b);
                Runnable runnable = this.f25237c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f25236b.run();
                this.f25237c.run();
                return;
        }
    }
}
