package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f22551a;
    public final boolean f22552b;
    public final int f22553c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f22551a = i12;
        this.f22553c = i10;
        this.f22552b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f22551a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f22553c, this.f22552b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f22552b, this.f22553c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f22553c, this.f22552b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f22551a = 1;
        this.f22552b = z10;
        this.f22553c = i10;
        this.d = i11;
    }
}
