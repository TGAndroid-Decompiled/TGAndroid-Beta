package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f19961a;
    public final boolean f19962b;
    public final int f19963c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f19961a = i12;
        this.f19963c = i10;
        this.f19962b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19961a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f19963c, this.f19962b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f19962b, this.f19963c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f19963c, this.f19962b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f19961a = 1;
        this.f19962b = z10;
        this.f19963c = i10;
        this.d = i11;
    }
}
