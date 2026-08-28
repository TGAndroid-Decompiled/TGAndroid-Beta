package org.telegram.ui.Components;
public final class jm implements Runnable {
    public final int f29758a;
    public final jn f29759b;
    public final int f29760c;

    public jm(jn jnVar, int i9, int i10) {
        this.f29758a = i10;
        this.f29759b = jnVar;
        this.f29760c = i9;
    }

    @Override
    public final void run() {
        switch (this.f29758a) {
            case 0:
                this.f29759b.d0(this.f29760c, null);
                return;
            case 1:
                this.f29759b.a0(this.f29760c);
                return;
            default:
                this.f29759b.d0(this.f29760c, null);
                return;
        }
    }
}
