package org.telegram.ui.Components;
public final class mm implements org.telegram.messenger.c20 {
    public final int f35955a;
    public final org.telegram.messenger.c20 f35956b;

    public mm(org.telegram.messenger.c20 c20Var, int i7) {
        this.f35955a = i7;
        this.f35956b = c20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f35955a) {
            case 0:
                this.f35956b.a(new th.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z9 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z9 = true;
                }
                this.f35956b.a(Boolean.valueOf(z9));
                return;
        }
    }
}
