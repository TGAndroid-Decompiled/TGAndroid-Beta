package org.telegram.ui;

import org.telegram.messenger.R;
public final class ec implements Runnable {
    public final int f33980a;
    public final bd f33981b;

    public ec(bd bdVar, int i10) {
        this.f33980a = i10;
        this.f33981b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f33980a) {
            case 0:
                bd.U(this.f33981b);
                return;
            default:
                kh.a2.v(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.qc.a0(this.f33981b), R.raw.done, 36);
                return;
        }
    }
}
