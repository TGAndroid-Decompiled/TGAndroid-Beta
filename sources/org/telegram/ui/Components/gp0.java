package org.telegram.ui.Components;
public final class gp0 implements org.telegram.messenger.y10 {
    public final int f35650a;
    public final jt0 f35651b;

    public gp0(jt0 jt0Var, int i7) {
        this.f35650a = i7;
        this.f35651b = jt0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f35650a;
        jt0 jt0Var = this.f35651b;
        fi.i6 i6Var = (fi.i6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new fm0(5, jt0Var, i6Var), 100L);
                return;
            default:
                int[] iArr = jt0.f36605t2;
                org.telegram.messenger.g0.h3(new fm0(5, jt0Var, i6Var), 100L);
                return;
        }
    }
}
