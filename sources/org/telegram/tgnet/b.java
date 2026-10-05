package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f20206a;
    public final boolean f20207b;
    public final int f20208c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f20206a = i12;
        this.f20208c = i10;
        this.f20207b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f20206a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f20208c, this.f20207b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f20207b, this.f20208c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f20208c, this.f20207b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f20206a = 1;
        this.f20207b = z10;
        this.f20208c = i10;
        this.d = i11;
    }
}
