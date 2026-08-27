package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

public final class ex implements Runnable {

    public final int f28166a;

    public final float f28167b;

    public final int f28168c;
    public final Object d;

    public ex(Object obj, float f10, int i10, int i11) {
        this.f28166a = i11;
        this.d = obj;
        this.f28167b = f10;
        this.f28168c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28166a) {
            case 0:
                gx gxVar = (gx) this.d;
                float f10 = this.f28167b;
                int i10 = this.f28168c;
                yy yyVar = gxVar.B;
                try {
                    sh.n nVar = new sh.n(yyVar.L.getContext(), 0, f10);
                    nVar.f5731a = i10;
                    yyVar.M.w0(nVar);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) this.d;
                float f11 = this.f28167b;
                int i11 = this.f28168c;
                try {
                    sh.n nVar2 = new sh.n(a61Var.f36392d0.getContext(), 0, f11);
                    nVar2.f5731a = i11;
                    a61Var.f36413n0.w0(nVar2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                break;
        }
    }
}
