package org.telegram.ui.Components;
public final class ib implements q0.a {
    public final int f27119a;
    public final Object f27120b;

    public ib(Object obj, int i10) {
        this.f27119a = i10;
        this.f27120b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27119a) {
            case 0:
                sc scVar = (sc) this.f27120b;
                Float f7 = (Float) obj;
                qb qbVar = scVar.f30542p;
                if (qbVar != null) {
                    wb wbVar = scVar.f30532e;
                    if (!wbVar.top) {
                        qbVar.c(wbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                yi yiVar = ((aj) this.f27120b).f24329c2;
                if (yiVar != null) {
                    yiVar.Z0(obj);
                    return;
                }
                return;
        }
    }
}
