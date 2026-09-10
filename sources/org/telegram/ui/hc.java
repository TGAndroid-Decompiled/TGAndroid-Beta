package org.telegram.ui;

import org.telegram.messenger.R;
public final class hc implements Runnable {
    public final int f33342a;
    public final cd f33343b;

    public hc(cd cdVar, int i10) {
        this.f33342a = i10;
        this.f33343b = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f33342a) {
            case 0:
                cd.U(this.f33343b);
                return;
            default:
                org.telegram.messenger.a2.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.wc.a0(this.f33343b), R.raw.done, 36);
                return;
        }
    }
}
