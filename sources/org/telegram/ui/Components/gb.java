package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f26333a;
    public final Object f26334b;

    public gb(Object obj, int i10) {
        this.f26333a = i10;
        this.f26334b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26333a) {
            case 0:
                qc qcVar = (qc) this.f26334b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f29686p;
                if (obVar != null) {
                    ub ubVar = qcVar.f29676e;
                    if (!ubVar.top) {
                        obVar.c(ubVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ti tiVar = ((vi) this.f26334b).Z1;
                if (tiVar != null) {
                    tiVar.K(obj);
                    return;
                }
                return;
        }
    }
}
