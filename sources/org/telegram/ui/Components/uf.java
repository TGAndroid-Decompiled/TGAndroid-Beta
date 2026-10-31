package org.telegram.ui.Components;
public final class uf implements Runnable {
    public final int f30913a;
    public final wf f30914b;
    public final vh.p2 f30915c;

    public uf(wf wfVar, vh.p2 p2Var, int i10) {
        this.f30913a = i10;
        this.f30914b = wfVar;
        this.f30915c = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f30913a) {
            case 0:
                wf wfVar = this.f30914b;
                vh.p2 p2Var = this.f30915c;
                wfVar.removeView(p2Var);
                if (wfVar.f32161b == p2Var) {
                    wfVar.f32161b = null;
                    return;
                }
                return;
            case 1:
                this.f30914b.removeView(this.f30915c);
                return;
            case 2:
                this.f30914b.removeView(this.f30915c);
                return;
            default:
                wf wfVar2 = this.f30914b;
                vh.p2 p2Var2 = this.f30915c;
                wfVar2.removeView(p2Var2);
                if (wfVar2.f32159a == p2Var2) {
                    wfVar2.f32159a = null;
                    return;
                }
                return;
        }
    }
}
