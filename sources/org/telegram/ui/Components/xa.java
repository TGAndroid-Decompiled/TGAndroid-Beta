package org.telegram.ui.Components;
public final class xa implements q0.a {
    public final int f42033a;
    public final Object f42034b;

    public xa(Object obj, int i7) {
        this.f42033a = i7;
        this.f42034b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f42033a) {
            case 0:
                gc gcVar = (gc) this.f42034b;
                Float f10 = (Float) obj;
                fb fbVar = gcVar.f35514p;
                if (fbVar != null) {
                    lb lbVar = gcVar.f35504e;
                    if (!lbVar.top) {
                        fbVar.c(lbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                si siVar = ((ui) this.f42034b).X3;
                if (siVar != null) {
                    siVar.R0(obj);
                    return;
                }
                return;
        }
    }
}
