package org.telegram.ui.Components;
public final class bn implements org.telegram.messenger.x10 {
    public final int f33724a;
    public final org.telegram.messenger.x10 f33725b;

    public bn(org.telegram.messenger.x10 x10Var, int i7) {
        this.f33724a = i7;
        this.f33725b = x10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f33724a) {
            case 0:
                this.f33725b.a(new th.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f33725b.a(Boolean.valueOf(z10));
                return;
        }
    }
}
