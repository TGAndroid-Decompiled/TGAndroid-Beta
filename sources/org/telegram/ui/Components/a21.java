package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class a21 implements Runnable {
    public final int f24417a;
    public final Runnable f24418b;
    public final Runnable f24419c;

    public a21(Runnable runnable, Runnable runnable2, int i10) {
        this.f24417a = i10;
        this.f24418b = runnable;
        this.f24419c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f24417a) {
            case 0:
                e21.b(this.f24418b);
                Runnable runnable = this.f24419c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f24418b.run();
                this.f24419c.run();
                return;
        }
    }
}
