package org.telegram.ui.Components;
public final class lm implements org.telegram.messenger.c20 {
    public final int f35695a;
    public final org.telegram.messenger.c20 f35696b;

    public lm(org.telegram.messenger.c20 c20Var, int i7) {
        this.f35695a = i7;
        this.f35696b = c20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f35695a) {
            case 0:
                this.f35696b.a(new th.e((String) obj));
                return;
            default:
                int[] iArr = (int[]) obj;
                boolean z9 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z9 = true;
                }
                this.f35696b.a(Boolean.valueOf(z9));
                return;
        }
    }
}
