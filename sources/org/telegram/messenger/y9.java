package org.telegram.messenger;
public final class y9 implements Runnable {
    public final int f17958a;
    public final MessagesController f17959b;
    public final long f17960c;
    public final int d;
    public final boolean e;
    public final int f17961f;
    public final int h;

    public y9(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f17958a = i13;
        this.f17959b = messagesController;
        this.f17960c = j3;
        this.d = i10;
        this.e = z10;
        this.f17961f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f17958a) {
            case 0:
                int i10 = this.f17961f;
                int i11 = this.h;
                int i12 = this.d;
                this.f17959b.lambda$markDialogAsRead$243(this.f17960c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f17961f;
                int i14 = this.h;
                int i15 = this.d;
                this.f17959b.lambda$markDialogAsRead$244(this.f17960c, i15, this.e, i13, i14);
                return;
        }
    }
}
