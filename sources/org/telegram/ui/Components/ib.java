package org.telegram.ui.Components;
public final class ib implements q0.a {
    public final int f27268a;
    public final Object f27269b;

    public ib(Object obj, int i10) {
        this.f27268a = i10;
        this.f27269b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27268a) {
            case 0:
                sc scVar = (sc) this.f27269b;
                Float f7 = (Float) obj;
                qb qbVar = scVar.f30717p;
                if (qbVar != null) {
                    wb wbVar = scVar.f30707e;
                    if (!wbVar.top) {
                        qbVar.c(wbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                wi wiVar = ((yi) this.f27269b).f33207c2;
                if (wiVar != null) {
                    wiVar.a1(obj);
                    return;
                }
                return;
        }
    }
}
