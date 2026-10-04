package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r11 implements Runnable {
    public final int f30246a;
    public final Runnable f30247b;
    public final Runnable f30248c;

    public r11(Runnable runnable, Runnable runnable2, int i10) {
        this.f30246a = i10;
        this.f30247b = runnable;
        this.f30248c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f30246a) {
            case 0:
                v11.b(this.f30247b);
                Runnable runnable = this.f30248c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f30247b.run();
                this.f30248c.run();
                return;
        }
    }
}
