package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f19954a;
    public final boolean f19955b;
    public final int f19956c;
    public final int d;

    public b(int i10, int i11, int i12, boolean z10) {
        this.f19954a = i12;
        this.f19956c = i10;
        this.f19955b = z10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19954a) {
            case 0:
                boolean z10 = this.f19955b;
                ConnectionsManager.g(this.f19956c, this.d, z10);
                return;
            case 1:
                ConnectionsManager.n(this.f19956c, this.d, this.f19955b);
                return;
            default:
                boolean z11 = this.f19955b;
                ConnectionsManager.m(this.f19956c, this.d, z11);
                return;
        }
    }

    public b(boolean z10, int i10, int i11) {
        this.f19954a = 1;
        this.f19955b = z10;
        this.f19956c = i10;
        this.d = i11;
    }
}
