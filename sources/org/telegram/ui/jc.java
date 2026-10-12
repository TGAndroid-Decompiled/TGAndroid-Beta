package org.telegram.ui;

import org.telegram.messenger.R;
public final class jc implements Runnable {
    public final int f39177a;
    public final fd f39178b;

    public jc(fd fdVar, int i10) {
        this.f39177a = i10;
        this.f39178b = fdVar;
    }

    @Override
    public final void run() {
        switch (this.f39177a) {
            case 0:
                fd.U(this.f39178b);
                return;
            default:
                org.telegram.messenger.v0.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.zc.a0(this.f39178b), R.raw.done, 36);
                return;
        }
    }
}
