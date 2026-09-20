package org.telegram.ui.Components;
public final class fb implements q0.a {
    public final int f24064a;
    public final Object f24065b;

    public fb(Object obj, int i10) {
        this.f24064a = i10;
        this.f24065b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24064a) {
            case 0:
                pc pcVar = (pc) this.f24065b;
                Float f7 = (Float) obj;
                nb nbVar = pcVar.f27258p;
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
                ti tiVar = ((vi) this.f24065b).Z1;
                if (tiVar != null) {
                    tiVar.V0(obj);
                    return;
                }
                return;
        }
    }
}
