package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f26360a;
    public final Object f26361b;

    public gb(Object obj, int i10) {
        this.f26360a = i10;
        this.f26361b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26360a) {
            case 0:
                qc qcVar = (qc) this.f26361b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f29713p;
                if (obVar != null) {
                    ub ubVar = qcVar.f29703e;
                    if (!ubVar.top) {
                        obVar.c(ubVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ti tiVar = ((vi) this.f26361b).Z1;
                if (tiVar != null) {
                    tiVar.K(obj);
                    return;
                }
                return;
        }
    }
}
