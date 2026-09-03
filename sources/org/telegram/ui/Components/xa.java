package org.telegram.ui.Components;
public final class xa implements q0.a {
    public final int f32996a;
    public final Object f32997b;

    public xa(Object obj, int i10) {
        this.f32996a = i10;
        this.f32997b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f32996a) {
            case 0:
                ic icVar = (ic) this.f32997b;
                Float f10 = (Float) obj;
                fb fbVar = icVar.f27784p;
                if (fbVar != null) {
                    nb nbVar = icVar.f27774e;
                    if (!nbVar.top) {
                        fbVar.c(nbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ki kiVar = ((mi) this.f32997b).W1;
                if (kiVar != null) {
                    kiVar.Z0(obj);
                    return;
                }
                return;
        }
    }
}
