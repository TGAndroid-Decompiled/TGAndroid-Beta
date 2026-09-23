package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f18242a;
    public final boolean f18243b;
    public final int f18244c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f18242a = i12;
        this.f18244c = i10;
        this.f18243b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18242a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f18244c, this.f18243b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f18243b, this.f18244c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f18244c, this.f18243b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f18242a = 1;
        this.f18243b = z10;
        this.f18244c = i10;
        this.d = i11;
    }
}
