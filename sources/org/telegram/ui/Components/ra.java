package org.telegram.ui.Components;
public final class ra implements q0.a {
    public final int f37695a;
    public final Object f37696b;

    public ra(Object obj, int i3) {
        this.f37695a = i3;
        this.f37696b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37695a) {
            case 0:
                ac acVar = (ac) this.f37696b;
                Float f10 = (Float) obj;
                za zaVar = acVar.f31798p;
                if (zaVar != null) {
                    fb fbVar = acVar.f31788e;
                    if (!fbVar.top) {
                        zaVar.c(fbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                zh zhVar = ((bi) this.f37696b).U3;
                if (zhVar != null) {
                    zhVar.I0(obj);
                    return;
                }
                return;
        }
    }
}
