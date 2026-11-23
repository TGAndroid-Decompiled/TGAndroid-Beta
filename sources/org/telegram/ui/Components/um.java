package org.telegram.ui.Components;
public final class um implements Runnable {
    public final int f40478a;
    public final tn f40479b;
    public final int f40480c;

    public um(tn tnVar, int i7, int i10) {
        this.f40478a = i10;
        this.f40479b = tnVar;
        this.f40480c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40478a) {
            case 0:
                this.f40479b.j0(this.f40480c, null);
                return;
            case 1:
                this.f40479b.g0(this.f40480c);
                return;
            default:
                this.f40479b.j0(this.f40480c, null);
                return;
        }
    }
}
