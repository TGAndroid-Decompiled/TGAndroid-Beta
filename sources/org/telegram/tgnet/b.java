package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f21004a;
    public final boolean f21005b;
    public final int f21006c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z4) {
        this.f21004a = i12;
        this.f21006c = i10;
        this.f21005b = z4;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f21004a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f21006c, this.f21005b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f21005b, this.f21006c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f21006c, this.f21005b, this.d);
                return;
        }
    }

    public b(boolean z4, int i10, int i11) {
        this.f21004a = 1;
        this.f21005b = z4;
        this.f21006c = i10;
        this.d = i11;
    }
}
