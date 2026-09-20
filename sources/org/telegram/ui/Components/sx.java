package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;
public final class sx implements Runnable {
    public final int f28217a;
    public final float f28218b;
    public final int f28219c;
    public final Object d;

    public sx(Object obj, float f7, int i10, int i11) {
        this.f28217a = i11;
        this.d = obj;
        this.f28218b = f7;
        this.f28219c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28217a) {
            case 0:
                float f7 = this.f28218b;
                int i10 = this.f28219c;
                kz kzVar = ((tx) this.d).F;
                try {
                    ji.o oVar = new ji.o(kzVar.P.getContext(), 0, f7);
                    oVar.f43124a = i10;
                    kzVar.Q.w0(oVar);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) this.d;
                float f10 = this.f28218b;
                int i11 = this.f28219c;
                try {
                    ji.o oVar2 = new ji.o(j71Var.f34792h0.getContext(), 0, f10);
                    oVar2.f43124a = i11;
                    j71Var.f34812r0.w0(oVar2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
