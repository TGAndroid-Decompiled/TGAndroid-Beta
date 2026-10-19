package org.telegram.messenger;
public final class y9 implements Runnable {
    public final int f20143a;
    public final MessagesController f20144b;
    public final int f20145c;
    public final long d;
    public final long e;

    public y9(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20143a = 2;
        this.f20144b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f20145c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20143a) {
            case 0:
                long j10 = this.d;
                long j11 = this.e;
                this.f20144b.lambda$sendTyping$170(this.f20145c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.e;
                this.f20144b.lambda$sendTyping$172(this.f20145c, j12, j13);
                return;
            default:
                long j14 = this.e;
                int i10 = this.f20145c;
                this.f20144b.lambda$checkDeletingTask$83(this.d, j14, i10);
                return;
        }
    }

    public y9(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f20143a = i11;
        this.f20144b = messagesController;
        this.f20145c = i10;
        this.d = j10;
        this.e = j11;
    }
}
