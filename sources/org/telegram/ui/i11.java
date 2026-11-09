package org.telegram.ui;
public final class i11 implements Runnable {
    public final int f46441a;
    public final j11 f46442b;

    public i11(j11 j11Var, int i7) {
        this.f46441a = i7;
        this.f46442b = j11Var;
    }

    @Override
    public final void run() {
        switch (this.f46441a) {
            case 0:
                j11.a(this.f46442b);
                return;
            default:
                this.f46442b.dismiss();
                return;
        }
    }
}
