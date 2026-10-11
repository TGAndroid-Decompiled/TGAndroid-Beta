package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class z11 implements Runnable {
    public final int f33541a;
    public final Runnable f33542b;
    public final Runnable f33543c;

    public z11(Runnable runnable, Runnable runnable2, int i10) {
        this.f33541a = i10;
        this.f33542b = runnable;
        this.f33543c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f33541a) {
            case 0:
                d21.b(this.f33542b);
                Runnable runnable = this.f33543c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f33542b.run();
                this.f33543c.run();
                return;
        }
    }
}
