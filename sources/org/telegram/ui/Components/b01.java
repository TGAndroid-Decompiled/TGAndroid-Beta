package org.telegram.ui.Components;

public final class b01 implements Runnable {

    public final int f26872a;

    public final d01 f26873b;

    public final c01 f26874c;

    public b01(d01 d01Var, c01 c01Var, int i10) {
        this.f26872a = i10;
        this.f26873b = d01Var;
        this.f26874c = c01Var;
    }

    @Override
    public final void run() {
        switch (this.f26872a) {
            case 0:
                this.f26873b.b(this.f26874c);
                break;
            case 1:
                this.f26873b.b(this.f26874c);
                break;
            default:
                this.f26873b.b(this.f26874c);
                break;
        }
    }
}
