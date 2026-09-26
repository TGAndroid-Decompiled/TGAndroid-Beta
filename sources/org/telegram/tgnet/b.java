package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f18494a;
    public final boolean f18495b;
    public final int f18496c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f18494a = i12;
        this.f18496c = i10;
        this.f18495b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18494a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f18496c, this.f18495b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f18495b, this.f18496c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f18496c, this.f18495b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f18494a = 1;
        this.f18495b = z10;
        this.f18496c = i10;
        this.d = i11;
    }
}
