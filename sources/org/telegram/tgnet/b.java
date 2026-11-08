package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f27117a;
    public final boolean f27118b;
    public final int f27119c;
    public final int d;

    public b(int i7, int i10, int i11, boolean z9) {
        this.f27117a = i11;
        this.f27119c = i7;
        this.f27118b = z9;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f27117a) {
            case 0:
                boolean z9 = this.f27118b;
                ConnectionsManager.h(this.f27119c, this.d, z9);
                return;
            case 1:
                ConnectionsManager.o(this.f27119c, this.d, this.f27118b);
                return;
            default:
                boolean z10 = this.f27118b;
                ConnectionsManager.n(this.f27119c, this.d, z10);
                return;
        }
    }

    public b(boolean z9, int i7, int i10) {
        this.f27117a = 1;
        this.f27118b = z9;
        this.f27119c = i7;
        this.d = i10;
    }
}
