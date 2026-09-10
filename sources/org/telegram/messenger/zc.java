package org.telegram.messenger;
public final class zc implements Runnable {
    public final int f17146a;
    public final MessagesController f17147b;
    public final int f17148c;
    public final long d;
    public final long e;

    public zc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f17146a = 2;
        this.f17147b = messagesController;
        this.d = j3;
        this.e = j10;
        this.f17148c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17146a) {
            case 0:
                long j3 = this.d;
                long j10 = this.e;
                this.f17147b.lambda$sendTyping$173(this.f17148c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.f17147b.lambda$sendTyping$171(this.f17148c, j11, j12);
                return;
            default:
                long j13 = this.e;
                int i10 = this.f17148c;
                this.f17147b.lambda$checkDeletingTask$84(this.d, j13, i10);
                return;
        }
    }

    public zc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f17146a = i11;
        this.f17147b = messagesController;
        this.f17148c = i10;
        this.d = j3;
        this.e = j10;
    }
}
