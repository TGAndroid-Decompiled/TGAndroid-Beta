package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f26559a;
    public final Object f26560b;

    public gb(Object obj, int i10) {
        this.f26559a = i10;
        this.f26560b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26559a) {
            case 0:
                qc qcVar = (qc) this.f26560b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f29537p;
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
                ri riVar = ((ti) this.f26560b).f30538c2;
                if (riVar != null) {
                    riVar.O(obj);
                    return;
                }
                return;
        }
    }
}
