package org.telegram.ui.Components;
public final class jb implements q0.a {
    public final int f27654a;
    public final Object f27655b;

    public jb(Object obj, int i10) {
        this.f27654a = i10;
        this.f27655b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27654a) {
            case 0:
                tc tcVar = (tc) this.f27655b;
                Float f7 = (Float) obj;
                rb rbVar = tcVar.f31102p;
                if (rbVar != null) {
                    xb xbVar = tcVar.f31092e;
                    if (!xbVar.top) {
                        rbVar.c(xbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                wi wiVar = ((yi) this.f27655b).f33226c2;
                if (wiVar != null) {
                    wiVar.a1(obj);
                    return;
                }
                return;
        }
    }
}
