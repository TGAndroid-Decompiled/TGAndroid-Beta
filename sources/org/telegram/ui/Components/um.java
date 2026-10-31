package org.telegram.ui.Components;
public final class um implements org.telegram.messenger.q20 {
    public final int f30992a;
    public final org.telegram.messenger.q20 f30993b;

    public um(org.telegram.messenger.q20 q20Var, int i10) {
        this.f30992a = i10;
        this.f30993b = q20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f30992a) {
            case 0:
                this.f30993b.a(new jh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f30993b.a(Boolean.valueOf(z10));
                return;
        }
    }
}
