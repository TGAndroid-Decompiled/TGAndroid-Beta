package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f20191a;
    public final boolean f20192b;
    public final int f20193c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f20191a = i12;
        this.f20193c = i10;
        this.f20192b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f20191a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f20193c, this.f20192b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f20192b, this.f20193c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f20193c, this.f20192b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f20191a = 1;
        this.f20192b = z10;
        this.f20193c = i10;
        this.d = i11;
    }
}
