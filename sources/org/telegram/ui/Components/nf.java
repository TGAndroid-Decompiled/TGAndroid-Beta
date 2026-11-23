package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class nf implements Runnable {
    public final int f37820a;
    public final FrameLayout f37821b;

    public nf(int i7, FrameLayout frameLayout) {
        this.f37820a = i7;
        this.f37821b = frameLayout;
    }

    @Override
    public final void run() {
        switch (this.f37820a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f37821b);
                return;
            default:
                org.telegram.messenger.g0.E2(this.f37821b);
                return;
        }
    }
}
