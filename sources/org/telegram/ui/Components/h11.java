package org.telegram.ui.Components;
public final class h11 implements Runnable {
    public final int f24687a;
    public final k11 f24688b;
    public final j11 f24689c;

    public h11(k11 k11Var, j11 j11Var, int i10) {
        this.f24687a = i10;
        this.f24688b = k11Var;
        this.f24689c = j11Var;
    }

    @Override
    public final void run() {
        switch (this.f24687a) {
            case 0:
                this.f24688b.b(this.f24689c);
                return;
            case 1:
                this.f24688b.b(this.f24689c);
                return;
            default:
                this.f24688b.b(this.f24689c);
                return;
        }
    }
}
