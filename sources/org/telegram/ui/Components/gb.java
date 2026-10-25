package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f28515a;
    public final Object f28516b;

    public gb(Object obj, int i10) {
        this.f28515a = i10;
        this.f28516b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f28515a) {
            case 0:
                qc qcVar = (qc) this.f28516b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f31894q;
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
                ri riVar = ((ti) this.f28516b).f33010c2;
                if (riVar != null) {
                    riVar.T(obj);
                    return;
                }
                return;
        }
    }
}
