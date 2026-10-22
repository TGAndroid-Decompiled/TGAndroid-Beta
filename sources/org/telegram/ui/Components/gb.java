package org.telegram.ui.Components;
public final class gb implements q0.a {
    public final int f26562a;
    public final Object f26563b;

    public gb(Object obj, int i10) {
        this.f26562a = i10;
        this.f26563b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26562a) {
            case 0:
                qc qcVar = (qc) this.f26563b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.f29540p;
                if (obVar != null) {
                    ub ubVar = qcVar.e;
                    if (!ubVar.top) {
                        obVar.c(ubVar.getHeight() - f7.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ri riVar = ((ti) this.f26563b).f30541c2;
                if (riVar != null) {
                    riVar.O(obj);
                    return;
                }
                return;
        }
    }
}
