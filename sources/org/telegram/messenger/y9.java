package org.telegram.messenger;
public final class y9 implements Runnable {
    public final int f19723a;
    public final MessagesController f19724b;
    public final long f19725c;
    public final int d;
    public final boolean f19726e;
    public final int f19727f;
    public final int h;

    public y9(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f19723a = i13;
        this.f19724b = messagesController;
        this.f19725c = j3;
        this.d = i10;
        this.f19726e = z10;
        this.f19727f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f19723a) {
            case 0:
                int i10 = this.f19727f;
                int i11 = this.h;
                int i12 = this.d;
                this.f19724b.lambda$markDialogAsRead$243(this.f19725c, i12, this.f19726e, i10, i11);
                return;
            default:
                int i13 = this.f19727f;
                int i14 = this.h;
                int i15 = this.d;
                this.f19724b.lambda$markDialogAsRead$244(this.f19725c, i15, this.f19726e, i13, i14);
                return;
        }
    }
}
