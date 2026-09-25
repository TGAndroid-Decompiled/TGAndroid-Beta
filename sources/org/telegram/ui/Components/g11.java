package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class g11 implements Runnable {
    public final int f24330a;
    public final Runnable f24331b;
    public final Runnable f24332c;

    public g11(Runnable runnable, Runnable runnable2, int i10) {
        this.f24330a = i10;
        this.f24331b = runnable;
        this.f24332c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f24330a) {
            case 0:
                k11.b(this.f24331b);
                Runnable runnable = this.f24332c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f24331b.run();
                this.f24332c.run();
                return;
        }
    }
}
