package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class zx implements Runnable {
    public final int f33049a;
    public final float f33050b;
    public final int f33051c;
    public final Object d;

    public zx(Object obj, float f7, int i10, int i11) {
        this.f33049a = i11;
        this.d = obj;
        this.f33050b = f7;
        this.f33051c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33049a) {
            case 0:
                float f7 = this.f33050b;
                int i10 = this.f33051c;
                tz tzVar = ((ay) this.d).F;
                try {
                    li.n nVar = new li.n(tzVar.P.getContext(), 0, f7);
                    nVar.f46051a = i10;
                    tzVar.Q.w0(nVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.x51 x51Var = (org.telegram.ui.x51) this.d;
                float f10 = this.f33050b;
                int i11 = this.f33051c;
                try {
                    li.n nVar2 = new li.n(x51Var.f43056h0.getContext(), 0, f10);
                    nVar2.f46051a = i11;
                    x51Var.f43076r0.w0(nVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
