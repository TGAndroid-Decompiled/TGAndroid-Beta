package org.telegram.ui.Components;
public final class c7 implements q1.d {
    public final int f32572a;
    public final Object f32573b;

    public c7(Object obj, int i3) {
        this.f32572a = i3;
        this.f32573b = obj;
    }

    @Override
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.f32572a) {
            case 0:
                ((z7) this.f32573b).K1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                ac acVar = (ac) this.f32573b;
                acVar.f31797o = (int) f10;
                acVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((fb) this.f32573b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                bi biVar = (bi) ((ci.h4) this.f32573b).d;
                th thVar = biVar.f32279u2;
                if (thVar == biVar.f32223e2 || thVar == biVar.f32226f2 || (biVar.f32290x1 && biVar.f32256o3 != null)) {
                    biVar.P1(1);
                }
                biVar.f32279u2.m(biVar.f32231g4);
                biVar.Y0.g();
                biVar.f28586b.invalidate();
                return;
            case 4:
                hk hkVar = (hk) this.f32573b;
                hkVar.f34417n0 = f10;
                hkVar.m0();
                return;
            default:
                ((la0) this.f32573b).y();
                return;
        }
    }
}
