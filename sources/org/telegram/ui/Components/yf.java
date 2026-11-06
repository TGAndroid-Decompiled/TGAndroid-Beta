package org.telegram.ui.Components;
public final class yf implements Runnable {
    public final int f40625a;
    public final ag f40626b;
    public final fi.m3 f40627c;

    public yf(ag agVar, fi.m3 m3Var, int i7) {
        this.f40625a = i7;
        this.f40626b = agVar;
        this.f40627c = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f40625a) {
            case 0:
                ag agVar = this.f40626b;
                fi.m3 m3Var = this.f40627c;
                agVar.removeView(m3Var);
                if (agVar.f31803b == m3Var) {
                    agVar.f31803b = null;
                    return;
                }
                return;
            case 1:
                this.f40626b.removeView(this.f40627c);
                return;
            case 2:
                this.f40626b.removeView(this.f40627c);
                return;
            default:
                ag agVar2 = this.f40626b;
                fi.m3 m3Var2 = this.f40627c;
                agVar2.removeView(m3Var2);
                if (agVar2.f31801a == m3Var2) {
                    agVar2.f31801a = null;
                    return;
                }
                return;
        }
    }
}
