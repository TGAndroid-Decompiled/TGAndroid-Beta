package org.telegram.ui;
public final class ff implements Runnable {
    public final int f36893a;
    public final sn f36894b;
    public final long f36895c;
    public final long d;

    public ff(sn snVar, long j10, long j11, int i10) {
        this.f36893a = i10;
        this.f36894b = snVar;
        this.f36895c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36893a) {
            case 0:
                sn.Y(this.f36894b, this.f36895c, this.d);
                return;
            default:
                sn.X(this.f36894b, this.f36895c, this.d);
                return;
        }
    }
}
