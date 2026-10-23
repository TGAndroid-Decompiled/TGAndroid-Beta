package org.telegram.ui.Components;
public final class qg implements Runnable {
    public final int f29893a;
    public final sg f29894b;
    public final ei.x3 f29895c;

    public qg(sg sgVar, ei.x3 x3Var, int i10) {
        this.f29893a = i10;
        this.f29894b = sgVar;
        this.f29895c = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f29893a) {
            case 0:
                sg sgVar = this.f29894b;
                ei.x3 x3Var = this.f29895c;
                sgVar.removeView(x3Var);
                if (sgVar.f30481b == x3Var) {
                    sgVar.f30481b = null;
                    return;
                }
                return;
            case 1:
                this.f29894b.removeView(this.f29895c);
                return;
            case 2:
                this.f29894b.removeView(this.f29895c);
                return;
            default:
                sg sgVar2 = this.f29894b;
                ei.x3 x3Var2 = this.f29895c;
                sgVar2.removeView(x3Var2);
                if (sgVar2.f30479a == x3Var2) {
                    sgVar2.f30479a = null;
                    return;
                }
                return;
        }
    }
}
