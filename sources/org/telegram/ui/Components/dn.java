package org.telegram.ui.Components;
public final class dn implements org.telegram.messenger.y10 {
    public final int f34496a;
    public final org.telegram.messenger.y10 f34497b;

    public dn(org.telegram.messenger.y10 y10Var, int i7) {
        this.f34496a = i7;
        this.f34497b = y10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f34496a) {
            case 0:
                this.f34497b.a(new th.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f34497b.a(Boolean.valueOf(z10));
                return;
        }
    }
}
