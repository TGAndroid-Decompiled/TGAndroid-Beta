package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class z4 implements Runnable {
    public final int f20204a;
    public final long f20205b;
    public final long f20206c;
    public final int d;
    public final Object e;

    public z4(int i10, String str, long j10, long j11) {
        this.f20204a = 0;
        this.d = i10;
        this.e = str;
        this.f20205b = j10;
        this.f20206c = j11;
    }

    @Override
    public final void run() {
        switch (this.f20204a) {
            case 0:
                long j10 = this.f20205b;
                long j11 = this.f20206c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.e, j10, j11);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f20205b, this.f20206c, this.d);
                return;
            case 2:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$43(this.f20205b, this.f20206c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f20205b, this.f20206c, this.d);
                return;
        }
    }

    public z4(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f20204a = i11;
        this.e = baseController;
        this.f20205b = j10;
        this.f20206c = j11;
        this.d = i10;
    }
}
