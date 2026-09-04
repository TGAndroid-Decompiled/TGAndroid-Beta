package org.telegram.messenger;
public final class y9 implements Runnable {
    public final int f19696a;
    public final MessagesController f19697b;
    public final long f19698c;
    public final int d;
    public final boolean f19699e;
    public final int f19700f;
    public final int h;

    public y9(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f19696a = i13;
        this.f19697b = messagesController;
        this.f19698c = j3;
        this.d = i10;
        this.f19699e = z10;
        this.f19700f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f19696a) {
            case 0:
                int i10 = this.f19700f;
                int i11 = this.h;
                int i12 = this.d;
                this.f19697b.lambda$markDialogAsRead$243(this.f19698c, i12, this.f19699e, i10, i11);
                return;
            default:
                int i13 = this.f19700f;
                int i14 = this.h;
                int i15 = this.d;
                this.f19697b.lambda$markDialogAsRead$244(this.f19698c, i15, this.f19699e, i13, i14);
                return;
        }
    }
}
