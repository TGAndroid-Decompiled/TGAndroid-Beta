package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f18271a;
    public final boolean f18272b;
    public final int f18273c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f18271a = i12;
        this.f18273c = i10;
        this.f18272b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18271a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f18273c, this.f18272b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f18272b, this.f18273c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f18273c, this.f18272b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f18271a = 1;
        this.f18272b = z10;
        this.f18273c = i10;
        this.d = i11;
    }
}
