package org.telegram.ui.Components;
public final class fb implements q0.a {
    public final int f24149a;
    public final Object f24150b;

    public fb(Object obj, int i10) {
        this.f24149a = i10;
        this.f24150b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24149a) {
            case 0:
                pc pcVar = (pc) this.f24150b;
                Float f7 = (Float) obj;
                nb nbVar = pcVar.f27317p;
                if (nbVar != null) {
                    tb tbVar = pcVar.e;
                    if (!tbVar.top) {
                        nbVar.c(tbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ti tiVar = ((vi) this.f24150b).Z1;
                if (tiVar != null) {
                    tiVar.V0(obj);
                    return;
                }
                return;
        }
    }
}
