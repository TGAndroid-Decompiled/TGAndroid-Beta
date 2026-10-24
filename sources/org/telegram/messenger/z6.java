package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class z6 implements Runnable {
    public final int f20272a;
    public final MediaController.MediaLoader f20273b;
    public final int f20274c;

    public z6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f20272a = i11;
        this.f20273b = mediaLoader;
        this.f20274c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20272a) {
            case 0:
                this.f20273b.lambda$didReceivedNotification$11(this.f20274c);
                return;
            case 1:
                this.f20273b.lambda$copyFile$9(this.f20274c);
                return;
            case 2:
                this.f20273b.lambda$copyFile$10(this.f20274c);
                return;
            default:
                this.f20273b.lambda$processLivePhotoMessage$6(this.f20274c);
                return;
        }
    }
}
