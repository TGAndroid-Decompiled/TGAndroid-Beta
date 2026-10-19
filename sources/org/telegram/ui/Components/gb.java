package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f26565a;
    public final Object f26566b;

    public gb(Object obj, int i10) {
        this.f26565a = i10;
        this.f26566b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26565a) {
            case 0:
                qc qcVar = (qc) this.f26566b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f29602p;
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
                ri riVar = ((ti) this.f26566b).f30528c2;
                if (riVar != null) {
                    riVar.O(obj);
                    return;
                }
                return;
        }
    }
}
