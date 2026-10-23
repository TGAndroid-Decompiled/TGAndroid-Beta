package org.telegram.ui;
public final class jb0 implements Runnable {
    public final int f38519a;
    public final ob0 f38520b;

    public jb0(ob0 ob0Var, int i10) {
        this.f38519a = i10;
        this.f38520b = ob0Var;
    }

    @Override
    public final void run() {
        switch (this.f38519a) {
            case 0:
                this.f38520b.b();
                return;
            default:
                this.f38520b.c();
                return;
        }
    }
}
