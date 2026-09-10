package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f17354a;
    public final boolean f17355b;
    public final int f17356c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f17354a = i12;
        this.f17356c = i10;
        this.f17355b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17354a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f17356c, this.f17355b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f17355b, this.f17356c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f17356c, this.f17355b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f17354a = 1;
        this.f17355b = z10;
        this.f17356c = i10;
        this.d = i11;
    }
}
