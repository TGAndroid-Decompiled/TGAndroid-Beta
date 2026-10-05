package org.telegram.messenger;
public final class y9 implements Runnable {
    public final int f19897a;
    public final MessagesController f19898b;
    public final long f19899c;
    public final int d;
    public final boolean f19900e;
    public final int f19901f;
    public final int h;

    public y9(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f19897a = i13;
        this.f19898b = messagesController;
        this.f19899c = j3;
        this.d = i10;
        this.f19900e = z10;
        this.f19901f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f19897a) {
            case 0:
                int i10 = this.f19901f;
                int i11 = this.h;
                int i12 = this.d;
                this.f19898b.lambda$markDialogAsRead$243(this.f19899c, i12, this.f19900e, i10, i11);
                return;
            default:
                int i13 = this.f19901f;
                int i14 = this.h;
                int i15 = this.d;
                this.f19898b.lambda$markDialogAsRead$244(this.f19899c, i15, this.f19900e, i13, i14);
                return;
        }
    }
}
