package org.telegram.ui.Components;
public final class j7 implements r1.d {
    public final int f36433a;
    public final Object f36434b;

    public j7(Object obj, int i7) {
        this.f36433a = i7;
        this.f36434b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f36433a) {
            case 0:
                ((f8) this.f36434b).N1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                gc gcVar = (gc) this.f36434b;
                gcVar.f35513o = (int) f10;
                gcVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((lb) this.f36434b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                ui uiVar = (ui) ((di.a4) this.f36434b).d;
                mi miVar = uiVar.f40452x2;
                if (miVar == uiVar.f40395h2 || miVar == uiVar.f40398i2 || (uiVar.A1 && uiVar.f40429r3 != null)) {
                    uiVar.Q1(1);
                }
                uiVar.f40452x2.m(uiVar.f40402j4);
                uiVar.Y0.g();
                uiVar.f30173b.invalidate();
                return;
            case 4:
                zk zkVar = (zk) this.f36434b;
                zkVar.f42912n0 = f10;
                zkVar.m0();
                return;
            default:
                ((cb0) this.f36434b).y();
                return;
        }
    }
}
