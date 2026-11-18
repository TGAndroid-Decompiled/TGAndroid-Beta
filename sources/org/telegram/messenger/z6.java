package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f28271a;
    public final i7 f28272b;
    public final int f28273c;

    public z6(i7 i7Var, int i7, int i10) {
        this.f28271a = i10;
        this.f28272b = i7Var;
        this.f28273c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28271a) {
            case 0:
                this.f28272b.F0.add(Integer.valueOf(this.f28273c));
                return;
            case 1:
                this.f28272b.F0.remove(Integer.valueOf(this.f28273c));
                return;
            case 2:
                this.f28272b.F0.remove(Integer.valueOf(this.f28273c));
                return;
            default:
                i7 i7Var = this.f28272b;
                u7 u7Var = i7Var.f24607g0;
                if (u7Var != null) {
                    u7Var.b(i7Var, this.f28273c);
                }
                i7Var.i();
                return;
        }
    }
}
