package org.telegram.ui.Components;
public final class sa implements q0.a {
    public final int f37982a;
    public final Object f37983b;

    public sa(Object obj, int i7) {
        this.f37982a = i7;
        this.f37983b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37982a) {
            case 0:
                cc ccVar = (cc) this.f37983b;
                Float f10 = (Float) obj;
                ab abVar = ccVar.f32529p;
                if (abVar != null) {
                    gb gbVar = ccVar.f32519e;
                    if (!gbVar.top) {
                        abVar.c(gbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                bi biVar = ((di) this.f37983b).T3;
                if (biVar != null) {
                    biVar.M0(obj);
                    return;
                }
                return;
        }
    }
}
