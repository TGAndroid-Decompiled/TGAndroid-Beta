package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f20432a;
    public final boolean f20433b;
    public final int f20434c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f20432a = i12;
        this.f20434c = i10;
        this.f20433b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f20432a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f20434c, this.f20433b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f20433b, this.f20434c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f20434c, this.f20433b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f20432a = 1;
        this.f20433b = z10;
        this.f20434c = i10;
        this.d = i11;
    }
}
