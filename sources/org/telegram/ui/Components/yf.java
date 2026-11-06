package org.telegram.ui.Components;
public final class yf implements Runnable {
    public final int f40606a;
    public final ag f40607b;
    public final fi.m3 f40608c;

    public yf(ag agVar, fi.m3 m3Var, int i7) {
        this.f40606a = i7;
        this.f40607b = agVar;
        this.f40608c = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f40606a) {
            case 0:
                ag agVar = this.f40607b;
                fi.m3 m3Var = this.f40608c;
                agVar.removeView(m3Var);
                if (agVar.f31791b == m3Var) {
                    agVar.f31791b = null;
                    return;
                }
                return;
            case 1:
                this.f40607b.removeView(this.f40608c);
                return;
            case 2:
                this.f40607b.removeView(this.f40608c);
                return;
            default:
                ag agVar2 = this.f40607b;
                fi.m3 m3Var2 = this.f40608c;
                agVar2.removeView(m3Var2);
                if (agVar2.f31789a == m3Var2) {
                    agVar2.f31789a = null;
                    return;
                }
                return;
        }
    }
}
