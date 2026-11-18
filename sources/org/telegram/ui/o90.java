package org.telegram.ui;
public final class o90 implements Runnable {
    public final int f50498a;
    public final s90 f50499b;

    public o90(s90 s90Var, int i7) {
        this.f50498a = i7;
        this.f50499b = s90Var;
    }

    @Override
    public final void run() {
        switch (this.f50498a) {
            case 0:
                this.f50499b.b();
                return;
            default:
                this.f50499b.c();
                return;
        }
    }
}
