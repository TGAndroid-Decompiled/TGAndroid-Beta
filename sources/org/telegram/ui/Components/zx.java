package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class zx implements Runnable {
    public final int f33040a;
    public final float f33041b;
    public final int f33042c;
    public final Object d;

    public zx(Object obj, float f7, int i10, int i11) {
        this.f33040a = i11;
        this.d = obj;
        this.f33041b = f7;
        this.f33042c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33040a) {
            case 0:
                float f7 = this.f33041b;
                int i10 = this.f33042c;
                tz tzVar = ((ay) this.d).F;
                try {
                    li.n nVar = new li.n(tzVar.P.getContext(), 0, f7);
                    nVar.f46079a = i10;
                    tzVar.Q.w0(nVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.z51 z51Var = (org.telegram.ui.z51) this.d;
                float f10 = this.f33041b;
                int i11 = this.f33042c;
                try {
                    li.n nVar2 = new li.n(z51Var.f43596h0.getContext(), 0, f10);
                    nVar2.f46079a = i11;
                    z51Var.f43616r0.w0(nVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
