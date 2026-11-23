package org.telegram.tgnet;
public final class b implements Runnable {
    public final int f28559a;
    public final boolean f28560b;
    public final int f28561c;
    public final int d;

    public b(int i7, int i10, int i11, boolean z10) {
        this.f28559a = i11;
        this.f28561c = i7;
        this.f28560b = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f28559a) {
            case 0:
                boolean z10 = this.f28560b;
                ConnectionsManager.h(this.f28561c, this.d, z10);
                return;
            case 1:
                ConnectionsManager.o(this.f28561c, this.d, this.f28560b);
                return;
            default:
                boolean z11 = this.f28560b;
                ConnectionsManager.n(this.f28561c, this.d, z11);
                return;
        }
    }

    public b(boolean z10, int i7, int i10) {
        this.f28559a = 1;
        this.f28560b = z10;
        this.f28561c = i7;
        this.d = i10;
    }
}
