package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f28592a;
    public final boolean f28593b;
    public final int f28594c;
    public final int d;

    public b(int i7, int i10, int i11, boolean z10) {
        this.f28592a = i11;
        this.f28594c = i7;
        this.f28593b = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f28592a) {
            case 0:
                boolean z10 = this.f28593b;
                ConnectionsManager.h(this.f28594c, this.d, z10);
                return;
            case 1:
                ConnectionsManager.o(this.f28594c, this.d, this.f28593b);
                return;
            default:
                boolean z11 = this.f28593b;
                ConnectionsManager.n(this.f28594c, this.d, z11);
                return;
        }
    }

    public b(boolean z10, int i7, int i10) {
        this.f28592a = 1;
        this.f28593b = z10;
        this.f28594c = i7;
        this.d = i10;
    }
}
