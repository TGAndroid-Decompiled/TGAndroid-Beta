package org.telegram.ui.Components;
public final class yf implements Runnable {
    public final int f40663a;
    public final ag f40664b;
    public final fi.m3 f40665c;

    public yf(ag agVar, fi.m3 m3Var, int i7) {
        this.f40663a = i7;
        this.f40664b = agVar;
        this.f40665c = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f40663a) {
            case 0:
                ag agVar = this.f40664b;
                fi.m3 m3Var = this.f40665c;
                agVar.removeView(m3Var);
                if (agVar.f31808b == m3Var) {
                    agVar.f31808b = null;
                    return;
                }
                return;
            case 1:
                this.f40664b.removeView(this.f40665c);
                return;
            case 2:
                this.f40664b.removeView(this.f40665c);
                return;
            default:
                ag agVar2 = this.f40664b;
                fi.m3 m3Var2 = this.f40665c;
                agVar2.removeView(m3Var2);
                if (agVar2.f31806a == m3Var2) {
                    agVar2.f31806a = null;
                    return;
                }
                return;
        }
    }
}
