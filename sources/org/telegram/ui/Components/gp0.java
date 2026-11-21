package org.telegram.ui.Components;
public final class gp0 implements org.telegram.messenger.x10 {
    public final int f35631a;
    public final jt0 f35632b;

    public gp0(jt0 jt0Var, int i7) {
        this.f35631a = i7;
        this.f35632b = jt0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f35631a;
        jt0 jt0Var = this.f35632b;
        fi.i6 i6Var = (fi.i6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new fm0(5, jt0Var, i6Var), 100L);
                return;
            default:
                int[] iArr = jt0.f36610t2;
                org.telegram.messenger.g0.h3(new fm0(5, jt0Var, i6Var), 100L);
                return;
        }
    }
}
