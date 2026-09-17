package org.telegram.messenger;
public final class y9 implements Runnable {
    public final int f17967a;
    public final MessagesController f17968b;
    public final long f17969c;
    public final int d;
    public final boolean e;
    public final int f17970f;
    public final int h;

    public y9(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f17967a = i13;
        this.f17968b = messagesController;
        this.f17969c = j3;
        this.d = i10;
        this.e = z10;
        this.f17970f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f17967a) {
            case 0:
                int i10 = this.f17970f;
                int i11 = this.h;
                int i12 = this.d;
                this.f17968b.lambda$markDialogAsRead$243(this.f17969c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f17970f;
                int i14 = this.h;
                int i15 = this.d;
                this.f17968b.lambda$markDialogAsRead$244(this.f17969c, i15, this.e, i13, i14);
                return;
        }
    }
}
