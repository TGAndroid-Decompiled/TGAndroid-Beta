package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class t01 implements Runnable {
    public final int f28018a;
    public final Runnable f28019b;
    public final Runnable f28020c;

    public t01(Runnable runnable, Runnable runnable2, int i10) {
        this.f28018a = i10;
        this.f28019b = runnable;
        this.f28020c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f28018a) {
            case 0:
                x01.b(this.f28019b);
                Runnable runnable = this.f28020c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f28019b.run();
                this.f28020c.run();
                return;
        }
    }
}
