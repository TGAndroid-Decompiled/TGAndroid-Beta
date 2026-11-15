package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f27903a;
    public final i7 f27904b;
    public final int f27905c;

    public z6(i7 i7Var, int i7, int i10) {
        this.f27903a = i10;
        this.f27904b = i7Var;
        this.f27905c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27903a) {
            case 0:
                this.f27904b.F0.add(Integer.valueOf(this.f27905c));
                return;
            case 1:
                this.f27904b.F0.remove(Integer.valueOf(this.f27905c));
                return;
            case 2:
                this.f27904b.F0.remove(Integer.valueOf(this.f27905c));
                return;
            default:
                i7 i7Var = this.f27904b;
                u7 u7Var = i7Var.f24312g0;
                if (u7Var != null) {
                    u7Var.b(i7Var, this.f27905c);
                }
                i7Var.i();
                return;
        }
    }
}
