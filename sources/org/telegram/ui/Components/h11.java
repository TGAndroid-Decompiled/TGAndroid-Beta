package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class h11 implements Runnable {
    public final int f24522a;
    public final Runnable f24523b;
    public final Runnable f24524c;

    public h11(Runnable runnable, Runnable runnable2, int i10) {
        this.f24522a = i10;
        this.f24523b = runnable;
        this.f24524c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f24522a) {
            case 0:
                l11.b(this.f24523b);
                Runnable runnable = this.f24524c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            default:
                this.f24523b.run();
                this.f24524c.run();
                return;
        }
    }
}
