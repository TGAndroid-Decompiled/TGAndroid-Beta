package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f17127a;
    public final long f17128b;
    public final long f17129c;
    public final int d;
    public final BaseController e;

    public z7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f17127a = i11;
        this.e = baseController;
        this.f17128b = j3;
        this.f17129c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17127a) {
            case 0:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f17128b, this.f17129c, this.d);
                return;
            case 1:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$42(this.f17128b, this.f17129c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f17128b, this.f17129c, this.d);
                return;
        }
    }
}
