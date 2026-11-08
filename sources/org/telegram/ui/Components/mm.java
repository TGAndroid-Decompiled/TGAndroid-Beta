package org.telegram.ui.Components;
public final class mm implements org.telegram.messenger.c20 {
    public final int f35999a;
    public final org.telegram.messenger.c20 f36000b;

    public mm(org.telegram.messenger.c20 c20Var, int i7) {
        this.f35999a = i7;
        this.f36000b = c20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f35999a) {
            case 0:
                this.f36000b.a(new th.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z9 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z9 = true;
                }
                this.f36000b.a(Boolean.valueOf(z9));
                return;
        }
    }
}
