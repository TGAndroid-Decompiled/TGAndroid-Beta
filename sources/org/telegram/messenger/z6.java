package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class z6 implements Runnable {
    public final int f20208a;
    public final MediaController.MediaLoader f20209b;
    public final int f20210c;

    public z6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f20208a = i11;
        this.f20209b = mediaLoader;
        this.f20210c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20208a) {
            case 0:
                this.f20209b.lambda$didReceivedNotification$11(this.f20210c);
                return;
            case 1:
                this.f20209b.lambda$copyFile$9(this.f20210c);
                return;
            case 2:
                this.f20209b.lambda$copyFile$10(this.f20210c);
                return;
            default:
                this.f20209b.lambda$processLivePhotoMessage$6(this.f20210c);
                return;
        }
    }
}
