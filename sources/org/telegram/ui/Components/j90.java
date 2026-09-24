package org.telegram.ui.Components;
public final class j90 implements Runnable {
    public final int f25335a;
    public final k90 f25336b;
    public final o90 f25337c;

    public j90(k90 k90Var, o90 o90Var, int i10) {
        this.f25335a = i10;
        this.f25336b = k90Var;
        this.f25337c = o90Var;
    }

    @Override
    public final void run() {
        switch (this.f25335a) {
            case 0:
                this.f25336b.k(this.f25337c, false);
                return;
            default:
                this.f25336b.k(this.f25337c, false);
                return;
        }
    }
}
