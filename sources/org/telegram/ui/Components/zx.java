package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class zx implements Runnable {
    public final int f33047a;
    public final float f33048b;
    public final int f33049c;
    public final Object d;

    public zx(Object obj, float f7, int i10, int i11) {
        this.f33047a = i11;
        this.d = obj;
        this.f33048b = f7;
        this.f33049c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33047a) {
            case 0:
                float f7 = this.f33048b;
                int i10 = this.f33049c;
                tz tzVar = ((ay) this.d).F;
                try {
                    li.n nVar = new li.n(tzVar.P.getContext(), 0, f7);
                    nVar.f46099a = i10;
                    tzVar.Q.w0(nVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.z51 z51Var = (org.telegram.ui.z51) this.d;
                float f10 = this.f33048b;
                int i11 = this.f33049c;
                try {
                    li.n nVar2 = new li.n(z51Var.f43622h0.getContext(), 0, f10);
                    nVar2.f46099a = i11;
                    z51Var.f43642r0.w0(nVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
