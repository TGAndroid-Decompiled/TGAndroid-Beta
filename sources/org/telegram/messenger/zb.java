package org.telegram.messenger;
public final class zb implements Runnable {
    public final int f19493a;
    public final cc f19494b;

    public zb(cc ccVar, int i10) {
        this.f19493a = i10;
        this.f19494b = ccVar;
    }

    @Override
    public final void run() {
        int i10 = this.f19493a;
        cc ccVar = this.f19494b;
        switch (i10) {
            case 0:
                hc hcVar = ccVar.h;
                ThreadLocal threadLocal = hc.I;
                hcVar.V(true);
                return;
            case 1:
                ccVar.h.f15870u.remove(ccVar.f14974a.e);
                i0.g3(new zb(ccVar, 3));
                return;
            case 2:
                hc hcVar2 = ccVar.h;
                ThreadLocal threadLocal2 = hc.I;
                hcVar2.V(true);
                return;
            default:
                vb vbVar = ccVar.f14974a;
                zs.f(vbVar.f18498o).k(143, vbVar.e, 1);
                return;
        }
    }
}
