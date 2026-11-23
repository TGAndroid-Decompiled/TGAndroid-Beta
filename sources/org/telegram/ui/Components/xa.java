package org.telegram.ui.Components;
public final class xa implements q0.a {
    public final int f42025a;
    public final Object f42026b;

    public xa(Object obj, int i7) {
        this.f42025a = i7;
        this.f42026b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f42025a) {
            case 0:
                gc gcVar = (gc) this.f42026b;
                Float f10 = (Float) obj;
                fb fbVar = gcVar.f35533p;
                if (fbVar != null) {
                    lb lbVar = gcVar.f35523e;
                    if (!lbVar.top) {
                        fbVar.c(lbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                si siVar = ((ui) this.f42026b).X3;
                if (siVar != null) {
                    siVar.R0(obj);
                    return;
                }
                return;
        }
    }
}
