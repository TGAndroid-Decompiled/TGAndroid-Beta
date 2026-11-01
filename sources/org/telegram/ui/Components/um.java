package org.telegram.ui.Components;
public final class um implements org.telegram.messenger.r20 {
    public final int f31039a;
    public final org.telegram.messenger.r20 f31040b;

    public um(org.telegram.messenger.r20 r20Var, int i10) {
        this.f31039a = i10;
        this.f31040b = r20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f31039a) {
            case 0:
                this.f31040b.a(new jh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f31040b.a(Boolean.valueOf(z10));
                return;
        }
    }
}
