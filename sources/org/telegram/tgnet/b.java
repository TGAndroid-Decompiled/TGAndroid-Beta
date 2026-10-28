package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f22189a;
    public final boolean f22190b;
    public final int f22191c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f22189a = i12;
        this.f22191c = i10;
        this.f22190b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f22189a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f22191c, this.f22190b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f22190b, this.f22191c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f22191c, this.f22190b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f22189a = 1;
        this.f22190b = z10;
        this.f22191c = i10;
        this.d = i11;
    }
}
