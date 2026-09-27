package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f24524a;
    public final Object f24525b;

    public gb(Object obj, int i10) {
        this.f24524a = i10;
        this.f24525b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24524a) {
            case 0:
                qc qcVar = (qc) this.f24525b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f27697p;
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
                ui uiVar = ((wi) this.f24525b).Z1;
                if (uiVar != null) {
                    uiVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
