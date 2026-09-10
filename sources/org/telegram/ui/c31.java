package org.telegram.ui;
public final class c31 implements Runnable {
    public final int f31522a;
    public final e31 f31523b;
    public final int f31524c;
    public final int d;

    public c31(e31 e31Var, int i10, int i11, int i12) {
        this.f31522a = i12;
        this.f31523b = e31Var;
        this.f31524c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f31522a) {
            case 0:
                this.f31523b.b(this.f31524c, this.d);
                return;
            case 1:
                this.f31523b.b(this.f31524c, this.d);
                return;
            default:
                this.f31523b.b(this.f31524c, this.d);
                return;
        }
    }
}
