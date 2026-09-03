package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class yf implements Runnable {
    public final int f20710a;
    public final MessagesStorage f20711b;
    public final long f20712c;
    public final boolean[] d;
    public final CountDownLatch f20713e;

    public yf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f20710a = i10;
        this.f20711b = messagesStorage;
        this.f20712c = j10;
        this.d = zArr;
        this.f20713e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f20710a) {
            case 0:
                this.f20711b.lambda$checkMessageByRandomId$153(this.f20712c, this.d, this.f20713e);
                return;
            case 1:
                this.f20711b.lambda$isMigratedChat$141(this.f20712c, this.d, this.f20713e);
                return;
            default:
                this.f20711b.lambda$hasInviteMeMessage$143(this.f20712c, this.d, this.f20713e);
                return;
        }
    }
}
