package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class r11 implements Runnable {
    public final int f30247a;
    public final Runnable f30248b;
    public final Runnable f30249c;

    public r11(Runnable runnable, Runnable runnable2, int i10) {
        this.f30247a = i10;
        this.f30248b = runnable;
        this.f30249c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f30247a) {
            case 0:
                v11.b(this.f30248b);
                Runnable runnable = this.f30249c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f30248b.run();
                this.f30249c.run();
                return;
        }
    }
}
