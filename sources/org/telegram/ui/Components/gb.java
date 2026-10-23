package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f26587a;
    public final Object f26588b;

    public gb(Object obj, int i10) {
        this.f26587a = i10;
        this.f26588b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26587a) {
            case 0:
                qc qcVar = (qc) this.f26588b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f29838p;
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
                ri riVar = ((ti) this.f26588b).f30722c2;
                if (riVar != null) {
                    riVar.O(obj);
                    return;
                }
                return;
        }
    }
}
