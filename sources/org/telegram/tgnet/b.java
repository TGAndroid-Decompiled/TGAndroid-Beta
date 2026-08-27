package org.telegram.tgnet;

public final class b implements Runnable {

    public final int f22539a;

    public final boolean f22540b;

    public final int f22541c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f22539a = i12;
        this.f22541c = i10;
        this.f22540b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f22539a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f22541c, this.f22540b, this.d);
                break;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f22540b, this.f22541c, this.d);
                break;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f22541c, this.f22540b, this.d);
                break;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f22539a = 1;
        this.f22540b = z10;
        this.f22541c = i10;
        this.d = i11;
    }
}
