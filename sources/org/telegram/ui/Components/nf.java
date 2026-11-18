package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class nf implements Runnable {
    public final int f37778a;
    public final FrameLayout f37779b;

    public nf(int i7, FrameLayout frameLayout) {
        this.f37778a = i7;
        this.f37779b = frameLayout;
    }

    @Override
    public final void run() {
        switch (this.f37778a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f37779b);
                return;
            default:
                org.telegram.messenger.g0.E2(this.f37779b);
                return;
        }
    }
}
