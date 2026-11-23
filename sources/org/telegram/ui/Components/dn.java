package org.telegram.ui.Components;
public final class dn implements org.telegram.messenger.y10 {
    public final int f34534a;
    public final org.telegram.messenger.y10 f34535b;

    public dn(org.telegram.messenger.y10 y10Var, int i7) {
        this.f34534a = i7;
        this.f34535b = y10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f34534a) {
            case 0:
                this.f34535b.a(new th.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f34535b.a(Boolean.valueOf(z10));
                return;
        }
    }
}
