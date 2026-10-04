package org.telegram.ui.Components;
public final class hb implements q0.a {
    public final int f27085a;
    public final Object f27086b;

    public hb(Object obj, int i10) {
        this.f27085a = i10;
        this.f27086b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27085a) {
            case 0:
                rc rcVar = (rc) this.f27086b;
                Float f7 = (Float) obj;
                pb pbVar = rcVar.f30344p;
                if (pbVar != null) {
                    vb vbVar = rcVar.f30334e;
                    if (!vbVar.top) {
                        pbVar.c(vbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                vi viVar = ((xi) this.f27086b).Z1;
                if (viVar != null) {
                    viVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
