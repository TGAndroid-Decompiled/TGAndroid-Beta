package org.telegram.ui.Components;
public final class ya implements o1.f {
    public final int f33423a;
    public final Object f33424b;

    public ya(Object obj, int i10) {
        this.f33423a = i10;
        this.f33424b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f33423a) {
            case 0:
                ic icVar = (ic) this.f33424b;
                if (icVar.d == hVar) {
                    icVar.d = null;
                    return;
                }
                return;
            case 1:
                ua uaVar = (ua) this.f33424b;
                if (!z4) {
                    uaVar.run();
                    return;
                }
                return;
            case 2:
                ap0 ap0Var = (ap0) this.f33424b;
                ap0Var.f25308q = false;
                ap0Var.dismiss();
                return;
            case 3:
                bp0 bp0Var = (bp0) this.f33424b;
                bp0Var.f25700s = false;
                bp0Var.f25699r = false;
                if (!z4) {
                    hVar.c();
                }
                if (hVar == bp0Var.f25697f) {
                    bp0Var.f25697f = null;
                    return;
                }
                return;
            case 4:
                mq0 mq0Var = (mq0) this.f33424b;
                mq0Var.B.setVisibility(8);
                mq0Var.f29225w0.setVisibility(8);
                jq0 jq0Var = mq0Var.I;
                jq0Var.f28186f = null;
                jq0Var.l();
                mq0Var.f29229y0 = null;
                mq0Var.J0 = false;
                return;
            default:
                mq0 mq0Var2 = ((tp0) this.f33424b).d;
                mq0Var2.C.setVisibility(8);
                mq0Var2.D.setVisibility(8);
                mq0Var2.f29223v0.setVisibility(8);
                mq0Var2.f29229y0 = null;
                return;
        }
    }
}
