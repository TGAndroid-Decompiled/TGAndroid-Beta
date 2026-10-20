package org.telegram.ui;
public final class dd implements Runnable {
    public final int f36330a;
    public final md f36331b;

    public dd(md mdVar, int i10) {
        this.f36330a = i10;
        this.f36331b = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f36330a) {
            case 0:
                md mdVar = this.f36331b;
                mdVar.f39190j0 = true;
                mdVar.h0();
                return;
            case 1:
                md mdVar2 = this.f36331b;
                mdVar2.f39207x = null;
                mdVar2.f39208y = null;
                mdVar2.f39192l0 = null;
                mdVar2.m0 = null;
                mdVar2.f39195o0 = null;
                mdVar2.f39194n0 = null;
                mdVar2.f39196p0 = 0.0d;
                mdVar2.e0(false, true);
                mdVar2.e.h(null, null, mdVar2.f39200s, null);
                mdVar2.h.setAnimation(mdVar2.J);
                mdVar2.J.M(0);
                return;
            case 2:
                this.f36331b.g0(true);
                return;
            default:
                md mdVar3 = this.f36331b;
                mdVar3.f39190j0 = true;
                if (mdVar3.f39205w.length() > 0) {
                    mdVar3.d0(mdVar3.f39205w.getText().toString());
                }
                mdVar3.h0();
                return;
        }
    }
}
