package org.telegram.ui;

import org.telegram.messenger.R;
public final class fc implements Runnable {
    public final int f37669a;
    public final ad f37670b;

    public fc(ad adVar, int i10) {
        this.f37669a = i10;
        this.f37670b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f37669a) {
            case 0:
                ad.U(this.f37670b);
                return;
            default:
                org.telegram.messenger.q.q(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.ad.a0(this.f37670b), R.raw.done, 36);
                return;
        }
    }
}
