package org.telegram.ui.Components;
public final class ib implements q0.a {
    public final int f27134a;
    public final Object f27135b;

    public ib(Object obj, int i10) {
        this.f27134a = i10;
        this.f27135b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27134a) {
            case 0:
                sc scVar = (sc) this.f27135b;
                Float f7 = (Float) obj;
                qb qbVar = scVar.f30546p;
                if (qbVar != null) {
                    wb wbVar = scVar.f30536e;
                    if (!wbVar.top) {
                        qbVar.c(wbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                yi yiVar = ((aj) this.f27135b).f24333c2;
                if (yiVar != null) {
                    yiVar.Z0(obj);
                    return;
                }
                return;
        }
    }
}
