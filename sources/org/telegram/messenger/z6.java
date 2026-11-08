package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f26828a;
    public final i7 f26829b;
    public final int f26830c;

    public z6(i7 i7Var, int i7, int i10) {
        this.f26828a = i10;
        this.f26829b = i7Var;
        this.f26830c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26828a) {
            case 0:
                this.f26829b.F0.add(Integer.valueOf(this.f26830c));
                return;
            case 1:
                this.f26829b.F0.remove(Integer.valueOf(this.f26830c));
                return;
            case 2:
                this.f26829b.F0.remove(Integer.valueOf(this.f26830c));
                return;
            default:
                i7 i7Var = this.f26829b;
                u7 u7Var = i7Var.f23085g0;
                if (u7Var != null) {
                    u7Var.b(i7Var, this.f26830c);
                }
                i7Var.i();
                return;
        }
    }
}
