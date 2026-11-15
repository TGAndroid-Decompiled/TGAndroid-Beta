package org.telegram.ui.Components;
public final class c7 implements r1.d {
    public final int f33518a;
    public final Object f33519b;

    public c7(Object obj, int i7) {
        this.f33518a = i7;
        this.f33519b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33518a) {
            case 0:
                ((y7) this.f33519b).N1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                xb xbVar = (xb) this.f33519b;
                xbVar.f41648o = (int) f10;
                xbVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((cb) this.f33519b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                ki kiVar = (ki) ((di.y3) this.f33519b).d;
                ci ciVar = kiVar.f36513x2;
                if (ciVar == kiVar.f36456h2 || ciVar == kiVar.f36459i2 || (kiVar.A1 && kiVar.f36490r3 != null)) {
                    kiVar.P1(1);
                }
                kiVar.f36513x2.m(kiVar.f36463j4);
                kiVar.Y0.g();
                kiVar.f29682b.invalidate();
                return;
            case 4:
                qk qkVar = (qk) this.f33519b;
                qkVar.f38679n0 = f10;
                qkVar.m0();
                return;
            default:
                ((ra0) this.f33519b).y();
                return;
        }
    }
}
