package org.telegram.ui.Components;
public final class f11 implements Runnable {
    public final int f24035a;
    public final i11 f24036b;
    public final h11 f24037c;

    public f11(i11 i11Var, h11 h11Var, int i10) {
        this.f24035a = i10;
        this.f24036b = i11Var;
        this.f24037c = h11Var;
    }

    @Override
    public final void run() {
        switch (this.f24035a) {
            case 0:
                this.f24036b.b(this.f24037c);
                return;
            case 1:
                this.f24036b.b(this.f24037c);
                return;
            default:
                this.f24036b.b(this.f24037c);
                return;
        }
    }
}
