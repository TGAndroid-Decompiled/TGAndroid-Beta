package org.telegram.ui.Components;
public final class ib implements q0.a {
    public final int f27407a;
    public final Object f27408b;

    public ib(Object obj, int i10) {
        this.f27407a = i10;
        this.f27408b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27407a) {
            case 0:
                sc scVar = (sc) this.f27408b;
                Float f7 = (Float) obj;
                qb qbVar = scVar.f30839p;
                if (qbVar != null) {
                    wb wbVar = scVar.f30829e;
                    if (!wbVar.top) {
                        qbVar.c(wbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                wi wiVar = ((yi) this.f27408b).f33280c2;
                if (wiVar != null) {
                    wiVar.a1(obj);
                    return;
                }
                return;
        }
    }
}
