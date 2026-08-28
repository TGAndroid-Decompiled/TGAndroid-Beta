package org.telegram.ui;

import org.telegram.messenger.R;
public final class ac implements Runnable {
    public final int f36450a;
    public final xc f36451b;

    public ac(xc xcVar, int i9) {
        this.f36450a = i9;
        this.f36451b = xcVar;
    }

    @Override
    public final void run() {
        switch (this.f36450a) {
            case 0:
                xc.T(this.f36451b);
                return;
            default:
                org.telegram.messenger.l0.p(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.oc.a0(this.f36451b), R.raw.done, 36);
                return;
        }
    }
}
