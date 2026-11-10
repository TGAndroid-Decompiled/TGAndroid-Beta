package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f27121a;
    public final boolean f27122b;
    public final int f27123c;
    public final int d;

    public b(int i7, int i10, int i11, boolean z9) {
        this.f27121a = i11;
        this.f27123c = i7;
        this.f27122b = z9;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f27121a) {
            case 0:
                boolean z9 = this.f27122b;
                ConnectionsManager.h(this.f27123c, this.d, z9);
                return;
            case 1:
                ConnectionsManager.o(this.f27123c, this.d, this.f27122b);
                return;
            default:
                boolean z10 = this.f27122b;
                ConnectionsManager.n(this.f27123c, this.d, z10);
                return;
        }
    }

    public b(boolean z9, int i7, int i10) {
        this.f27121a = 1;
        this.f27122b = z9;
        this.f27123c = i7;
        this.d = i10;
    }
}
