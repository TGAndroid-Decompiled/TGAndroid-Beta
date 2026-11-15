package org.telegram.ui.Components;
public final class oa implements q0.a {
    public final int f37896a;
    public final Object f37897b;

    public oa(Object obj, int i7) {
        this.f37896a = i7;
        this.f37897b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37896a) {
            case 0:
                xb xbVar = (xb) this.f37897b;
                Float f10 = (Float) obj;
                wa waVar = xbVar.f41649p;
                if (waVar != null) {
                    cb cbVar = xbVar.f41639e;
                    if (!cbVar.top) {
                        waVar.c(cbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ii iiVar = ((ki) this.f37897b).X3;
                if (iiVar != null) {
                    iiVar.R0(obj);
                    return;
                }
                return;
        }
    }
}
