package org.telegram.ui.Components;
public final class g11 implements Runnable {
    public final int f24360a;
    public final j11 f24361b;
    public final i11 f24362c;

    public g11(j11 j11Var, i11 i11Var, int i10) {
        this.f24360a = i10;
        this.f24361b = j11Var;
        this.f24362c = i11Var;
    }

    @Override
    public final void run() {
        switch (this.f24360a) {
            case 0:
                this.f24361b.b(this.f24362c);
                return;
            case 1:
                this.f24361b.b(this.f24362c);
                return;
            default:
                this.f24361b.b(this.f24362c);
                return;
        }
    }
}
