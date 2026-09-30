package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i11 implements Runnable {
    public final int f24949a;
    public final Runnable f24950b;
    public final Runnable f24951c;

    public i11(Runnable runnable, Runnable runnable2, int i10) {
        this.f24949a = i10;
        this.f24950b = runnable;
        this.f24951c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f24949a) {
            case 0:
                m11.b(this.f24950b);
                Runnable runnable = this.f24951c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f24950b.run();
                this.f24951c.run();
                return;
        }
    }
}
