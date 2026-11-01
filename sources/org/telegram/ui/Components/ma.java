package org.telegram.ui.Components;
public final class ma implements q0.a {
    public final int f28436a;
    public final Object f28437b;

    public ma(Object obj, int i10) {
        this.f28436a = i10;
        this.f28437b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f28436a) {
            case 0:
                wb wbVar = (wb) this.f28437b;
                Float f7 = (Float) obj;
                ua uaVar = wbVar.f32207p;
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
                ai aiVar = ((bi) this.f28437b).T3;
                if (aiVar != null) {
                    aiVar.n0(obj);
                    return;
                }
                return;
        }
    }
}
