package org.telegram.ui.Components;
public final class jb implements q0.a {
    public final int f27686a;
    public final Object f27687b;

    public jb(Object obj, int i10) {
        this.f27686a = i10;
        this.f27687b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27686a) {
            case 0:
                tc tcVar = (tc) this.f27687b;
                Float f7 = (Float) obj;
                rb rbVar = tcVar.f31136p;
                if (rbVar != null) {
                    xb xbVar = tcVar.f31126e;
                    if (!xbVar.top) {
                        rbVar.c(xbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                wi wiVar = ((yi) this.f27687b).f33219c2;
                if (wiVar != null) {
                    wiVar.a1(obj);
                    return;
                }
                return;
        }
    }
}
