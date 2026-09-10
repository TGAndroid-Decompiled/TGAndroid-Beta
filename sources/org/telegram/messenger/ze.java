package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f17159a;
    public final MessagesStorage f17160b;
    public final long f17161c;
    public final long d;
    public final String e;

    public ze(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17159a = i10;
        this.f17160b = messagesStorage;
        this.f17161c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17159a) {
            case 0:
                this.f17160b.lambda$updateRanksInLastMessages$45(this.f17161c, this.d, this.e);
                return;
            default:
                this.f17160b.lambda$updateRanksInLastMessages$46(this.f17161c, this.d, this.e);
                return;
        }
    }
}
