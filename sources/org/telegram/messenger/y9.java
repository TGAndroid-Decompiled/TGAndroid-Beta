package org.telegram.messenger;
public final class y9 implements Runnable {
    public final int f19892a;
    public final MessagesController f19893b;
    public final long f19894c;
    public final int d;
    public final boolean f19895e;
    public final int f19896f;
    public final int h;

    public y9(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f19892a = i13;
        this.f19893b = messagesController;
        this.f19894c = j3;
        this.d = i10;
        this.f19895e = z10;
        this.f19896f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f19892a) {
            case 0:
                int i10 = this.f19896f;
                int i11 = this.h;
                int i12 = this.d;
                this.f19893b.lambda$markDialogAsRead$243(this.f19894c, i12, this.f19895e, i10, i11);
                return;
            default:
                int i13 = this.f19896f;
                int i14 = this.h;
                int i15 = this.d;
                this.f19893b.lambda$markDialogAsRead$244(this.f19894c, i15, this.f19895e, i13, i14);
                return;
        }
    }
}
