package org.telegram.ui.Components;
public final class eb implements q0.a {
    public final int f23613a;
    public final Object f23614b;

    public eb(Object obj, int i10) {
        this.f23613a = i10;
        this.f23614b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f23613a) {
            case 0:
                oc ocVar = (oc) this.f23614b;
                Float f7 = (Float) obj;
                mb mbVar = ocVar.f26757p;
                if (mbVar != null) {
                    sb sbVar = ocVar.e;
                    if (!sbVar.top) {
                        mbVar.c(sbVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ti tiVar = ((vi) this.f23614b).Z1;
                if (tiVar != null) {
                    tiVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
