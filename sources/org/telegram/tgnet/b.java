package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f22186a;
    public final boolean f22187b;
    public final int f22188c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f22186a = i12;
        this.f22188c = i10;
        this.f22187b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f22186a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f22188c, this.f22187b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f22187b, this.f22188c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f22188c, this.f22187b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f22186a = 1;
        this.f22187b = z10;
        this.f22188c = i10;
        this.d = i11;
    }
}
