package org.telegram.messenger;
public final class z9 implements Runnable {
    public final int f20230a;
    public final MessagesController f20231b;
    public final int f20232c;
    public final long d;
    public final long e;

    public z9(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20230a = 2;
        this.f20231b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f20232c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20230a) {
            case 0:
                long j10 = this.d;
                long j11 = this.e;
                this.f20231b.lambda$sendTyping$170(this.f20232c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.e;
                this.f20231b.lambda$sendTyping$172(this.f20232c, j12, j13);
                return;
            default:
                long j14 = this.e;
                int i10 = this.f20232c;
                this.f20231b.lambda$checkDeletingTask$83(this.d, j14, i10);
                return;
        }
    }

    public z9(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f20230a = i11;
        this.f20231b = messagesController;
        this.f20232c = i10;
        this.d = j10;
        this.e = j11;
    }
}
