package org.telegram.ui.Components;
public final class hb implements q0.a {
    public final int f27086a;
    public final Object f27087b;

    public hb(Object obj, int i10) {
        this.f27086a = i10;
        this.f27087b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27086a) {
            case 0:
                rc rcVar = (rc) this.f27087b;
                Float f7 = (Float) obj;
                pb pbVar = rcVar.f30345p;
                if (pbVar != null) {
                    vb vbVar = rcVar.f30335e;
                    if (!vbVar.top) {
                        pbVar.c(vbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                vi viVar = ((xi) this.f27087b).Z1;
                if (viVar != null) {
                    viVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
