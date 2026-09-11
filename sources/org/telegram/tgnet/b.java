package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f20028a;
    public final boolean f20029b;
    public final int f20030c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f20028a = i12;
        this.f20030c = i10;
        this.f20029b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f20028a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f20030c, this.f20029b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f20029b, this.f20030c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f20030c, this.f20029b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f20028a = 1;
        this.f20029b = z10;
        this.f20030c = i10;
        this.d = i11;
    }
}
