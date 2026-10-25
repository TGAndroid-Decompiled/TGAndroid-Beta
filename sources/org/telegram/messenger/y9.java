package org.telegram.messenger;
public final class y9 implements Runnable {
    public final int f21897a;
    public final MessagesController f21898b;
    public final int f21899c;
    public final long d;
    public final long e;

    public y9(int i10, long j10, long j11, MessagesController messagesController) {
        this.f21897a = 2;
        this.f21898b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f21899c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21897a) {
            case 0:
                long j10 = this.d;
                long j11 = this.e;
                this.f21898b.lambda$sendTyping$170(this.f21899c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.e;
                this.f21898b.lambda$sendTyping$172(this.f21899c, j12, j13);
                return;
            default:
                long j14 = this.e;
                int i10 = this.f21899c;
                this.f21898b.lambda$checkDeletingTask$83(this.d, j14, i10);
                return;
        }
    }

    public y9(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f21897a = i11;
        this.f21898b = messagesController;
        this.f21899c = i10;
        this.d = j10;
        this.e = j11;
    }
}
