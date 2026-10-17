package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class z4 implements Runnable {
    public final int f20203a;
    public final long f20204b;
    public final long f20205c;
    public final int d;
    public final Object e;

    public z4(int i10, String str, long j10, long j11) {
        this.f20203a = 0;
        this.d = i10;
        this.e = str;
        this.f20204b = j10;
        this.f20205c = j11;
    }

    @Override
    public final void run() {
        switch (this.f20203a) {
            case 0:
                long j10 = this.f20204b;
                long j11 = this.f20205c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.e, j10, j11);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f20204b, this.f20205c, this.d);
                return;
            case 2:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$43(this.f20204b, this.f20205c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f20204b, this.f20205c, this.d);
                return;
        }
    }

    public z4(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f20203a = i11;
        this.e = baseController;
        this.f20204b = j10;
        this.f20205c = j11;
        this.d = i10;
    }
}
