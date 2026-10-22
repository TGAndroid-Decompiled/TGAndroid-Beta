package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class z7 implements Runnable {
    public final int f20211a;
    public final MediaDataController f20212b;
    public final TLObject f20213c;
    public final SharedPreferences d;

    public z7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f20211a = i10;
        this.f20212b = mediaDataController;
        this.f20213c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f20211a) {
            case 0:
                this.f20212b.lambda$loadRestrictedStatusEmojis$246(this.f20213c, this.d);
                return;
            default:
                this.f20212b.lambda$loadReplyIcons$244(this.f20213c, this.d);
                return;
        }
    }
}
