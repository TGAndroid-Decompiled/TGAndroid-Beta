package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f19343a;
    public final boolean f19344b;
    public final int f19345c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z4) {
        this.f19343a = i12;
        this.f19345c = i10;
        this.f19344b = z4;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19343a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f19345c, this.f19344b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f19344b, this.f19345c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f19345c, this.f19344b, this.d);
                return;
        }
    }

    public b(boolean z4, int i10, int i11) {
        this.f19343a = 1;
        this.f19344b = z4;
        this.f19345c = i10;
        this.d = i11;
    }
}
