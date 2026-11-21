package org.telegram.ui.Components;
public final class dn implements org.telegram.messenger.x10 {
    public final int f34539a;
    public final org.telegram.messenger.x10 f34540b;

    public dn(org.telegram.messenger.x10 x10Var, int i7) {
        this.f34539a = i7;
        this.f34540b = x10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f34539a) {
            case 0:
                this.f34540b.a(new th.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f34540b.a(Boolean.valueOf(z10));
                return;
        }
    }
}
