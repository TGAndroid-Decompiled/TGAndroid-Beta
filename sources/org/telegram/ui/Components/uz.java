package org.telegram.ui.Components;
public final class uz implements Runnable {
    public final int f28951a;
    public final boolean f28952b;
    public final boolean f28953c;
    public final boolean d;
    public final Object e;

    public uz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28951a = i10;
        this.e = obj;
        this.f28952b = z10;
        this.f28953c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f28951a) {
            case 0:
                wz wzVar = (wz) this.e;
                if (this.f28952b) {
                    a00 a00Var = wzVar.J;
                    a00Var.f22471a = true;
                    a00Var.f22474b = true;
                }
                if (this.f28953c) {
                    wzVar.f30219x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(wzVar.f30208a0 - currentTimeMillis) > 30) {
                    wzVar.f30208a0 = currentTimeMillis;
                    wzVar.f30213d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.qg0) this.e).w1(this.f28952b, this.f28953c, this.d);
                return;
        }
    }
}
