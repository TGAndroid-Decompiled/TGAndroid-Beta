package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class yf implements Runnable {
    public final int f20708a;
    public final MessagesStorage f20709b;
    public final long f20710c;
    public final boolean[] d;
    public final CountDownLatch f20711e;

    public yf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f20708a = i10;
        this.f20709b = messagesStorage;
        this.f20710c = j10;
        this.d = zArr;
        this.f20711e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f20708a) {
            case 0:
                this.f20709b.lambda$checkMessageByRandomId$153(this.f20710c, this.d, this.f20711e);
                return;
            case 1:
                this.f20709b.lambda$isMigratedChat$141(this.f20710c, this.d, this.f20711e);
                return;
            default:
                this.f20709b.lambda$hasInviteMeMessage$143(this.f20710c, this.d, this.f20711e);
                return;
        }
    }
}
