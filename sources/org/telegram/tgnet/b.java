package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f28564a;
    public final boolean f28565b;
    public final int f28566c;
    public final int d;

    public b(int i7, int i10, int i11, boolean z10) {
        this.f28564a = i11;
        this.f28566c = i7;
        this.f28565b = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f28564a) {
            case 0:
                boolean z10 = this.f28565b;
                ConnectionsManager.h(this.f28566c, this.d, z10);
                return;
            case 1:
                ConnectionsManager.o(this.f28566c, this.d, this.f28565b);
                return;
            default:
                boolean z11 = this.f28565b;
                ConnectionsManager.n(this.f28566c, this.d, z11);
                return;
        }
    }

    public b(boolean z10, int i7, int i10) {
        this.f28564a = 1;
        this.f28565b = z10;
        this.f28566c = i7;
        this.d = i10;
    }
}
