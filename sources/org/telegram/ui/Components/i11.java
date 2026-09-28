package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i11 implements Runnable {
    public final int f24969a;
    public final Runnable f24970b;
    public final Runnable f24971c;

    public i11(Runnable runnable, Runnable runnable2, int i10) {
        this.f24969a = i10;
        this.f24970b = runnable;
        this.f24971c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f24969a) {
            case 0:
                m11.b(this.f24970b);
                Runnable runnable = this.f24971c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f24970b.run();
                this.f24971c.run();
                return;
        }
    }
}
