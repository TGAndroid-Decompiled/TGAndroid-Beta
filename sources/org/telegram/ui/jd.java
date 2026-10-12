package org.telegram.ui;
public final class jd implements Runnable {
    public final int f37352a;
    public final sd f37353b;

    public jd(sd sdVar, int i10) {
        this.f37352a = i10;
        this.f37353b = sdVar;
    }

    @Override
    public final void run() {
        switch (this.f37352a) {
            case 0:
                sd sdVar = this.f37353b;
                sdVar.f40076j0 = true;
                sdVar.h0();
                return;
            case 1:
                sd sdVar2 = this.f37353b;
                sdVar2.f40093x = null;
                sdVar2.f40094y = null;
                sdVar2.f40078l0 = null;
                sdVar2.m0 = null;
                sdVar2.f40081o0 = null;
                sdVar2.f40080n0 = null;
                sdVar2.f40082p0 = 0.0d;
                sdVar2.e0(false, true);
                sdVar2.e.h(null, null, sdVar2.f40086s, null);
                sdVar2.h.setAnimation(sdVar2.J);
                sdVar2.J.M(0);
                return;
            case 2:
                this.f37353b.g0(true);
                return;
            default:
                sd sdVar3 = this.f37353b;
                sdVar3.f40076j0 = true;
                if (sdVar3.f40091w.length() > 0) {
                    sdVar3.d0(sdVar3.f40091w.getText().toString());
                }
                sdVar3.h0();
                return;
        }
    }
}
