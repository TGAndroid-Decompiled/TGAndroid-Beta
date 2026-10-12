package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class e21 implements Runnable {
    public final int f25555a;
    public final Runnable f25556b;
    public final Runnable f25557c;

    public e21(Runnable runnable, Runnable runnable2, int i10) {
        this.f25555a = i10;
        this.f25556b = runnable;
        this.f25557c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f25555a) {
            case 0:
                i21.b(this.f25556b);
                Runnable runnable = this.f25557c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f25556b.run();
                this.f25557c.run();
                return;
        }
    }
}
