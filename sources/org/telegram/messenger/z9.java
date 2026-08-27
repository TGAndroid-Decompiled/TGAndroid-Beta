package org.telegram.messenger;

public final class z9 implements Runnable {

    public final int f22325a;

    public final MessagesController f22326b;

    public final long f22327c;
    public final int d;

    public final boolean f22328e;

    public final int f22329f;
    public final int h;

    public z9(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f22325a = i13;
        this.f22326b = messagesController;
        this.f22327c = j10;
        this.d = i10;
        this.f22328e = z10;
        this.f22329f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f22325a) {
            case 0:
                int i10 = this.f22329f;
                int i11 = this.h;
                int i12 = this.d;
                this.f22326b.lambda$markDialogAsRead$243(this.f22327c, i12, this.f22328e, i10, i11);
                break;
            default:
                int i13 = this.f22329f;
                int i14 = this.h;
                int i15 = this.d;
                this.f22326b.lambda$markDialogAsRead$244(this.f22327c, i15, this.f22328e, i13, i14);
                break;
        }
    }
}
