package org.telegram.ui.Components;
public final class xa implements q0.a {
    public final int f41982a;
    public final Object f41983b;

    public xa(Object obj, int i7) {
        this.f41982a = i7;
        this.f41983b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41982a) {
            case 0:
                gc gcVar = (gc) this.f41983b;
                Float f10 = (Float) obj;
                fb fbVar = gcVar.f35495p;
                if (fbVar != null) {
                    lb lbVar = gcVar.f35485e;
                    if (!lbVar.top) {
                        fbVar.c(lbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                si siVar = ((ui) this.f41983b).X3;
                if (siVar != null) {
                    siVar.R0(obj);
                    return;
                }
                return;
        }
    }
}
