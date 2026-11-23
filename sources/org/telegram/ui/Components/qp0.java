package org.telegram.ui.Components;
public final class qp0 implements Runnable {
    public final int f38968a;
    public final ds0 f38969b;
    public final int f38970c;

    public qp0(ds0 ds0Var, int i7, int i10) {
        this.f38968a = i10;
        this.f38969b = ds0Var;
        this.f38970c = i7;
    }

    @Override
    public final void run() {
        switch (this.f38968a) {
            case 0:
                this.f38969b.h.scrollBy(0, this.f38970c);
                return;
            case 1:
                this.f38969b.h.scrollBy(0, this.f38970c);
                return;
            default:
                this.f38969b.h.scrollBy(0, this.f38970c);
                return;
        }
    }
}
