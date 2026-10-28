package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f28504a;
    public final Object f28505b;

    public gb(Object obj, int i10) {
        this.f28504a = i10;
        this.f28505b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f28504a) {
            case 0:
                qc qcVar = (qc) this.f28505b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f31868q;
                if (obVar != null) {
                    ub ubVar = qcVar.e;
                    if (!ubVar.top) {
                        obVar.c(ubVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ri riVar = ((ti) this.f28505b).f32982c2;
                if (riVar != null) {
                    riVar.T(obj);
                    return;
                }
                return;
        }
    }
}
