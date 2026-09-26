package org.telegram.ui;
public final class o11 implements Runnable {
    public final int f36031a;
    public final s11 f36032b;
    public final int f36033c;

    public o11(s11 s11Var, int i10, int i11) {
        this.f36031a = i11;
        this.f36032b = s11Var;
        this.f36033c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36031a) {
            case 0:
                s11 s11Var = this.f36032b;
                org.telegram.ui.Components.w81 w81Var = s11Var.f37565n;
                r11 r11Var = s11Var.f37567s;
                int i10 = this.f36033c;
                w81Var.d(i10, r11Var.i(i10));
                return;
            default:
                s11 s11Var2 = this.f36032b;
                org.telegram.ui.Components.w81 w81Var2 = s11Var2.f37565n;
                r11 r11Var2 = s11Var2.f37567s;
                int i11 = this.f36033c;
                w81Var2.d(i11, r11Var2.i(i11));
                return;
        }
    }
}
