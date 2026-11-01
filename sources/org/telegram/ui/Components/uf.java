package org.telegram.ui.Components;
public final class uf implements Runnable {
    public final int f30947a;
    public final wf f30948b;
    public final vh.p2 f30949c;

    public uf(wf wfVar, vh.p2 p2Var, int i10) {
        this.f30947a = i10;
        this.f30948b = wfVar;
        this.f30949c = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f30947a) {
            case 0:
                wf wfVar = this.f30948b;
                vh.p2 p2Var = this.f30949c;
                wfVar.removeView(p2Var);
                if (wfVar.f32227b == p2Var) {
                    wfVar.f32227b = null;
                    return;
                }
                return;
            case 1:
                this.f30948b.removeView(this.f30949c);
                return;
            case 2:
                this.f30948b.removeView(this.f30949c);
                return;
            default:
                wf wfVar2 = this.f30948b;
                vh.p2 p2Var2 = this.f30949c;
                wfVar2.removeView(p2Var2);
                if (wfVar2.f32225a == p2Var2) {
                    wfVar2.f32225a = null;
                    return;
                }
                return;
        }
    }
}
