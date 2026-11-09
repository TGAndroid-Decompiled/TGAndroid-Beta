package org.telegram.ui.Components;
public final class e7 implements r1.d {
    public final int f33326a;
    public final Object f33327b;

    public e7(Object obj, int i7) {
        this.f33326a = i7;
        this.f33327b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33326a) {
            case 0:
                ((b8) this.f33327b).J1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                cc ccVar = (cc) this.f33327b;
                ccVar.f32632o = (int) f10;
                ccVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((gb) this.f33327b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                di diVar = (di) ((bi.y4) this.f33327b).d;
                vh vhVar = diVar.f33051t2;
                if (vhVar == diVar.d2 || vhVar == diVar.f32998e2 || (diVar.f33062w1 && diVar.f33029n3 != null)) {
                    diVar.P1(1);
                }
                diVar.f33051t2.m(diVar.f33003f4);
                diVar.X0.g();
                diVar.f28624b.invalidate();
                return;
            case 4:
                ik ikVar = (ik) this.f33327b;
                ikVar.m0 = f10;
                ikVar.m0();
                return;
            default:
                ((ra0) this.f33327b).y();
                return;
        }
    }
}
