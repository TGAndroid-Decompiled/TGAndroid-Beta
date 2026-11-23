package org.telegram.ui;
public final class o90 implements Runnable {
    public final int f50512a;
    public final s90 f50513b;

    public o90(s90 s90Var, int i7) {
        this.f50512a = i7;
        this.f50513b = s90Var;
    }

    @Override
    public final void run() {
        switch (this.f50512a) {
            case 0:
                this.f50513b.b();
                return;
            default:
                this.f50513b.c();
                return;
        }
    }
}
