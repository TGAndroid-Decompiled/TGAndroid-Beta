package org.telegram.ui;
public final class q9 implements o1.f {
    public final int f37335a;
    public final Object f37336b;

    public q9(Object obj, int i10) {
        this.f37335a = i10;
        this.f37336b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f37335a) {
            case 0:
                x9 x9Var = (x9) this.f37336b;
                o1.j jVar = x9Var.f39936x;
                if (jVar != null) {
                    jVar.c();
                    x9Var.f39936x = null;
                    return;
                }
                return;
            case 1:
                ho0 ho0Var = (ho0) this.f37336b;
                if (hVar == ho0Var.f34713c) {
                    ho0Var.f34713c = null;
                    return;
                }
                return;
            default:
                ((au0) this.f37336b).D();
                return;
        }
    }
}
