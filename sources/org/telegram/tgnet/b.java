package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f19075a;
    public final boolean f19076b;
    public final int f19077c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f19075a = i12;
        this.f19077c = i10;
        this.f19076b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19075a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f19077c, this.f19076b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f19076b, this.f19077c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f19077c, this.f19076b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f19075a = 1;
        this.f19076b = z10;
        this.f19077c = i10;
        this.d = i11;
    }
}
