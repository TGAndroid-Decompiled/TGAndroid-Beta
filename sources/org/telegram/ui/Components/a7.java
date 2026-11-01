package org.telegram.ui.Components;
public final class a7 implements o1.g {
    public final int f24296a;
    public final Object f24297b;

    public a7(Object obj, int i10) {
        this.f24296a = i10;
        this.f24297b = obj;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f24296a) {
            case 0:
                ((w7) this.f24297b).J1.setBufferedProgress(f7 / 1000.0f);
                return;
            case 1:
                wb wbVar = (wb) this.f24297b;
                wbVar.f32206o = (int) f7;
                wbVar.l();
                return;
            case 2:
                if (Math.abs(f7) > ((bb) this.f24297b).getWidth()) {
                    jVar.d();
                    return;
                }
                return;
            case 3:
                bi biVar = (bi) ((jh) this.f24297b).d;
                uh uhVar = biVar.f24816t2;
                if (uhVar == biVar.f24758d2 || uhVar == biVar.f24761e2 || (biVar.f24827w1 && biVar.f24793n3 != null)) {
                    biVar.O1(1);
                }
                biVar.f24816t2.l(biVar.f24766f4);
                biVar.X0.g();
                biVar.f21587b.invalidate();
                return;
            case 4:
                kk kkVar = (kk) this.f24297b;
                kkVar.m0 = f7;
                kkVar.k0();
                return;
            default:
                ((jb0) this.f24297b).y();
                return;
        }
    }
}
