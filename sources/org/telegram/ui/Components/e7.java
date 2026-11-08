package org.telegram.ui.Components;
public final class e7 implements r1.d {
    public final int f33213a;
    public final Object f33214b;

    public e7(Object obj, int i7) {
        this.f33213a = i7;
        this.f33214b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33213a) {
            case 0:
                ((b8) this.f33214b).J1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                cc ccVar = (cc) this.f33214b;
                ccVar.f32550o = (int) f10;
                ccVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((gb) this.f33214b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                di diVar = (di) ((bi.y4) this.f33214b).d;
                vh vhVar = diVar.f32996t2;
                if (vhVar == diVar.d2 || vhVar == diVar.f32943e2 || (diVar.f33007w1 && diVar.f32974n3 != null)) {
                    diVar.P1(1);
                }
                diVar.f32996t2.m(diVar.f32948f4);
                diVar.X0.g();
                diVar.f28619b.invalidate();
                return;
            case 4:
                ik ikVar = (ik) this.f33214b;
                ikVar.m0 = f10;
                ikVar.m0();
                return;
            default:
                ((qa0) this.f33214b).y();
                return;
        }
    }
}
