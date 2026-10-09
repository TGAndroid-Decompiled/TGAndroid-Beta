package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class y11 implements Runnable {
    public final int f33099a;
    public final Runnable f33100b;
    public final Runnable f33101c;

    public y11(Runnable runnable, Runnable runnable2, int i10) {
        this.f33099a = i10;
        this.f33100b = runnable;
        this.f33101c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f33099a) {
            case 0:
                c21.b(this.f33100b);
                Runnable runnable = this.f33101c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f33100b.run();
                this.f33101c.run();
                return;
        }
    }
}
