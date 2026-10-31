package org.telegram.ui.Components;
public final class ma implements q0.a {
    public final int f28399a;
    public final Object f28400b;

    public ma(Object obj, int i10) {
        this.f28399a = i10;
        this.f28400b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f28399a) {
            case 0:
                wb wbVar = (wb) this.f28400b;
                Float f7 = (Float) obj;
                ua uaVar = wbVar.f32141p;
                if (uaVar != null) {
                    bb bbVar = wbVar.e;
                    if (!bbVar.top) {
                        uaVar.c(bbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ai aiVar = ((bi) this.f28400b).T3;
                if (aiVar != null) {
                    aiVar.n0(obj);
                    return;
                }
                return;
        }
    }
}
