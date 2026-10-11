package org.telegram.messenger;

import android.media.SoundPool;
public final class zg implements SoundPool.OnLoadCompleteListener {
    public final int f20011a;

    public zg(int i10) {
        this.f20011a = i10;
    }

    @Override
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.f20011a) {
            case 0:
                NotificationsController.lambda$playInChatSound$40(soundPool, i10, i11);
                return;
            default:
                NotificationsController.lambda$playOutChatSound$49(soundPool, i10, i11);
                return;
        }
    }
}
