package org.telegram.ui.Components;
public final class i7 implements r1.d {
    public final int f36069a;
    public final Object f36070b;

    public i7(Object obj, int i7) {
        this.f36069a = i7;
        this.f36070b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f36069a) {
            case 0:
                ((g8) this.f36070b).N1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                gc gcVar = (gc) this.f36070b;
                gcVar.f35466o = (int) f10;
                gcVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((lb) this.f36070b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                si siVar = (si) ((di.a4) this.f36070b).d;
                ki kiVar = siVar.f39736x2;
                if (kiVar == siVar.f39679h2 || kiVar == siVar.f39682i2 || (siVar.A1 && siVar.f39713r3 != null)) {
                    siVar.Q1(1);
                }
                siVar.f39736x2.m(siVar.f39686j4);
                siVar.Y0.g();
                siVar.f30192b.invalidate();
                return;
            case 4:
                xk xkVar = (xk) this.f36070b;
                xkVar.f42119n0 = f10;
                xkVar.m0();
                return;
            default:
                ((bb0) this.f36070b).y();
                return;
        }
    }
}
