package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f18502a;
    public final boolean f18503b;
    public final int f18504c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f18502a = i12;
        this.f18504c = i10;
        this.f18503b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18502a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f18504c, this.f18503b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f18503b, this.f18504c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f18504c, this.f18503b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f18502a = 1;
        this.f18503b = z10;
        this.f18504c = i10;
        this.d = i11;
    }
}
