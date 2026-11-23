package org.telegram.ui.Components;
public final class i7 implements r1.d {
    public final int f35960a;
    public final Object f35961b;

    public i7(Object obj, int i7) {
        this.f35960a = i7;
        this.f35961b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f35960a) {
            case 0:
                ((e8) this.f35961b).N1.setBufferedProgress(f10 / 1000.0f);
                return;
            case 1:
                fc fcVar = (fc) this.f35961b;
                fcVar.f35096o = (int) f10;
                fcVar.l();
                return;
            case 2:
                if (Math.abs(f10) > ((kb) this.f35961b).getWidth()) {
                    gVar.d();
                    return;
                }
                return;
            case 3:
                ti tiVar = (ti) ((di.a4) this.f35961b).d;
                li liVar = tiVar.f40033x2;
                if (liVar == tiVar.f39976h2 || liVar == tiVar.f39979i2 || (tiVar.A1 && tiVar.f40010r3 != null)) {
                    tiVar.Q1(1);
                }
                tiVar.f40033x2.m(tiVar.f39983j4);
                tiVar.Y0.g();
                tiVar.f30226b.invalidate();
                return;
            case 4:
                xk xkVar = (xk) this.f35961b;
                xkVar.f42072n0 = f10;
                xkVar.m0();
                return;
            default:
                ((za0) this.f35961b).y();
                return;
        }
    }
}
