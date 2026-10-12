package org.telegram.ui.Components;
public final class ci0 implements Runnable {
    public final int f24941a;
    public final fi0 f24942b;

    public ci0(fi0 fi0Var, int i10) {
        this.f24941a = i10;
        this.f24942b = fi0Var;
    }

    @Override
    public final void run() {
        switch (this.f24941a) {
            case 0:
                this.f24942b.a(true);
                return;
            default:
                this.f24942b.d();
                return;
        }
    }
}
