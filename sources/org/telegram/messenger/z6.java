package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f26749a;
    public final i7 f26750b;
    public final int f26751c;

    public z6(i7 i7Var, int i3, int i10) {
        this.f26749a = i10;
        this.f26750b = i7Var;
        this.f26751c = i3;
    }

    @Override
    public final void run() {
        switch (this.f26749a) {
            case 0:
                this.f26750b.F0.add(Integer.valueOf(this.f26751c));
                return;
            case 1:
                this.f26750b.F0.remove(Integer.valueOf(this.f26751c));
                return;
            case 2:
                this.f26750b.F0.remove(Integer.valueOf(this.f26751c));
                return;
            default:
                i7 i7Var = this.f26750b;
                u7 u7Var = i7Var.f23478g0;
                if (u7Var != null) {
                    u7Var.b(i7Var, this.f26751c);
                }
                i7Var.i();
                return;
        }
    }
}
