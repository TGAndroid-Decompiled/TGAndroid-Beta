package org.telegram.ui.Components;
public final class j7 implements r1.d {
    public final int f36428a;
    public final Object f36429b;

    public j7(Object obj, int i7) {
        this.f36428a = i7;
        this.f36429b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f36428a) {
            case 0:
                ((f8) this.f36429b).N1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                gc gcVar = (gc) this.f36429b;
                gcVar.f35532o = (int) f10;
                gcVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((lb) this.f36429b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                ui uiVar = (ui) ((di.a4) this.f36429b).d;
                mi miVar = uiVar.f40445x2;
                if (miVar == uiVar.f40388h2 || miVar == uiVar.f40391i2 || (uiVar.A1 && uiVar.f40422r3 != null)) {
                    uiVar.Q1(1);
                }
                uiVar.f40445x2.m(uiVar.f40395j4);
                uiVar.Y0.g();
                uiVar.f30176b.invalidate();
                return;
            case 4:
                zk zkVar = (zk) this.f36429b;
                zkVar.f42916n0 = f10;
                zkVar.m0();
                return;
            default:
                ((cb0) this.f36429b).y();
                return;
        }
    }
}
