package org.telegram.ui.Components;
public final class hb implements q0.a {
    public final int f24801a;
    public final Object f24802b;

    public hb(Object obj, int i10) {
        this.f24801a = i10;
        this.f24802b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24801a) {
            case 0:
                rc rcVar = (rc) this.f24802b;
                Float f7 = (Float) obj;
                pb pbVar = rcVar.f27952p;
                if (pbVar != null) {
                    vb vbVar = rcVar.e;
                    if (!vbVar.top) {
                        pbVar.c(vbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                vi viVar = ((xi) this.f24802b).Z1;
                if (viVar != null) {
                    viVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
