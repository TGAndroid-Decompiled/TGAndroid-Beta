package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f24405a;
    public final Object f24406b;

    public gb(Object obj, int i10) {
        this.f24405a = i10;
        this.f24406b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24405a) {
            case 0:
                qc qcVar = (qc) this.f24406b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f27577p;
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
                ui uiVar = ((wi) this.f24406b).Z1;
                if (uiVar != null) {
                    uiVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
