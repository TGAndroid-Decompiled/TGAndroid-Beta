package org.telegram.ui.Components;
public final class c7 implements r1.d {
    public final int f33521a;
    public final Object f33522b;

    public c7(Object obj, int i7) {
        this.f33521a = i7;
        this.f33522b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33521a) {
            case 0:
                ((y7) this.f33522b).N1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                xb xbVar = (xb) this.f33522b;
                xbVar.f41640o = (int) f10;
                xbVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((cb) this.f33522b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                ki kiVar = (ki) ((di.y3) this.f33522b).d;
                ci ciVar = kiVar.f36501x2;
                if (ciVar == kiVar.f36444h2 || ciVar == kiVar.f36447i2 || (kiVar.A1 && kiVar.f36478r3 != null)) {
                    kiVar.P1(1);
                }
                kiVar.f36501x2.m(kiVar.f36451j4);
                kiVar.Y0.g();
                kiVar.f29682b.invalidate();
                return;
            case 4:
                qk qkVar = (qk) this.f33522b;
                qkVar.f38677n0 = f10;
                qkVar.m0();
                return;
            default:
                ((ra0) this.f33522b).y();
                return;
        }
    }
}
