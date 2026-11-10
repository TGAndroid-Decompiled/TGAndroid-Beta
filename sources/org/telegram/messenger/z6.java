package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f26832a;
    public final i7 f26833b;
    public final int f26834c;

    public z6(i7 i7Var, int i7, int i10) {
        this.f26832a = i10;
        this.f26833b = i7Var;
        this.f26834c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26832a) {
            case 0:
                this.f26833b.F0.add(Integer.valueOf(this.f26834c));
                return;
            case 1:
                this.f26833b.F0.remove(Integer.valueOf(this.f26834c));
                return;
            case 2:
                this.f26833b.F0.remove(Integer.valueOf(this.f26834c));
                return;
            default:
                i7 i7Var = this.f26833b;
                u7 u7Var = i7Var.f23089g0;
                if (u7Var != null) {
                    u7Var.b(i7Var, this.f26834c);
                }
                i7Var.i();
                return;
        }
    }
}
