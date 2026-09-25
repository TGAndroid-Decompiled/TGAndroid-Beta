package org.telegram.ui;
public final class o11 implements Runnable {
    public final int f36033a;
    public final s11 f36034b;
    public final int f36035c;

    public o11(s11 s11Var, int i10, int i11) {
        this.f36033a = i11;
        this.f36034b = s11Var;
        this.f36035c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36033a) {
            case 0:
                s11 s11Var = this.f36034b;
                org.telegram.ui.Components.v81 v81Var = s11Var.f37567n;
                r11 r11Var = s11Var.f37569s;
                int i10 = this.f36035c;
                v81Var.d(i10, r11Var.i(i10));
                return;
            default:
                s11 s11Var2 = this.f36034b;
                org.telegram.ui.Components.v81 v81Var2 = s11Var2.f37567n;
                r11 r11Var2 = s11Var2.f37569s;
                int i11 = this.f36035c;
                v81Var2.d(i11, r11Var2.i(i11));
                return;
        }
    }
}
