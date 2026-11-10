package org.telegram.ui.Components;
public final class xf implements Runnable {
    public final int f40295a;
    public final zf f40296b;
    public final fi.m3 f40297c;

    public xf(zf zfVar, fi.m3 m3Var, int i7) {
        this.f40295a = i7;
        this.f40296b = zfVar;
        this.f40297c = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f40295a) {
            case 0:
                zf zfVar = this.f40296b;
                fi.m3 m3Var = this.f40297c;
                zfVar.removeView(m3Var);
                if (zfVar.f40934b == m3Var) {
                    zfVar.f40934b = null;
                    return;
                }
                return;
            case 1:
                this.f40296b.removeView(this.f40297c);
                return;
            case 2:
                this.f40296b.removeView(this.f40297c);
                return;
            default:
                zf zfVar2 = this.f40296b;
                fi.m3 m3Var2 = this.f40297c;
                zfVar2.removeView(m3Var2);
                if (zfVar2.f40932a == m3Var2) {
                    zfVar2.f40932a = null;
                    return;
                }
                return;
        }
    }
}
