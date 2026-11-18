package org.telegram.ui.Components;
public final class xa implements q0.a {
    public final int f41956a;
    public final Object f41957b;

    public xa(Object obj, int i7) {
        this.f41956a = i7;
        this.f41957b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41956a) {
            case 0:
                gc gcVar = (gc) this.f41957b;
                Float f10 = (Float) obj;
                fb fbVar = gcVar.f35467p;
                if (fbVar != null) {
                    lb lbVar = gcVar.f35457e;
                    if (!lbVar.top) {
                        fbVar.c(lbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                qi qiVar = ((si) this.f41957b).X3;
                if (qiVar != null) {
                    qiVar.R0(obj);
                    return;
                }
                return;
        }
    }
}
