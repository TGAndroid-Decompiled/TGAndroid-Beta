package org.telegram.ui;
public final class o90 implements Runnable {
    public final int f50523a;
    public final s90 f50524b;

    public o90(s90 s90Var, int i7) {
        this.f50523a = i7;
        this.f50524b = s90Var;
    }

    @Override
    public final void run() {
        switch (this.f50523a) {
            case 0:
                this.f50524b.b();
                return;
            default:
                this.f50524b.c();
                return;
        }
    }
}
