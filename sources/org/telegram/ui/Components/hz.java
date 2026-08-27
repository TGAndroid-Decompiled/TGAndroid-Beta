package org.telegram.ui.Components;

public final class hz implements Runnable {

    public final int f29182a;

    public final boolean f29183b;

    public final boolean f29184c;
    public final boolean d;

    public final Object f29185e;

    public hz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f29182a = i10;
        this.f29185e = obj;
        this.f29183b = z10;
        this.f29184c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f29182a) {
            case 0:
                jz jzVar = (jz) this.f29185e;
                if (this.f29183b) {
                    nz nzVar = jzVar.F;
                    nzVar.f31063a = true;
                    nzVar.f31066b = true;
                }
                if (this.f29184c) {
                    jzVar.f29861x = true;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(jzVar.W - jCurrentTimeMillis) > 30) {
                    jzVar.W = jCurrentTimeMillis;
                    jzVar.Z.run();
                }
                break;
            default:
                ((org.telegram.ui.ig0) this.f29185e).w1(this.f29183b, this.f29184c, this.d);
                break;
        }
    }
}
