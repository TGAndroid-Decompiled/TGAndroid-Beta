package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class z11 implements Runnable {
    public final int f33487a;
    public final Runnable f33488b;
    public final Runnable f33489c;

    public z11(Runnable runnable, Runnable runnable2, int i10) {
        this.f33487a = i10;
        this.f33488b = runnable;
        this.f33489c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f33487a) {
            case 0:
                d21.b(this.f33488b);
                Runnable runnable = this.f33489c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f33488b.run();
                this.f33489c.run();
                return;
        }
    }
}
