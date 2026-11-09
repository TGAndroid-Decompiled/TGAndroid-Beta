package org.telegram.ui.Components;
public final class yf implements Runnable {
    public final int f40708a;
    public final ag f40709b;
    public final fi.m3 f40710c;

    public yf(ag agVar, fi.m3 m3Var, int i7) {
        this.f40708a = i7;
        this.f40709b = agVar;
        this.f40710c = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f40708a) {
            case 0:
                ag agVar = this.f40709b;
                fi.m3 m3Var = this.f40710c;
                agVar.removeView(m3Var);
                if (agVar.f31792b == m3Var) {
                    agVar.f31792b = null;
                    return;
                }
                return;
            case 1:
                this.f40709b.removeView(this.f40710c);
                return;
            case 2:
                this.f40709b.removeView(this.f40710c);
                return;
            default:
                ag agVar2 = this.f40709b;
                fi.m3 m3Var2 = this.f40710c;
                agVar2.removeView(m3Var2);
                if (agVar2.f31790a == m3Var2) {
                    agVar2.f31790a = null;
                    return;
                }
                return;
        }
    }
}
