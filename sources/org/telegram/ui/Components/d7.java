package org.telegram.ui.Components;
public final class d7 implements r1.d {
    public final int f32911a;
    public final Object f32912b;

    public d7(Object obj, int i7) {
        this.f32911a = i7;
        this.f32912b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f32911a) {
            case 0:
                ((a8) this.f32912b).M1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                bc bcVar = (bc) this.f32912b;
                bcVar.f32208o = (int) f10;
                bcVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((fb) this.f32912b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                ci ciVar = (ci) ((bi.y4) this.f32912b).d;
                uh uhVar = ciVar.f32664w2;
                if (uhVar == ciVar.f32608g2 || uhVar == ciVar.f32611h2 || (ciVar.f32675z1 && ciVar.f32641q3 != null)) {
                    ciVar.P1(1);
                }
                ciVar.f32664w2.m(ciVar.f32616i4);
                ciVar.X0.g();
                ciVar.f28672b.invalidate();
                return;
            case 4:
                hk hkVar = (hk) this.f32912b;
                hkVar.m0 = f10;
                hkVar.m0();
                return;
            default:
                ((qa0) this.f32912b).y();
                return;
        }
    }
}
