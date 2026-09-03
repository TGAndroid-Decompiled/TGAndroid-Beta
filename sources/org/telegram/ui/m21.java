package org.telegram.ui;
public final class m21 implements Runnable {
    public final int f35966a;
    public final o21 f35967b;
    public final int f35968c;
    public final int d;

    public m21(o21 o21Var, int i10, int i11, int i12) {
        this.f35966a = i12;
        this.f35967b = o21Var;
        this.f35968c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f35966a) {
            case 0:
                this.f35967b.b(this.f35968c, this.d);
                return;
            case 1:
                this.f35967b.b(this.f35968c, this.d);
                return;
            default:
                this.f35967b.b(this.f35968c, this.d);
                return;
        }
    }
}
