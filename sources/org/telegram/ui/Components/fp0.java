package org.telegram.ui.Components;
public final class fp0 implements org.telegram.messenger.w10 {
    public final int f35182a;
    public final it0 f35183b;

    public fp0(it0 it0Var, int i7) {
        this.f35182a = i7;
        this.f35183b = it0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f35182a;
        it0 it0Var = this.f35183b;
        fi.i6 i6Var = (fi.i6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new sh0(7, it0Var, i6Var), 100L);
                return;
            default:
                int[] iArr = it0.f36087t2;
                org.telegram.messenger.g0.h3(new sh0(7, it0Var, i6Var), 100L);
                return;
        }
    }
}
