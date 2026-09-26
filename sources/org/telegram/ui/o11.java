package org.telegram.ui;
public final class o11 implements Runnable {
    public final int f36032a;
    public final s11 f36033b;
    public final int f36034c;

    public o11(s11 s11Var, int i10, int i11) {
        this.f36032a = i11;
        this.f36033b = s11Var;
        this.f36034c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36032a) {
            case 0:
                s11 s11Var = this.f36033b;
                org.telegram.ui.Components.v81 v81Var = s11Var.f37566n;
                r11 r11Var = s11Var.f37568s;
                int i10 = this.f36034c;
                v81Var.d(i10, r11Var.i(i10));
                return;
            default:
                s11 s11Var2 = this.f36033b;
                org.telegram.ui.Components.v81 v81Var2 = s11Var2.f37566n;
                r11 r11Var2 = s11Var2.f37568s;
                int i11 = this.f36034c;
                v81Var2.d(i11, r11Var2.i(i11));
                return;
        }
    }
}
