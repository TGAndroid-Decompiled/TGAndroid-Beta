package org.telegram.ui.Components;
public final class g11 implements Runnable {
    public final int f24227a;
    public final j11 f24228b;
    public final i11 f24229c;

    public g11(j11 j11Var, i11 i11Var, int i10) {
        this.f24227a = i10;
        this.f24228b = j11Var;
        this.f24229c = i11Var;
    }

    @Override
    public final void run() {
        switch (this.f24227a) {
            case 0:
                this.f24228b.b(this.f24229c);
                return;
            case 1:
                this.f24228b.b(this.f24229c);
                return;
            default:
                this.f24228b.b(this.f24229c);
                return;
        }
    }
}
