package org.telegram.ui;
public final class jb0 implements Runnable {
    public final int f38527a;
    public final ob0 f38528b;

    public jb0(ob0 ob0Var, int i10) {
        this.f38527a = i10;
        this.f38528b = ob0Var;
    }

    @Override
    public final void run() {
        switch (this.f38527a) {
            case 0:
                this.f38528b.b();
                return;
            default:
                this.f38528b.c();
                return;
        }
    }
}
