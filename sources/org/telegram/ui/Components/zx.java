package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class zx implements Runnable {
    public final int f33055a;
    public final float f33056b;
    public final int f33057c;
    public final Object d;

    public zx(Object obj, float f7, int i10, int i11) {
        this.f33055a = i11;
        this.d = obj;
        this.f33056b = f7;
        this.f33057c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33055a) {
            case 0:
                float f7 = this.f33056b;
                int i10 = this.f33057c;
                tz tzVar = ((ay) this.d).F;
                try {
                    li.n nVar = new li.n(tzVar.P.getContext(), 0, f7);
                    nVar.f46061a = i10;
                    tzVar.Q.w0(nVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.x51 x51Var = (org.telegram.ui.x51) this.d;
                float f10 = this.f33056b;
                int i11 = this.f33057c;
                try {
                    li.n nVar2 = new li.n(x51Var.f43064h0.getContext(), 0, f10);
                    nVar2.f46061a = i11;
                    x51Var.f43084r0.w0(nVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
