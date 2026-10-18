package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f26543a;
    public final Object f26544b;

    public gb(Object obj, int i10) {
        this.f26543a = i10;
        this.f26544b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26543a) {
            case 0:
                qc qcVar = (qc) this.f26544b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f29651p;
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
                ri riVar = ((ti) this.f26544b).f30573c2;
                if (riVar != null) {
                    riVar.O(obj);
                    return;
                }
                return;
        }
    }
}
