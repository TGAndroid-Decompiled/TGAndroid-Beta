package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f26563a;
    public final Object f26564b;

    public gb(Object obj, int i10) {
        this.f26563a = i10;
        this.f26564b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26563a) {
            case 0:
                qc qcVar = (qc) this.f26564b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f29600p;
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
                ri riVar = ((ti) this.f26564b).f30526c2;
                if (riVar != null) {
                    riVar.O(obj);
                    return;
                }
                return;
        }
    }
}
