package org.telegram.ui.Components;
public final class tz implements Runnable {
    public final int f28215a;
    public final boolean f28216b;
    public final boolean f28217c;
    public final boolean d;
    public final Object e;

    public tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28215a = i10;
        this.e = obj;
        this.f28216b = z10;
        this.f28217c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28215a) {
            case 0:
                vz vzVar = (vz) this.e;
                if (this.f28216b) {
                    zz zzVar = vzVar.J;
                    zzVar.f30672a = true;
                    zzVar.f30675b = true;
                }
                if (this.f28217c) {
                    vzVar.f29493x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.f29482a0 - currentTimeMillis) > 30) {
                    vzVar.f29482a0 = currentTimeMillis;
                    vzVar.f29487d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.wg0) this.e).w1(this.f28216b, this.f28217c, this.d);
                return;
        }
    }
}
