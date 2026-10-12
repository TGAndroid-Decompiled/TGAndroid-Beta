package org.telegram.ui.Components;
public final class ug implements Runnable {
    public final int f31162a;
    public final wg f31163b;
    public final ci.d4 f31164c;

    public ug(wg wgVar, ci.d4 d4Var, int i10) {
        this.f31162a = i10;
        this.f31163b = wgVar;
        this.f31164c = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f31162a) {
            case 0:
                wg wgVar = this.f31163b;
                ci.d4 d4Var = this.f31164c;
                wgVar.removeView(d4Var);
                if (wgVar.f32387b == d4Var) {
                    wgVar.f32387b = null;
                    return;
                }
                return;
            case 1:
                this.f31163b.removeView(this.f31164c);
                return;
            case 2:
                this.f31163b.removeView(this.f31164c);
                return;
            default:
                wg wgVar2 = this.f31163b;
                ci.d4 d4Var2 = this.f31164c;
                wgVar2.removeView(d4Var2);
                if (wgVar2.f32385a == d4Var2) {
                    wgVar2.f32385a = null;
                    return;
                }
                return;
        }
    }
}
