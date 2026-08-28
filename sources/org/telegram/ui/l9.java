package org.telegram.ui;
public final class l9 implements o1.f {
    public final int f40083a;
    public final Object f40084b;

    public l9(Object obj, int i9) {
        this.f40083a = i9;
        this.f40084b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f40083a) {
            case 0:
                s9 s9Var = (s9) this.f40084b;
                o1.j jVar = s9Var.f42603x;
                if (jVar != null) {
                    jVar.c();
                    s9Var.f42603x = null;
                    return;
                }
                return;
            case 1:
                yn0 yn0Var = (yn0) this.f40084b;
                if (hVar == yn0Var.f44915c) {
                    yn0Var.f44915c = null;
                    return;
                }
                return;
            default:
                ((mt0) this.f40084b).D();
                return;
        }
    }
}
