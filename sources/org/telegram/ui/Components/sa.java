package org.telegram.ui.Components;
public final class sa implements q0.a {
    public final int f37946a;
    public final Object f37947b;

    public sa(Object obj, int i7) {
        this.f37946a = i7;
        this.f37947b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37946a) {
            case 0:
                cc ccVar = (cc) this.f37947b;
                Float f10 = (Float) obj;
                ab abVar = ccVar.f32520p;
                if (abVar != null) {
                    gb gbVar = ccVar.f32510e;
                    if (!gbVar.top) {
                        abVar.c(gbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                bi biVar = ((di) this.f37947b).T3;
                if (biVar != null) {
                    biVar.M0(obj);
                    return;
                }
                return;
        }
    }
}
