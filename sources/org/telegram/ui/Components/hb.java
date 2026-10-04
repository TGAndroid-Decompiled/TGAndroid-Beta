package org.telegram.ui.Components;
public final class hb implements q0.a {
    public final int f27091a;
    public final Object f27092b;

    public hb(Object obj, int i10) {
        this.f27091a = i10;
        this.f27092b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27091a) {
            case 0:
                rc rcVar = (rc) this.f27092b;
                Float f7 = (Float) obj;
                pb pbVar = rcVar.f30351p;
                if (pbVar != null) {
                    vb vbVar = rcVar.f30341e;
                    if (!vbVar.top) {
                        pbVar.c(vbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                vi viVar = ((xi) this.f27092b).Z1;
                if (viVar != null) {
                    viVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
