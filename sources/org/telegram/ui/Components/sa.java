package org.telegram.ui.Components;
public final class sa implements q0.a {
    public final int f37989a;
    public final Object f37990b;

    public sa(Object obj, int i7) {
        this.f37989a = i7;
        this.f37990b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37989a) {
            case 0:
                cc ccVar = (cc) this.f37990b;
                Float f10 = (Float) obj;
                ab abVar = ccVar.f32633p;
                if (abVar != null) {
                    gb gbVar = ccVar.f32623e;
                    if (!gbVar.top) {
                        abVar.c(gbVar.getHeight() - f10.floatValue());
                        return;
                    }
                    return;
                }
                return;
            default:
                bi biVar = ((di) this.f37990b).T3;
                if (biVar != null) {
                    biVar.M0(obj);
                    return;
                }
                return;
        }
    }
}
