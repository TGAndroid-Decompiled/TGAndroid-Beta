package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class df implements Runnable {
    public final int f33926a;
    public final FrameLayout f33927b;

    public df(int i7, FrameLayout frameLayout) {
        this.f33926a = i7;
        this.f33927b = frameLayout;
    }

    @Override
    public final void run() {
        switch (this.f33926a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f33927b);
                return;
            default:
                org.telegram.messenger.g0.E2(this.f33927b);
                return;
        }
    }
}
