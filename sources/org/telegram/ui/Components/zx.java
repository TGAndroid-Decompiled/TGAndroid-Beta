package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class zx implements Runnable {
    public final int f33052a;
    public final float f33053b;
    public final int f33054c;
    public final Object d;

    public zx(Object obj, float f7, int i10, int i11) {
        this.f33052a = i11;
        this.d = obj;
        this.f33053b = f7;
        this.f33054c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33052a) {
            case 0:
                float f7 = this.f33053b;
                int i10 = this.f33054c;
                tz tzVar = ((ay) this.d).F;
                try {
                    li.n nVar = new li.n(tzVar.P.getContext(), 0, f7);
                    nVar.f46058a = i10;
                    tzVar.Q.w0(nVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.x51 x51Var = (org.telegram.ui.x51) this.d;
                float f10 = this.f33053b;
                int i11 = this.f33054c;
                try {
                    li.n nVar2 = new li.n(x51Var.f43061h0.getContext(), 0, f10);
                    nVar2.f46058a = i11;
                    x51Var.f43081r0.w0(nVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
