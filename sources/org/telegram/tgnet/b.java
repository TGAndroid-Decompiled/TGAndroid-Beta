package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f18496a;
    public final boolean f18497b;
    public final int f18498c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f18496a = i12;
        this.f18498c = i10;
        this.f18497b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18496a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f18498c, this.f18497b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f18497b, this.f18498c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f18498c, this.f18497b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f18496a = 1;
        this.f18497b = z10;
        this.f18498c = i10;
        this.d = i11;
    }
}
