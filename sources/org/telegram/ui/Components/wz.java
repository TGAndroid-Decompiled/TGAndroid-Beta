package org.telegram.ui.Components;
public final class wz implements Runnable {
    public final int f32749a;
    public final boolean f32750b;
    public final boolean f32751c;
    public final boolean d;
    public final Object f32752e;

    public wz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f32749a = i10;
        this.f32752e = obj;
        this.f32750b = z10;
        this.f32751c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f32749a) {
            case 0:
                yz yzVar = (yz) this.f32752e;
                if (this.f32750b) {
                    c00 c00Var = yzVar.J;
                    c00Var.f25162a = true;
                    c00Var.f25165b = true;
                }
                if (this.f32751c) {
                    yzVar.f33386x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(yzVar.f33374a0 - currentTimeMillis) > 30) {
                    yzVar.f33374a0 = currentTimeMillis;
                    yzVar.f33379d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ug0) this.f32752e).w1(this.f32750b, this.f32751c, this.d);
                return;
        }
    }
}
