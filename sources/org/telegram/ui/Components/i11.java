package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i11 implements Runnable {
    public final int f24970a;
    public final Runnable f24971b;
    public final Runnable f24972c;

    public i11(Runnable runnable, Runnable runnable2, int i10) {
        this.f24970a = i10;
        this.f24971b = runnable;
        this.f24972c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f24970a) {
            case 0:
                m11.b(this.f24971b);
                Runnable runnable = this.f24972c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f24971b.run();
                this.f24972c.run();
                return;
        }
    }
}
