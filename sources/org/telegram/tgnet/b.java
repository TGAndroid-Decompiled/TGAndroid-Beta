package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f27114a;
    public final boolean f27115b;
    public final int f27116c;
    public final int d;

    public b(int i7, int i10, int i11, boolean z9) {
        this.f27114a = i11;
        this.f27116c = i7;
        this.f27115b = z9;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f27114a) {
            case 0:
                boolean z9 = this.f27115b;
                ConnectionsManager.h(this.f27116c, this.d, z9);
                return;
            case 1:
                ConnectionsManager.o(this.f27116c, this.d, this.f27115b);
                return;
            default:
                boolean z10 = this.f27115b;
                ConnectionsManager.n(this.f27116c, this.d, z10);
                return;
        }
    }

    public b(boolean z9, int i7, int i10) {
        this.f27114a = 1;
        this.f27115b = z9;
        this.f27116c = i7;
        this.d = i10;
    }
}
