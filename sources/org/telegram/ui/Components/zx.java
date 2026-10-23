package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class zx implements Runnable {
    public final int f33356a;
    public final float f33357b;
    public final int f33358c;
    public final Object d;

    public zx(Object obj, float f7, int i10, int i11) {
        this.f33356a = i11;
        this.d = obj;
        this.f33357b = f7;
        this.f33358c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33356a) {
            case 0:
                float f7 = this.f33357b;
                int i10 = this.f33358c;
                tz tzVar = ((ay) this.d).F;
                try {
                    li.n nVar = new li.n(tzVar.P.getContext(), 0, f7);
                    nVar.f46484a = i10;
                    tzVar.Q.w0(nVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.b61 b61Var = (org.telegram.ui.b61) this.d;
                float f10 = this.f33357b;
                int i11 = this.f33358c;
                try {
                    li.n nVar2 = new li.n(b61Var.f35905h0.getContext(), 0, f10);
                    nVar2.f46484a = i11;
                    b61Var.f35925r0.w0(nVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
