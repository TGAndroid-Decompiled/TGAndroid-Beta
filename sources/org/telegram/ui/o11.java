package org.telegram.ui;
public final class o11 implements Runnable {
    public final int f36170a;
    public final s11 f36171b;
    public final int f36172c;

    public o11(s11 s11Var, int i10, int i11) {
        this.f36170a = i11;
        this.f36171b = s11Var;
        this.f36172c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36170a) {
            case 0:
                s11 s11Var = this.f36171b;
                org.telegram.ui.Components.x81 x81Var = s11Var.f37662n;
                r11 r11Var = s11Var.f37664s;
                int i10 = this.f36172c;
                x81Var.d(i10, r11Var.i(i10));
                return;
            default:
                s11 s11Var2 = this.f36171b;
                org.telegram.ui.Components.x81 x81Var2 = s11Var2.f37662n;
                r11 r11Var2 = s11Var2.f37664s;
                int i11 = this.f36172c;
                x81Var2.d(i11, r11Var2.i(i11));
                return;
        }
    }
}
