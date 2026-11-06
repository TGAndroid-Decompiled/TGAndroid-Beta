package org.telegram.ui.Components;
public final class e7 implements r1.d {
    public final int f33165a;
    public final Object f33166b;

    public e7(Object obj, int i7) {
        this.f33165a = i7;
        this.f33166b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33165a) {
            case 0:
                ((b8) this.f33166b).J1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                cc ccVar = (cc) this.f33166b;
                ccVar.f32528o = (int) f10;
                ccVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((gb) this.f33166b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                di diVar = (di) ((bi.y4) this.f33166b).d;
                vh vhVar = diVar.f32946t2;
                if (vhVar == diVar.d2 || vhVar == diVar.f32893e2 || (diVar.f32957w1 && diVar.f32924n3 != null)) {
                    diVar.P1(1);
                }
                diVar.f32946t2.m(diVar.f32898f4);
                diVar.X0.g();
                diVar.f28615b.invalidate();
                return;
            case 4:
                ik ikVar = (ik) this.f33166b;
                ikVar.m0 = f10;
                ikVar.m0();
                return;
            default:
                ((qa0) this.f33166b).y();
                return;
        }
    }
}
