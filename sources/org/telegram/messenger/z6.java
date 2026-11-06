package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f26804a;
    public final i7 f26805b;
    public final int f26806c;

    public z6(i7 i7Var, int i7, int i10) {
        this.f26804a = i10;
        this.f26805b = i7Var;
        this.f26806c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26804a) {
            case 0:
                this.f26805b.F0.add(Integer.valueOf(this.f26806c));
                return;
            case 1:
                this.f26805b.F0.remove(Integer.valueOf(this.f26806c));
                return;
            case 2:
                this.f26805b.F0.remove(Integer.valueOf(this.f26806c));
                return;
            default:
                i7 i7Var = this.f26805b;
                u7 u7Var = i7Var.f23095g0;
                if (u7Var != null) {
                    u7Var.b(i7Var, this.f26806c);
                }
                i7Var.i();
                return;
        }
    }
}
