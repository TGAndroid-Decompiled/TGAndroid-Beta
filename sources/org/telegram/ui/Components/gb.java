package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f26359a;
    public final Object f26360b;

    public gb(Object obj, int i10) {
        this.f26359a = i10;
        this.f26360b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26359a) {
            case 0:
                qc qcVar = (qc) this.f26360b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f29712p;
                if (obVar != null) {
                    ub ubVar = qcVar.f29702e;
                    if (!ubVar.top) {
                        obVar.c(ubVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ti tiVar = ((vi) this.f26360b).Z1;
                if (tiVar != null) {
                    tiVar.K(obj);
                    return;
                }
                return;
        }
    }
}
