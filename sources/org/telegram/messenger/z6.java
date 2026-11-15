package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f27893a;
    public final i7 f27894b;
    public final int f27895c;

    public z6(i7 i7Var, int i7, int i10) {
        this.f27893a = i10;
        this.f27894b = i7Var;
        this.f27895c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27893a) {
            case 0:
                this.f27894b.F0.add(Integer.valueOf(this.f27895c));
                return;
            case 1:
                this.f27894b.F0.remove(Integer.valueOf(this.f27895c));
                return;
            case 2:
                this.f27894b.F0.remove(Integer.valueOf(this.f27895c));
                return;
            default:
                i7 i7Var = this.f27894b;
                u7 u7Var = i7Var.f24312g0;
                if (u7Var != null) {
                    u7Var.b(i7Var, this.f27895c);
                }
                i7Var.i();
                return;
        }
    }
}
