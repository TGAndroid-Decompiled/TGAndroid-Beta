package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class xx implements Runnable {
    public final int f29182a;
    public final float f29183b;
    public final int f29184c;
    public final Object d;

    public xx(Object obj, float f7, int i10, int i11) {
        this.f29182a = i11;
        this.d = obj;
        this.f29183b = f7;
        this.f29184c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29182a) {
            case 0:
                float f7 = this.f29183b;
                int i10 = this.f29184c;
                rz rzVar = ((yx) this.d).F;
                try {
                    ii.o oVar = new ii.o(rzVar.P.getContext(), 0, f7);
                    oVar.f41760a = i10;
                    rzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.l71 l71Var = (org.telegram.ui.l71) this.d;
                float f10 = this.f29183b;
                int i11 = this.f29184c;
                try {
                    ii.o oVar2 = new ii.o(l71Var.f34570h0.getContext(), 0, f10);
                    oVar2.f41760a = i11;
                    l71Var.f34590r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
