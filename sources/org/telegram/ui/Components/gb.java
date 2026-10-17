package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f26536a;
    public final Object f26537b;

    public gb(Object obj, int i10) {
        this.f26536a = i10;
        this.f26537b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26536a) {
            case 0:
                qc qcVar = (qc) this.f26537b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f29645p;
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
                ri riVar = ((ti) this.f26537b).f30566c2;
                if (riVar != null) {
                    riVar.O(obj);
                    return;
                }
                return;
        }
    }
}
