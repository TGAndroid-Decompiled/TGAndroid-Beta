package org.telegram.ui.Components;
public final class pg implements Runnable {
    public final int f38547a;
    public final rg f38548b;
    public final hi.l3 f38549c;

    public pg(rg rgVar, hi.l3 l3Var, int i7) {
        this.f38547a = i7;
        this.f38548b = rgVar;
        this.f38549c = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f38547a) {
            case 0:
                rg rgVar = this.f38548b;
                hi.l3 l3Var = this.f38549c;
                rgVar.removeView(l3Var);
                if (rgVar.f39146b == l3Var) {
                    rgVar.f39146b = null;
                    return;
                }
                return;
            case 1:
                this.f38548b.removeView(this.f38549c);
                return;
            case 2:
                this.f38548b.removeView(this.f38549c);
                return;
            default:
                rg rgVar2 = this.f38548b;
                hi.l3 l3Var2 = this.f38549c;
                rgVar2.removeView(l3Var2);
                if (rgVar2.f39144a == l3Var2) {
                    rgVar2.f39144a = null;
                    return;
                }
                return;
        }
    }
}
