package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class t01 implements Runnable {
    public final int f28021a;
    public final Runnable f28022b;
    public final Runnable f28023c;

    public t01(Runnable runnable, Runnable runnable2, int i10) {
        this.f28021a = i10;
        this.f28022b = runnable;
        this.f28023c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f28021a) {
            case 0:
                x01.b(this.f28022b);
                Runnable runnable = this.f28023c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f28022b.run();
                this.f28023c.run();
                return;
        }
    }
}
