package org.telegram.ui.Components;
public final class eb implements q0.a {
    public final int f26013a;
    public final Object f26014b;

    public eb(Object obj, int i10) {
        this.f26013a = i10;
        this.f26014b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26013a) {
            case 0:
                oc ocVar = (oc) this.f26014b;
                Float f7 = (Float) obj;
                mb mbVar = ocVar.f29209p;
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
                pi piVar = ((ri) this.f26014b).f30138c2;
                if (piVar != null) {
                    piVar.O(obj);
                    return;
                }
                return;
        }
    }
}
