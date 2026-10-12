package org.telegram.ui;

import org.telegram.messenger.R;
public final class jc implements Runnable {
    public final int f39175a;
    public final fd f39176b;

    public jc(fd fdVar, int i10) {
        this.f39175a = i10;
        this.f39176b = fdVar;
    }

    @Override
    public final void run() {
        switch (this.f39175a) {
            case 0:
                fd.U(this.f39176b);
                return;
            default:
                org.telegram.messenger.v0.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.zc.a0(this.f39176b), R.raw.done, 36);
                return;
        }
    }
}
