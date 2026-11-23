package org.telegram.ui.Components;
public final class wa implements q0.a {
    public final int f41554a;
    public final Object f41555b;

    public wa(Object obj, int i7) {
        this.f41554a = i7;
        this.f41555b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41554a) {
            case 0:
                fc fcVar = (fc) this.f41555b;
                Float f10 = (Float) obj;
                eb ebVar = fcVar.f35097p;
                if (ebVar != null) {
                    kb kbVar = fcVar.f35087e;
                    if (!kbVar.top) {
                        ebVar.c(kbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ri riVar = ((ti) this.f41555b).X3;
                if (riVar != null) {
                    riVar.O0(obj);
                    return;
                }
                return;
        }
    }
}
