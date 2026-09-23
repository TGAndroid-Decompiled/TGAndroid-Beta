package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s01 implements Runnable {
    public final int f27775a;
    public final Runnable f27776b;
    public final Runnable f27777c;

    public s01(Runnable runnable, Runnable runnable2, int i10) {
        this.f27775a = i10;
        this.f27776b = runnable;
        this.f27777c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f27775a) {
            case 0:
                w01.b(this.f27776b);
                Runnable runnable = this.f27777c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f27776b.run();
                this.f27777c.run();
                return;
        }
    }
}
