package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f18280a;
    public final boolean f18281b;
    public final int f18282c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f18280a = i12;
        this.f18282c = i10;
        this.f18281b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18280a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f18282c, this.f18281b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f18281b, this.f18282c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f18282c, this.f18281b, this.d);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f18280a = 1;
        this.f18281b = z10;
        this.f18282c = i10;
        this.d = i11;
    }
}
