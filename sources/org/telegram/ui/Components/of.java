package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class of implements Runnable {
    public final int f38175a;
    public final FrameLayout f38176b;

    public of(int i7, FrameLayout frameLayout) {
        this.f38175a = i7;
        this.f38176b = frameLayout;
    }

    @Override
    public final void run() {
        switch (this.f38175a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f38176b);
                return;
            default:
                org.telegram.messenger.g0.E2(this.f38176b);
                return;
        }
    }
}
