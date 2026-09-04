package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f26332a;
    public final Object f26333b;

    public gb(Object obj, int i10) {
        this.f26332a = i10;
        this.f26333b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26332a) {
            case 0:
                qc qcVar = (qc) this.f26333b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f29685p;
                if (obVar != null) {
                    ub ubVar = qcVar.f29675e;
                    if (!ubVar.top) {
                        obVar.c(ubVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ti tiVar = ((vi) this.f26333b).Z1;
                if (tiVar != null) {
                    tiVar.K(obj);
                    return;
                }
                return;
        }
    }
}
