package org.telegram.ui;
public final class hd0 implements Runnable {
    public final int f45905a;
    public final s3 f45906b;

    public hd0(s3 s3Var, int i3) {
        this.f45905a = i3;
        this.f45906b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f45905a) {
            case 0:
                org.telegram.messenger.g0.h3(new hd0(this.f45906b, 1));
                return;
            default:
                this.f45906b.a("CANCELLED");
                return;
        }
    }
}
