package org.telegram.ui.Components;
public final class ug implements Runnable {
    public final int f31157a;
    public final wg f31158b;
    public final ci.d4 f31159c;

    public ug(wg wgVar, ci.d4 d4Var, int i10) {
        this.f31157a = i10;
        this.f31158b = wgVar;
        this.f31159c = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f31157a) {
            case 0:
                wg wgVar = this.f31158b;
                ci.d4 d4Var = this.f31159c;
                wgVar.removeView(d4Var);
                if (wgVar.f32375c == d4Var) {
                    wgVar.f32375c = null;
                    return;
                }
                return;
            case 1:
                this.f31158b.removeView(this.f31159c);
                return;
            case 2:
                this.f31158b.removeView(this.f31159c);
                return;
            default:
                wg wgVar2 = this.f31158b;
                ci.d4 d4Var2 = this.f31159c;
                wgVar2.removeView(d4Var2);
                if (wgVar2.f32373b == d4Var2) {
                    wgVar2.f32373b = null;
                    return;
                }
                return;
        }
    }
}
