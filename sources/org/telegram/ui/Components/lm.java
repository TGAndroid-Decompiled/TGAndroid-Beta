package org.telegram.ui.Components;
public final class lm implements Runnable {
    public final int f36842a;
    public final jn f36843b;
    public final int f36844c;

    public lm(jn jnVar, int i7, int i10) {
        this.f36842a = i10;
        this.f36843b = jnVar;
        this.f36844c = i7;
    }

    @Override
    public final void run() {
        switch (this.f36842a) {
            case 0:
                this.f36843b.j0(this.f36844c, null);
                return;
            case 1:
                this.f36843b.g0(this.f36844c);
                return;
            default:
                this.f36843b.j0(this.f36844c, null);
                return;
        }
    }
}
