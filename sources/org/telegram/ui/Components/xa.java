package org.telegram.ui.Components;
public final class xa implements q0.a {
    public final int f34627a;
    public final Object f34628b;

    public xa(Object obj, int i9) {
        this.f34627a = i9;
        this.f34628b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f34627a) {
            case 0:
                gc gcVar = (gc) this.f34628b;
                Float f10 = (Float) obj;
                fb fbVar = gcVar.f28743p;
                if (fbVar != null) {
                    lb lbVar = gcVar.f28733e;
                    if (!lbVar.top) {
                        fbVar.c(lbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ii iiVar = ((ki) this.f34628b).V1;
                if (iiVar != null) {
                    iiVar.A(obj);
                    return;
                }
                return;
        }
    }
}
