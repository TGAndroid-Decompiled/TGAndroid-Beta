package org.telegram.ui.Components;
public final class j7 implements r1.d {
    public final int f36386a;
    public final Object f36387b;

    public j7(Object obj, int i7) {
        this.f36386a = i7;
        this.f36387b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f36386a) {
            case 0:
                ((f8) this.f36387b).N1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                gc gcVar = (gc) this.f36387b;
                gcVar.f35494o = (int) f10;
                gcVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((lb) this.f36387b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                ui uiVar = (ui) ((di.a4) this.f36387b).d;
                mi miVar = uiVar.f40429x2;
                if (miVar == uiVar.f40372h2 || miVar == uiVar.f40375i2 || (uiVar.A1 && uiVar.f40406r3 != null)) {
                    uiVar.Q1(1);
                }
                uiVar.f40429x2.m(uiVar.f40379j4);
                uiVar.Y0.g();
                uiVar.f30142b.invalidate();
                return;
            case 4:
                zk zkVar = (zk) this.f36387b;
                zkVar.f42875n0 = f10;
                zkVar.m0();
                return;
            default:
                ((cb0) this.f36387b).y();
                return;
        }
    }
}
