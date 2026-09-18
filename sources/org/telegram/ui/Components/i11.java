package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i11 implements Runnable {
    public final int f24819a;
    public final Runnable f24820b;
    public final Runnable f24821c;

    public i11(Runnable runnable, Runnable runnable2, int i10) {
        this.f24819a = i10;
        this.f24820b = runnable;
        this.f24821c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f24819a) {
            case 0:
                m11.b(this.f24820b);
                Runnable runnable = this.f24821c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f24820b.run();
                this.f24821c.run();
                return;
        }
    }
}
