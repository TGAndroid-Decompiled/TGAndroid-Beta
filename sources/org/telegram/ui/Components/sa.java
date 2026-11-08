package org.telegram.ui.Components;
public final class sa implements q0.a {
    public final int f37962a;
    public final Object f37963b;

    public sa(Object obj, int i7) {
        this.f37962a = i7;
        this.f37963b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37962a) {
            case 0:
                cc ccVar = (cc) this.f37963b;
                Float f10 = (Float) obj;
                ab abVar = ccVar.f32551p;
                if (abVar != null) {
                    gb gbVar = ccVar.f32541e;
                    if (!gbVar.top) {
                        abVar.c(gbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                bi biVar = ((di) this.f37963b).T3;
                if (biVar != null) {
                    biVar.M0(obj);
                    return;
                }
                return;
        }
    }
}
