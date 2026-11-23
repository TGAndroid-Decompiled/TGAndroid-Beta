package org.telegram.ui.Components;
public final class bn implements org.telegram.messenger.w10 {
    public final int f33771a;
    public final org.telegram.messenger.w10 f33772b;

    public bn(org.telegram.messenger.w10 w10Var, int i7) {
        this.f33771a = i7;
        this.f33772b = w10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f33771a) {
            case 0:
                this.f33772b.a(new th.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f33772b.a(Boolean.valueOf(z10));
                return;
        }
    }
}
