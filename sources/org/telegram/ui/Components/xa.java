package org.telegram.ui.Components;
public final class xa implements q0.a {
    public final int f42026a;
    public final Object f42027b;

    public xa(Object obj, int i7) {
        this.f42026a = i7;
        this.f42027b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f42026a) {
            case 0:
                gc gcVar = (gc) this.f42027b;
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
                si siVar = ((ui) this.f42027b).X3;
                if (siVar != null) {
                    siVar.R0(obj);
                    return;
                }
                return;
        }
    }
}
