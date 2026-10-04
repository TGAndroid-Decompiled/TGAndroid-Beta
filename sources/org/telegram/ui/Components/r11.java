package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r11 implements Runnable {
    public final int f30253a;
    public final Runnable f30254b;
    public final Runnable f30255c;

    public r11(Runnable runnable, Runnable runnable2, int i10) {
        this.f30253a = i10;
        this.f30254b = runnable;
        this.f30255c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f30253a) {
            case 0:
                v11.b(this.f30254b);
                Runnable runnable = this.f30255c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f30254b.run();
                this.f30255c.run();
                return;
        }
    }
}
