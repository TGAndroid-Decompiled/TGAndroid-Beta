package org.telegram.ui.Components;
public final class fb implements q0.a {
    public final int f22966a;
    public final Object f22967b;

    public fb(Object obj, int i10) {
        this.f22966a = i10;
        this.f22967b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f22966a) {
            case 0:
                pc pcVar = (pc) this.f22967b;
                Float f7 = (Float) obj;
                nb nbVar = pcVar.f26087p;
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
                wi wiVar = ((yi) this.f22967b).Z1;
                if (wiVar != null) {
                    wiVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
