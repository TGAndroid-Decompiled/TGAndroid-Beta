package org.telegram.messenger;
public final class y9 implements Runnable {
    public final int f19891a;
    public final MessagesController f19892b;
    public final long f19893c;
    public final int d;
    public final boolean f19894e;
    public final int f19895f;
    public final int h;

    public y9(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f19891a = i13;
        this.f19892b = messagesController;
        this.f19893c = j3;
        this.d = i10;
        this.f19894e = z10;
        this.f19895f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f19891a) {
            case 0:
                int i10 = this.f19895f;
                int i11 = this.h;
                int i12 = this.d;
                this.f19892b.lambda$markDialogAsRead$243(this.f19893c, i12, this.f19894e, i10, i11);
                return;
            default:
                int i13 = this.f19895f;
                int i14 = this.h;
                int i15 = this.d;
                this.f19892b.lambda$markDialogAsRead$244(this.f19893c, i15, this.f19894e, i13, i14);
                return;
        }
    }
}
