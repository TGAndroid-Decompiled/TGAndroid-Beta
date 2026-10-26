package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f28517a;
    public final Object f28518b;

    public gb(Object obj, int i10) {
        this.f28517a = i10;
        this.f28518b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f28517a) {
            case 0:
                qc qcVar = (qc) this.f28518b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f31896q;
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
                ri riVar = ((ti) this.f28518b).f33013c2;
                if (riVar != null) {
                    riVar.T(obj);
                    return;
                }
                return;
        }
    }
}
