package org.telegram.ui.Components;
public final class ib implements q0.a {
    public final int f25621a;
    public final Object f25622b;

    public ib(Object obj, int i10) {
        this.f25621a = i10;
        this.f25622b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f25621a) {
            case 0:
                sc scVar = (sc) this.f25622b;
                Float f7 = (Float) obj;
                qb qbVar = scVar.f28811p;
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
                ti tiVar = ((vi) this.f25622b).f29664c2;
                if (tiVar != null) {
                    tiVar.J(obj);
                    return;
                }
                return;
        }
    }
}
