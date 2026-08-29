package org.telegram.ui.Components;
public final class cb implements q0.a {
    public final int f27425a;
    public final Object f27426b;

    public cb(Object obj, int i10) {
        this.f27425a = i10;
        this.f27426b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f27425a) {
            case 0:
                mc mcVar = (mc) this.f27426b;
                Float f9 = (Float) obj;
                kb kbVar = mcVar.f30658p;
                if (kbVar != null) {
                    rb rbVar = mcVar.f30648e;
                    if (!rbVar.top) {
                        kbVar.c(rbVar.getHeight() - f9.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                li liVar = ((ni) this.f27426b).V1;
                if (liVar != null) {
                    liVar.U0(obj);
                    return;
                }
                return;
        }
    }
}
