package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f28269a;
    public final i7 f28270b;
    public final int f28271c;

    public z6(i7 i7Var, int i7, int i10) {
        this.f28269a = i10;
        this.f28270b = i7Var;
        this.f28271c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28269a) {
            case 0:
                this.f28270b.F0.add(Integer.valueOf(this.f28271c));
                return;
            case 1:
                this.f28270b.F0.remove(Integer.valueOf(this.f28271c));
                return;
            case 2:
                this.f28270b.F0.remove(Integer.valueOf(this.f28271c));
                return;
            default:
                i7 i7Var = this.f28270b;
                u7 u7Var = i7Var.f24604g0;
                if (u7Var != null) {
                    u7Var.b(i7Var, this.f28271c);
                }
                i7Var.i();
                return;
        }
    }
}
