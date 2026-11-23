package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f28595a;
    public final boolean f28596b;
    public final int f28597c;
    public final int d;

    public b(int i7, int i10, int i11, boolean z10) {
        this.f28595a = i11;
        this.f28597c = i7;
        this.f28596b = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f28595a) {
            case 0:
                boolean z10 = this.f28596b;
                ConnectionsManager.h(this.f28597c, this.d, z10);
                return;
            case 1:
                ConnectionsManager.o(this.f28597c, this.d, this.f28596b);
                return;
            default:
                boolean z11 = this.f28596b;
                ConnectionsManager.n(this.f28597c, this.d, z11);
                return;
        }
    }

    public b(boolean z10, int i7, int i10) {
        this.f28595a = 1;
        this.f28596b = z10;
        this.f28597c = i7;
        this.d = i10;
    }
}
