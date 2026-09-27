package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i11 implements Runnable {
    public final int f24984a;
    public final Runnable f24985b;
    public final Runnable f24986c;

    public i11(Runnable runnable, Runnable runnable2, int i10) {
        this.f24984a = i10;
        this.f24985b = runnable;
        this.f24986c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f24984a) {
            case 0:
                m11.b(this.f24985b);
                Runnable runnable = this.f24986c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f24985b.run();
                this.f24986c.run();
                return;
        }
    }
}
