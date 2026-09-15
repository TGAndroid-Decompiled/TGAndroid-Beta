package org.telegram.ui;
public final class be1 implements Runnable {
    public final int f32145a;
    public final ke1 f32146b;

    public be1(ke1 ke1Var, int i10) {
        this.f32145a = i10;
        this.f32146b = ke1Var;
    }

    @Override
    public final void run() {
        switch (this.f32145a) {
            case 0:
                this.f32146b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f32146b.c(false);
                return;
        }
    }
}
