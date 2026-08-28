package org.telegram.ui.Components;
public final class fz implements Runnable {
    public final int f28607a;
    public final boolean f28608b;
    public final boolean f28609c;
    public final boolean d;
    public final Object f28610e;

    public fz(Object obj, boolean z10, boolean z11, boolean z12, int i9) {
        this.f28607a = i9;
        this.f28610e = obj;
        this.f28608b = z10;
        this.f28609c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28607a) {
            case 0:
                hz hzVar = (hz) this.f28610e;
                if (this.f28608b) {
                    lz lzVar = hzVar.F;
                    lzVar.f30586a = true;
                    lzVar.f30589b = true;
                }
                if (this.f28609c) {
                    hzVar.f29243x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(hzVar.W - currentTimeMillis) > 30) {
                    hzVar.W = currentTimeMillis;
                    hzVar.Z.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.fg0) this.f28610e).w1(this.f28608b, this.f28609c, this.d);
                return;
        }
    }
}
