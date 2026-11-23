package org.telegram.ui;
public final class o90 implements Runnable {
    public final int f50527a;
    public final s90 f50528b;

    public o90(s90 s90Var, int i7) {
        this.f50527a = i7;
        this.f50528b = s90Var;
    }

    @Override
    public final void run() {
        switch (this.f50527a) {
            case 0:
                this.f50528b.b();
                return;
            default:
                this.f50528b.c();
                return;
        }
    }
}
