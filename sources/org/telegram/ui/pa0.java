package org.telegram.ui;
public final class pa0 implements Runnable {
    public final int f40556a;
    public final ua0 f40557b;

    public pa0(ua0 ua0Var, int i10) {
        this.f40556a = i10;
        this.f40557b = ua0Var;
    }

    @Override
    public final void run() {
        switch (this.f40556a) {
            case 0:
                this.f40557b.b();
                return;
            default:
                this.f40557b.c();
                return;
        }
    }
}
