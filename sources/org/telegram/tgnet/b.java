package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f28212a;
    public final boolean f28213b;
    public final int f28214c;
    public final int d;

    public b(int i7, int i10, int i11, boolean z10) {
        this.f28212a = i11;
        this.f28214c = i7;
        this.f28213b = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f28212a) {
            case 0:
                boolean z10 = this.f28213b;
                ConnectionsManager.h(this.f28214c, this.d, z10);
                return;
            case 1:
                ConnectionsManager.o(this.f28214c, this.d, this.f28213b);
                return;
            default:
                boolean z11 = this.f28213b;
                ConnectionsManager.n(this.f28214c, this.d, z11);
                return;
        }
    }

    public b(boolean z10, int i7, int i10) {
        this.f28212a = 1;
        this.f28213b = z10;
        this.f28214c = i7;
        this.d = i10;
    }
}
