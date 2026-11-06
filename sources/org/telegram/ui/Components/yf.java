package org.telegram.ui.Components;
public final class yf implements Runnable {
    public final int f40637a;
    public final ag f40638b;
    public final fi.m3 f40639c;

    public yf(ag agVar, fi.m3 m3Var, int i7) {
        this.f40637a = i7;
        this.f40638b = agVar;
        this.f40639c = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f40637a) {
            case 0:
                ag agVar = this.f40638b;
                fi.m3 m3Var = this.f40639c;
                agVar.removeView(m3Var);
                if (agVar.f31799b == m3Var) {
                    agVar.f31799b = null;
                    return;
                }
                return;
            case 1:
                this.f40638b.removeView(this.f40639c);
                return;
            case 2:
                this.f40638b.removeView(this.f40639c);
                return;
            default:
                ag agVar2 = this.f40638b;
                fi.m3 m3Var2 = this.f40639c;
                agVar2.removeView(m3Var2);
                if (agVar2.f31797a == m3Var2) {
                    agVar2.f31797a = null;
                    return;
                }
                return;
        }
    }
}
