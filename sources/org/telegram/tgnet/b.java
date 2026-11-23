package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f28653a;
    public final boolean f28654b;
    public final int f28655c;
    public final int d;

    public b(int i7, int i10, int i11, boolean z10) {
        this.f28653a = i11;
        this.f28655c = i7;
        this.f28654b = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f28653a) {
            case 0:
                boolean z10 = this.f28654b;
                ConnectionsManager.h(this.f28655c, this.d, z10);
                return;
            case 1:
                ConnectionsManager.o(this.f28655c, this.d, this.f28654b);
                return;
            default:
                boolean z11 = this.f28654b;
                ConnectionsManager.n(this.f28655c, this.d, z11);
                return;
        }
    }

    public b(boolean z10, int i7, int i10) {
        this.f28653a = 1;
        this.f28654b = z10;
        this.f28655c = i7;
        this.d = i10;
    }
}
