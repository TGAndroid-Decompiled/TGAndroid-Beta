package org.telegram.ui.Components;
public final class pp0 implements Runnable {
    public final int f38538a;
    public final ds0 f38539b;
    public final int f38540c;

    public pp0(ds0 ds0Var, int i7, int i10) {
        this.f38538a = i10;
        this.f38539b = ds0Var;
        this.f38540c = i7;
    }

    @Override
    public final void run() {
        switch (this.f38538a) {
            case 0:
                this.f38539b.h.scrollBy(0, this.f38540c);
                return;
            case 1:
                this.f38539b.h.scrollBy(0, this.f38540c);
                return;
            default:
                this.f38539b.h.scrollBy(0, this.f38540c);
                return;
        }
    }
}
