package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class yf implements Runnable {
    public final int f19051a;
    public final MessagesStorage f19052b;
    public final long f19053c;
    public final boolean[] d;
    public final CountDownLatch e;

    public yf(int i10, long j10, CountDownLatch countDownLatch, MessagesStorage messagesStorage, boolean[] zArr) {
        this.f19051a = i10;
        this.f19052b = messagesStorage;
        this.f19053c = j10;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f19051a) {
            case 0:
                this.f19052b.lambda$checkMessageByRandomId$153(this.f19053c, this.d, this.e);
                return;
            case 1:
                this.f19052b.lambda$isMigratedChat$141(this.f19053c, this.d, this.e);
                return;
            default:
                this.f19052b.lambda$hasInviteMeMessage$143(this.f19053c, this.d, this.e);
                return;
        }
    }
}
