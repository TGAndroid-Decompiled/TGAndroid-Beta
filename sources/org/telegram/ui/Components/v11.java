package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class v11 implements Runnable {
    public final int f29533a;
    public final Runnable f29534b;
    public final Runnable f29535c;

    public v11(Runnable runnable, Runnable runnable2, int i10) {
        this.f29533a = i10;
        this.f29534b = runnable;
        this.f29535c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f29533a) {
            case 0:
                z11.b(this.f29534b);
                Runnable runnable = this.f29535c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f29534b.run();
                this.f29535c.run();
                return;
        }
    }
}
