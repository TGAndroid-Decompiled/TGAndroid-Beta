package org.telegram.ui.Components;
public final class um implements org.telegram.messenger.z10 {
    public final int f40107a;
    public final org.telegram.messenger.z10 f40108b;

    public um(org.telegram.messenger.z10 z10Var, int i7) {
        this.f40107a = i7;
        this.f40108b = z10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f40107a) {
            case 0:
                this.f40108b.a(new th.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f40108b.a(Boolean.valueOf(z10));
                return;
        }
    }
}
