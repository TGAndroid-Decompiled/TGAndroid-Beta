package org.telegram.ui;
public final class be1 implements Runnable {
    public final int f32350a;
    public final ke1 f32351b;

    public be1(ke1 ke1Var, int i10) {
        this.f32350a = i10;
        this.f32351b = ke1Var;
    }

    @Override
    public final void run() {
        switch (this.f32350a) {
            case 0:
                this.f32351b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f32351b.c(false);
                return;
        }
    }
}
