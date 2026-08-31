package org.telegram.ui.Components;
public final class xa implements q0.a {
    public final int f33002a;
    public final Object f33003b;

    public xa(Object obj, int i10) {
        this.f33002a = i10;
        this.f33003b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f33002a) {
            case 0:
                ic icVar = (ic) this.f33003b;
                Float f10 = (Float) obj;
                fb fbVar = icVar.f27751p;
                if (fbVar != null) {
                    nb nbVar = icVar.f27741e;
                    if (!nbVar.top) {
                        fbVar.c(nbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ki kiVar = ((mi) this.f33003b).W1;
                if (kiVar != null) {
                    kiVar.Z0(obj);
                    return;
                }
                return;
        }
    }
}
