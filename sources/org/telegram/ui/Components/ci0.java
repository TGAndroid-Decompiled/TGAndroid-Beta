package org.telegram.ui.Components;
public final class ci0 implements Runnable {
    public final int f24946a;
    public final fi0 f24947b;

    public ci0(fi0 fi0Var, int i10) {
        this.f24946a = i10;
        this.f24947b = fi0Var;
    }

    @Override
    public final void run() {
        switch (this.f24946a) {
            case 0:
                this.f24947b.a(true);
                return;
            default:
                this.f24947b.d();
                return;
        }
    }
}
