package org.telegram.ui.Components;
public final class kz0 implements Runnable {
    public final int f37039a;
    public final mz0 f37040b;
    public final lz0 f37041c;

    public kz0(mz0 mz0Var, lz0 lz0Var, int i7) {
        this.f37039a = i7;
        this.f37040b = mz0Var;
        this.f37041c = lz0Var;
    }

    @Override
    public final void run() {
        switch (this.f37039a) {
            case 0:
                this.f37040b.a(this.f37041c);
                return;
            case 1:
                this.f37040b.a(this.f37041c);
                return;
            default:
                this.f37040b.a(this.f37041c);
                return;
        }
    }
}
