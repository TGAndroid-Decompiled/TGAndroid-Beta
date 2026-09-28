package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f24486a;
    public final Object f24487b;

    public gb(Object obj, int i10) {
        this.f24486a = i10;
        this.f24487b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24486a) {
            case 0:
                qc qcVar = (qc) this.f24487b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f27656p;
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
                ui uiVar = ((wi) this.f24487b).Z1;
                if (uiVar != null) {
                    uiVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
