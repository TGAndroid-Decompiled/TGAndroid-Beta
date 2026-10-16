package org.telegram.ui;
public final class e31 implements Runnable {
    public final int f35195a;
    public final g31 f35196b;
    public final int f35197c;
    public final int d;

    public e31(g31 g31Var, int i10, int i11, int i12) {
        this.f35195a = i12;
        this.f35196b = g31Var;
        this.f35197c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f35195a) {
            case 0:
                this.f35196b.b(this.f35197c, this.d);
                return;
            case 1:
                this.f35196b.b(this.f35197c, this.d);
                return;
            default:
                this.f35196b.b(this.f35197c, this.d);
                return;
        }
    }
}
