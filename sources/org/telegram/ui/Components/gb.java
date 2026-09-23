package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f24249a;
    public final Object f24250b;

    public gb(Object obj, int i10) {
        this.f24249a = i10;
        this.f24250b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24249a) {
            case 0:
                qc qcVar = (qc) this.f24250b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f27312p;
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
                ui uiVar = ((wi) this.f24250b).Z1;
                if (uiVar != null) {
                    uiVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
