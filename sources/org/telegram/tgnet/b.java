package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f19962a;
    public final boolean f19963b;
    public final int f19964c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f19962a = i12;
        this.f19964c = i10;
        this.f19963b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19962a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f19964c, this.f19963b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f19963b, this.f19964c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f19964c, this.f19963b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f19962a = 1;
        this.f19963b = z10;
        this.f19964c = i10;
        this.d = i11;
    }
}
