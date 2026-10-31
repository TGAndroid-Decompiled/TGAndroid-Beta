package org.telegram.ui.Components;
public final class a7 implements o1.g {
    public final int f24316a;
    public final Object f24317b;

    public a7(Object obj, int i10) {
        this.f24316a = i10;
        this.f24317b = obj;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f24316a) {
            case 0:
                ((w7) this.f24317b).J1.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                wb wbVar = (wb) this.f24317b;
                wbVar.f32140o = (int) f7;
                wbVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((bb) this.f24317b).getWidth()) {
                    jVar.d();
                    return;
                }
                return;
            case 3:
                bi biVar = (bi) ((jh) this.f24317b).d;
                uh uhVar = biVar.f24725t2;
                if (uhVar == biVar.f24667d2 || uhVar == biVar.f24670e2 || (biVar.f24736w1 && biVar.f24702n3 != null)) {
                    biVar.O1(1);
                }
                biVar.f24725t2.l(biVar.f24675f4);
                biVar.X0.g();
                biVar.f21586b.invalidate();
                return;
            case 4:
                kk kkVar = (kk) this.f24317b;
                kkVar.m0 = f7;
                kkVar.k0();
                return;
            default:
                ((jb0) this.f24317b).y();
                return;
        }
    }
}
