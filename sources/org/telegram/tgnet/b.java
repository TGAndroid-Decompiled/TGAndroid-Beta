package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f20201a;
    public final boolean f20202b;
    public final int f20203c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f20201a = i12;
        this.f20203c = i10;
        this.f20202b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f20201a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f20203c, this.f20202b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f20202b, this.f20203c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f20203c, this.f20202b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f20201a = 1;
        this.f20202b = z10;
        this.f20203c = i10;
        this.d = i11;
    }
}
