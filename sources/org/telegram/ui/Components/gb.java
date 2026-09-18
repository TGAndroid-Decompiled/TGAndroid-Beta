package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f24352a;
    public final Object f24353b;

    public gb(Object obj, int i10) {
        this.f24352a = i10;
        this.f24353b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24352a) {
            case 0:
                qc qcVar = (qc) this.f24353b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f27556p;
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
                ti tiVar = ((vi) this.f24353b).Z1;
                if (tiVar != null) {
                    tiVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
