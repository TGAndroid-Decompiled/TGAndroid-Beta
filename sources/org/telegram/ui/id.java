package org.telegram.ui;
public final class id implements Runnable {
    public final int f36784a;
    public final sd f36785b;

    public id(sd sdVar, int i10) {
        this.f36784a = i10;
        this.f36785b = sdVar;
    }

    @Override
    public final void run() {
        switch (this.f36784a) {
            case 0:
                sd sdVar = this.f36785b;
                sdVar.f39773j0 = true;
                sdVar.h0();
                return;
            case 1:
                sd sdVar2 = this.f36785b;
                sdVar2.f39790x = null;
                sdVar2.f39791y = null;
                sdVar2.f39775l0 = null;
                sdVar2.m0 = null;
                sdVar2.f39778o0 = null;
                sdVar2.f39777n0 = null;
                sdVar2.f39779p0 = 0.0d;
                sdVar2.e0(false, true);
                sdVar2.e.h(null, null, sdVar2.f39783s, null);
                sdVar2.h.setAnimation(sdVar2.J);
                sdVar2.J.M(0);
                return;
            case 2:
                this.f36785b.g0(true);
                return;
            default:
                sd sdVar3 = this.f36785b;
                sdVar3.f39773j0 = true;
                if (sdVar3.f39788w.length() > 0) {
                    sdVar3.d0(sdVar3.f39788w.getText().toString());
                }
                sdVar3.h0();
                return;
        }
    }
}
