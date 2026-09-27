package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f18488a;
    public final boolean f18489b;
    public final int f18490c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f18488a = i12;
        this.f18490c = i10;
        this.f18489b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18488a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f18490c, this.f18489b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f18489b, this.f18490c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f18490c, this.f18489b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f18488a = 1;
        this.f18489b = z10;
        this.f18490c = i10;
        this.d = i11;
    }
}
