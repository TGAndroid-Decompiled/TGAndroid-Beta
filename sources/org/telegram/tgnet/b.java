package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f20055a;
    public final boolean f20056b;
    public final int f20057c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f20055a = i12;
        this.f20057c = i10;
        this.f20056b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f20055a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f20057c, this.f20056b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f20056b, this.f20057c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f20057c, this.f20056b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f20055a = 1;
        this.f20056b = z10;
        this.f20057c = i10;
        this.d = i11;
    }
}
