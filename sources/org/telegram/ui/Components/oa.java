package org.telegram.ui.Components;
public final class oa implements q0.a {
    public final int f37894a;
    public final Object f37895b;

    public oa(Object obj, int i7) {
        this.f37894a = i7;
        this.f37895b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37894a) {
            case 0:
                xb xbVar = (xb) this.f37895b;
                Float f10 = (Float) obj;
                wa waVar = xbVar.f41641p;
                if (waVar != null) {
                    cb cbVar = xbVar.f41631e;
                    if (!cbVar.top) {
                        waVar.c(cbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ii iiVar = ((ki) this.f37895b).X3;
                if (iiVar != null) {
                    iiVar.R0(obj);
                    return;
                }
                return;
        }
    }
}
