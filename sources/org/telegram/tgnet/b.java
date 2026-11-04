package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f27162a;
    public final boolean f27163b;
    public final int f27164c;
    public final int d;

    public b(int i3, int i10, int i11, boolean z10) {
        this.f27162a = i11;
        this.f27164c = i3;
        this.f27163b = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f27162a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f27164c, this.f27163b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f27163b, this.f27164c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f27164c, this.f27163b, this.d);
                return;
        }
    }

    public b(boolean z10, int i3, int i10) {
        this.f27162a = 1;
        this.f27163b = z10;
        this.f27164c = i3;
        this.d = i10;
    }
}
