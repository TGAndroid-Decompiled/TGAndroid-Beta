package org.telegram.ui.Components;
public final class xa implements q0.a {
    public final int f30567a;
    public final Object f30568b;

    public xa(Object obj, int i10) {
        this.f30567a = i10;
        this.f30568b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30567a) {
            case 0:
                ic icVar = (ic) this.f30568b;
                Float f10 = (Float) obj;
                fb fbVar = icVar.f25677p;
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
                ji jiVar = ((li) this.f30568b).W1;
                if (jiVar != null) {
                    jiVar.Z0(obj);
                    return;
                }
                return;
        }
    }
}
