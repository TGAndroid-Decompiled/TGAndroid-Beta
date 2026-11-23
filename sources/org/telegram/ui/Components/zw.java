package org.telegram.ui.Components;
public final class zw implements Runnable {
    public final int f43051a;
    public final float f43052b;
    public final int f43053c;
    public final Object d;

    public zw(Object obj, float f10, int i7, int i10) {
        this.f43051a = i10;
        this.d = obj;
        this.f43052b = f10;
        this.f43053c = i7;
    }

    @Override
    public final void run() {
        switch (this.f43051a) {
            case 0:
                float f10 = this.f43052b;
                int i7 = this.f43053c;
                qy qyVar = ((ax) this.d).G;
                try {
                    pi.l lVar = new pi.l(qyVar.Q.getContext(), 0, f10);
                    lVar.f59190a = i7;
                    qyVar.R.w0(lVar);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.q11 q11Var = (org.telegram.ui.q11) this.d;
                float f11 = this.f43052b;
                int i10 = this.f43053c;
                try {
                    pi.l lVar2 = new pi.l(q11Var.f51247i0.getContext(), 0, f11);
                    lVar2.f59190a = i10;
                    q11Var.f51267s0.w0(lVar2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
