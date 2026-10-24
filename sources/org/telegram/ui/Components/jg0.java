package org.telegram.ui.Components;
public final class jg0 implements Runnable {
    public final int f27697a;
    public final og0 f27698b;

    public jg0(og0 og0Var, int i10) {
        this.f27697a = i10;
        this.f27698b = og0Var;
    }

    @Override
    public final void run() {
        switch (this.f27697a) {
            case 0:
                this.f27698b.e();
                return;
            default:
                this.f27698b.g();
                return;
        }
    }
}
