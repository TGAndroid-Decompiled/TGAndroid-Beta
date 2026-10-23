package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class zx implements Runnable {
    public final int f33056a;
    public final float f33057b;
    public final int f33058c;
    public final Object d;

    public zx(Object obj, float f7, int i10, int i11) {
        this.f33056a = i11;
        this.d = obj;
        this.f33057b = f7;
        this.f33058c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33056a) {
            case 0:
                float f7 = this.f33057b;
                int i10 = this.f33058c;
                tz tzVar = ((ay) this.d).F;
                try {
                    li.n nVar = new li.n(tzVar.P.getContext(), 0, f7);
                    nVar.f46062a = i10;
                    tzVar.Q.w0(nVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.x51 x51Var = (org.telegram.ui.x51) this.d;
                float f10 = this.f33057b;
                int i11 = this.f33058c;
                try {
                    li.n nVar2 = new li.n(x51Var.f43065h0.getContext(), 0, f10);
                    nVar2.f46062a = i11;
                    x51Var.f43085r0.w0(nVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
