package org.telegram.ui;

import org.telegram.messenger.R;
public final class fc implements Runnable {
    public final int f36392a;
    public final bd f36393b;

    public fc(bd bdVar, int i10) {
        this.f36392a = i10;
        this.f36393b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f36392a) {
            case 0:
                bd.U(this.f36393b);
                return;
            default:
                org.telegram.messenger.w1.o(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.yc.a0(this.f36393b), R.raw.done, 36);
                return;
        }
    }
}
