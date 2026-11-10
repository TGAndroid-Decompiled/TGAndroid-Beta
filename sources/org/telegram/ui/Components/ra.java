package org.telegram.ui.Components;
public final class ra implements q0.a {
    public final int f37575a;
    public final Object f37576b;

    public ra(Object obj, int i7) {
        this.f37575a = i7;
        this.f37576b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37575a) {
            case 0:
                bc bcVar = (bc) this.f37576b;
                Float f10 = (Float) obj;
                za zaVar = bcVar.f32209p;
                if (zaVar != null) {
                    fb fbVar = bcVar.f32199e;
                    if (!fbVar.top) {
                        zaVar.c(fbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                ai aiVar = ((ci) this.f37576b).W3;
                if (aiVar != null) {
                    aiVar.M0(obj);
                    return;
                }
                return;
        }
    }
}
