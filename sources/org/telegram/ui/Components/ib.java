package org.telegram.ui.Components;
public final class ib implements q0.a {
    public final int f25926a;
    public final Object f25927b;

    public ib(Object obj, int i10) {
        this.f25926a = i10;
        this.f25927b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f25926a) {
            case 0:
                sc scVar = (sc) this.f25927b;
                Float f7 = (Float) obj;
                qb qbVar = scVar.f29108p;
                if (qbVar != null) {
                    wb wbVar = scVar.e;
                    if (!wbVar.top) {
                        qbVar.c(wbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ti tiVar = ((vi) this.f25927b).f29993c2;
                if (tiVar != null) {
                    tiVar.U(obj);
                    return;
                }
                return;
        }
    }
}
