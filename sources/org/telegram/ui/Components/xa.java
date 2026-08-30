package org.telegram.ui.Components;
public final class xa implements q0.a {
    public final int f30639a;
    public final Object f30640b;

    public xa(Object obj, int i10) {
        this.f30639a = i10;
        this.f30640b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30639a) {
            case 0:
                ic icVar = (ic) this.f30640b;
                Float f10 = (Float) obj;
                fb fbVar = icVar.f25678p;
                if (fbVar != null) {
                    nb nbVar = icVar.e;
                    if (!nbVar.top) {
                        fbVar.c(nbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ji jiVar = ((li) this.f30640b).W1;
                if (jiVar != null) {
                    jiVar.D(obj);
                    return;
                }
                return;
        }
    }
}
