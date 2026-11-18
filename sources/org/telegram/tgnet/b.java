package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f28566a;
    public final boolean f28567b;
    public final int f28568c;
    public final int d;

    public b(int i7, int i10, int i11, boolean z10) {
        this.f28566a = i11;
        this.f28568c = i7;
        this.f28567b = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f28566a) {
            case 0:
                boolean z10 = this.f28567b;
                ConnectionsManager.h(this.f28568c, this.d, z10);
                return;
            case 1:
                ConnectionsManager.o(this.f28568c, this.d, this.f28567b);
                return;
            default:
                boolean z11 = this.f28567b;
                ConnectionsManager.n(this.f28568c, this.d, z11);
                return;
        }
    }

    public b(boolean z10, int i7, int i10) {
        this.f28566a = 1;
        this.f28567b = z10;
        this.f28568c = i7;
        this.d = i10;
    }
}
