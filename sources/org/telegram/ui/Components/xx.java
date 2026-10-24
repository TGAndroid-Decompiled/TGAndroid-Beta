package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class xx implements Runnable {
    public final int f32718a;
    public final float f32719b;
    public final int f32720c;
    public final Object d;

    public xx(Object obj, float f7, int i10, int i11) {
        this.f32718a = i11;
        this.d = obj;
        this.f32719b = f7;
        this.f32720c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32718a) {
            case 0:
                float f7 = this.f32719b;
                int i10 = this.f32720c;
                rz rzVar = ((yx) this.d).F;
                try {
                    li.n nVar = new li.n(rzVar.P.getContext(), 0, f7);
                    nVar.f46483a = i10;
                    rzVar.Q.w0(nVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) this.d;
                float f10 = this.f32719b;
                int i11 = this.f32720c;
                try {
                    li.n nVar2 = new li.n(a61Var.f35622h0.getContext(), 0, f10);
                    nVar2.f46483a = i11;
                    a61Var.f35642r0.w0(nVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
