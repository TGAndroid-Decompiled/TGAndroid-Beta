package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f22188a;
    public final boolean f22189b;
    public final int f22190c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f22188a = i12;
        this.f22190c = i10;
        this.f22189b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f22188a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f22190c, this.f22189b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f22189b, this.f22190c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f22190c, this.f22189b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f22188a = 1;
        this.f22189b = z10;
        this.f22190c = i10;
        this.d = i11;
    }
}
