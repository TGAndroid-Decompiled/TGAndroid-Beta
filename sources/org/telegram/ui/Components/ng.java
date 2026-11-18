package org.telegram.ui.Components;
public final class ng implements Runnable {
    public final int f37782a;
    public final pg f37783b;
    public final hi.m3 f37784c;

    public ng(pg pgVar, hi.m3 m3Var, int i7) {
        this.f37782a = i7;
        this.f37783b = pgVar;
        this.f37784c = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f37782a) {
            case 0:
                pg pgVar = this.f37783b;
                hi.m3 m3Var = this.f37784c;
                pgVar.removeView(m3Var);
                if (pgVar.f38398b == m3Var) {
                    pgVar.f38398b = null;
                    return;
                }
                return;
            case 1:
                this.f37783b.removeView(this.f37784c);
                return;
            case 2:
                this.f37783b.removeView(this.f37784c);
                return;
            default:
                pg pgVar2 = this.f37783b;
                hi.m3 m3Var2 = this.f37784c;
                pgVar2.removeView(m3Var2);
                if (pgVar2.f38396a == m3Var2) {
                    pgVar2.f38396a = null;
                    return;
                }
                return;
        }
    }
}
