package org.telegram.ui.Components;
public final class lm implements org.telegram.messenger.u10 {
    public final int f35791a;
    public final org.telegram.messenger.u10 f35792b;

    public lm(org.telegram.messenger.u10 u10Var, int i3) {
        this.f35791a = i3;
        this.f35792b = u10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f35791a) {
            case 0:
                this.f35792b.a(new uh.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z10 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z10 = true;
                }
                this.f35792b.a(Boolean.valueOf(z10));
                return;
        }
    }
}
