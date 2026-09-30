package org.telegram.ui;
public final class o11 implements Runnable {
    public final int f36026a;
    public final s11 f36027b;
    public final int f36028c;

    public o11(s11 s11Var, int i10, int i11) {
        this.f36026a = i11;
        this.f36027b = s11Var;
        this.f36028c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36026a) {
            case 0:
                s11 s11Var = this.f36027b;
                org.telegram.ui.Components.x81 x81Var = s11Var.f37566n;
                r11 r11Var = s11Var.f37568s;
                int i10 = this.f36028c;
                x81Var.d(i10, r11Var.i(i10));
                return;
            default:
                s11 s11Var2 = this.f36027b;
                org.telegram.ui.Components.x81 x81Var2 = s11Var2.f37566n;
                r11 r11Var2 = s11Var2.f37568s;
                int i11 = this.f36028c;
                x81Var2.d(i11, r11Var2.i(i11));
                return;
        }
    }
}
