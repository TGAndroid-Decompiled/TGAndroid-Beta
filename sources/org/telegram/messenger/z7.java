package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
public final class z7 implements Runnable {
    public final int f20275a;
    public final MediaDataController f20276b;
    public final TLObject f20277c;
    public final SharedPreferences d;

    public z7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.f20275a = i10;
        this.f20276b = mediaDataController;
        this.f20277c = tLObject;
        this.d = sharedPreferences;
    }

    @Override
    public final void run() {
        switch (this.f20275a) {
            case 0:
                this.f20276b.lambda$loadRestrictedStatusEmojis$246(this.f20277c, this.d);
                return;
            default:
                this.f20276b.lambda$loadReplyIcons$244(this.f20277c, this.d);
                return;
        }
    }
}
