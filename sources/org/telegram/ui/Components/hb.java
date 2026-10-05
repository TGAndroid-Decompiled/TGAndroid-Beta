package org.telegram.ui.Components;
public final class hb implements q0.a {
    public final int f27183a;
    public final Object f27184b;

    public hb(Object obj, int i10) {
        this.f27183a = i10;
        this.f27184b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27183a) {
            case 0:
                rc rcVar = (rc) this.f27184b;
                Float f7 = (Float) obj;
                pb pbVar = rcVar.f30433p;
                if (pbVar != null) {
                    vb vbVar = rcVar.f30423e;
                    if (!vbVar.top) {
                        pbVar.c(vbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                vi viVar = ((xi) this.f27184b).Z1;
                if (viVar != null) {
                    viVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
